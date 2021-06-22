/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.app.activityflowengine;

import eapli.base.activityflowengine.control.ActivityDistribution1;
import eapli.base.activitymanagement.domain.ActivityExecution;
import eapli.base.app.activityflowengine.algorithms.AssignColaboratorAlgorithm;
import eapli.base.activitymanagement.dto.TicketActivityExecutionDto;
import eapli.base.activitymanagement.repositories.ActivityExecutionRepository;
import eapli.base.app.activityflowengine.algorithms.AlgorithmFCFS1;
import eapli.base.app.activityflowengine.algorithms.AlgorithmTaskLoad1;
import eapli.base.app.activityflowengine.algorithms.ServerSelectionAlgorithm;
import eapli.base.app.activityflowengine.client.ClientSSL;
import eapli.base.app.activityflowengine.client.ClientSSLMain;
import eapli.base.app.activityflowengine.client.InitializeConnectionAction;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.formmanagement.domain.FormAnswer;
import eapli.base.formmanagement.domain.FormParameterAnswer;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.sdp2021.Sdp2021;
import eapli.base.sdp2021.Sdp2021Message;
import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.domain.TeamCode;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.base.ticketmanagement.repositories.TicketRepository;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/**
 *
 * @author Paulo Gandra Sousa
 */
@SuppressWarnings("squid:S106")
public final class ActivityFlowEngineMain {
   
    private static ServerSelectionAlgorithm serverAlgorithm;
    private static AssignColaboratorAlgorithm assignAlgorithm;
    private static TeamRepository teamRepo = PersistenceContext.repositories().teams();
    private static ActivityExecutionRepository actExecRepo = PersistenceContext.repositories().activityExecutions();
    private static ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    private static final String KEYSTORE_PASS = "forgotten";
    
    /**
     * Empty constructor is private to avoid instantiation of this class.
     */
    private ActivityFlowEngineMain() {
    }
    
    
    public static void main(final String[] args) throws FileNotFoundException, IOException {
        
        
        System.setProperty("javax.net.ssl.trustStore", "server_mfa.jks");
        System.setProperty("javax.net.ssl.trustStorePassword",KEYSTORE_PASS);

        // Use this certificate and private key for client certificate when requested by the server
        System.setProperty("javax.net.ssl.keyStore", "server_mfa.jks");
        System.setProperty("javax.net.ssl.keyStorePassword",KEYSTORE_PASS);
        
        
        Properties properties = new Properties();
        properties.load(new FileReader("application.properties"));
        
        
        System.out.println("======================================");
        System.out.println("Motor de fluxo Actividades");
        System.out.println("(C) 2016, 2017, 2018, 2019, 2020, 2021");
        System.out.println("======================================");
/*
        AuthzRegistry.configure(PersistenceContext.repositories().users(),
                new BasePasswordPolicy(), new PlainTextEncoder());

        // login and go to main menu
        if (new LoginAction(BaseRoles.CASHIER).execute()) {
            final MainMenu menu = new MainMenu();
            menu.mainLoop();
        }*/

        // Algorithm 1 = FCFS, 2 = task time
        int algo = 1;
        /*if(algo == 1){
//            AlgorithmFCFS fcfs = new AlgorithmFCFS();
//            fcfs.execute();
        }*/
        //for the dashboard client
        TcpServer tcpServer = new TcpServer();
        
        tcpServer.start();
        
        
        
        //Funciona desta forma
        //InitializeConnectionAction ic = new InitializeConnectionAction();
        //ic.execute();
        //Funciona desta forma
        
        
//        ///SIMULAÇÃO (APAGAR)
//        
//        AssignActivityToColabSimulation aac = new AssignActivityToColabSimulation();
//        aac.execute();
//
//
//        ///SIMULAÇÃO (APAGAR)

        //ler da configuracao qual o algoritmo a usar
        String algorithm = properties.getProperty("colaborator_assignment_algorithm");
        //COLABS
        switch(algorithm){
            case "fcfs":
                assignAlgorithm = new AlgorithmFCFS1();
                break;
            case "taskload": 
                assignAlgorithm = new AlgorithmTaskLoad1();
                break;
        }
        ////TESTAR ALGORITMOS
        
/*
        AlgorithmTaskLoad1 atl = new AlgorithmTaskLoad1();
        Team team1 = teamRepo.findByTeamCode(TeamCode.valueOf("001")).get();
        Colaborator colab = atl.nextLowestWork(team1);
        ActivityDistribution1 ad = new ActivityDistribution1();
        DataBaseFetcher dbf = new DataBaseFetcher();
        List<ActivityExecution> list = dbf.activitiesExecutionFetchAsList();
        for(ActivityExecution acexec : list){
            if()
        }
        ad.assignActivityToColab(colab, actExec);
        
*/
        ////TESTAR ALGORITMOS
        
        //task runner servers
        String servers = properties.getProperty("executor_servers");
        String[] srvs = servers.split(";");

        String selectionAlgorithm = properties.getProperty("server_selection_algorithm");
        
        //SERVERS
        switch(selectionAlgorithm){
            case "fcfs":
                serverAlgorithm = new SelectionAlgorithmFCFS(srvs);
                break;
            case "taskload": //TODO
                serverAlgorithm = new SelectionAlgorithmTaskLoad(srvs);
                break;
        }
        
        while(true){
            
            assignManualTasks(); 
            
            executeAutomaticTasks();
            try{    
                Thread.sleep(1000);
            }catch(Exception ex){
            }
            
        }
        
        // exiting the application, closing all threads
        //System.exit(0);
             
        
        
    }
    
    //----------------------------------//
    
    static List<TicketActivityExecutionDto> running1 = new ArrayList<>();
    static List<Colaborator> listColabs = new ArrayList<>();
    
    private static void assignManualTasks() {
        
       Iterable<ActivityExecution> activities = actExecRepo.findAll();
       ActivityDistribution1 assignActivityToColab = new ActivityDistribution1();
       //AlgorithmFCFS1 fcfs = new AlgorithmFCFS1();
       Team team = teamRepo.findByTeamCode(TeamCode.valueOf("001")).get();
       
        for (ActivityExecution actExec : activities) {   
            if (actExec.getColaborator()==null){
                Colaborator colab = assignAlgorithm.next(team);
                assignActivityToColab.assignActivityToColab(colab, actExec);
                System.out.println("activity assigned to " + colab.identity().toString());
            }
        }
    
    }
    
    //----------------------------------//
    
    
    static TicketRepository ticketRepo = PersistenceContext.repositories().tickets();

    static List<TicketActivityExecutionDto> running = new ArrayList<>();
    
    

    public static void signalExecuted(TicketActivityExecutionDto activity){
        activity.activityExecution.statusDone();
        actExecRepo.save(activity.activityExecution);
        synchronized(running){
            running.remove(activity);
        }
    }
    

    private static void executeAutomaticTasks() {
        
        Iterable<TicketActivityExecutionDto> activities = ticketRepo.findAutomaticActivities();
        
        for (TicketActivityExecutionDto activity : activities) {   
            
            synchronized(running){
                if (running.contains(activity))
                    continue;

                running.add(activity);
            }
            
            String scriptType = activity.activityExecution.getActivity().description().toString();
            String script=null;
            switch(scriptType){
                case "Enviar Email":
                    script = buildEmailScript(activity);
                    break;
            }
            if (script!=null)
                executeScript(script, activity);
        }
    }

    private static String buildEmailScript(TicketActivityExecutionDto activity) {
        //build a message with the script and send it to executor
        FormAnswer form = activity.previousActivityExecution.getFormAnswer();
        
        String script ="";
        
        /*script += "script: sendmail\n";
        script += "from: "+ activity.ticket.formAnswer().colaborator().user().email() +"\n";
        script += "to: "+ activity.ticket.booker().user().email() +"\n";
        script += "subject: Ticket Closed\n"; //exemplo!!!!!!
        script += "body: \n"; //exemplo!!!!!!*/
        
        //script += "script: sendmail\n";
        script += "from: "+ activity.ticket.formAnswer().colaborator().user().email() +"\n";
        //script += "to: "+ activity.ticket.booker().user().email() +"\n";
        script += "to: "+ activity.ticket.booker().user().email() +"\n";
        script += "script: Recusado Nao Pode 20% 0\n";
        script += "subject: Resposta ao Pedido\n"; 
        script += "body: \n"; 
        for (FormParameterAnswer fpa : form.getFormParameters()) {
            script += fpa.formParameter().description()+": " + fpa.answer() + "\n"; 
        }
                
        return script;
    }

    private static void executeScript(String script, TicketActivityExecutionDto activity) {
        
        
        String server = serverAlgorithm.getServer();
        System.out.println("Selected Server: " + server);
        //String server = "127.0.0.1";
        Sdp2021Message msg = new Sdp2021Message(Sdp2021.VERSION, (byte)20, script.getBytes());
        
        ClientSSL client = new ClientSSL(server, msg, activity);
        
        client.start();
    }

    
}
