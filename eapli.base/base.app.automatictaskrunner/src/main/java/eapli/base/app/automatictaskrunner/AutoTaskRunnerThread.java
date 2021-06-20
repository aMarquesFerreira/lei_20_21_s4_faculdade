/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.automatictaskrunner;

import static eapli.base.ANTLR.src.AutomaticTaskEmail.sendEmail;
import eapli.base.sdp2021.Sdp2021;
import eapli.base.sdp2021.Sdp2021Message;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

/**
 *
 * @author andre
 */
public class AutoTaskRunnerThread implements Runnable {

    private final Socket cliSock;
    private static final int VERSAO = 0;
   // private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();

    public AutoTaskRunnerThread(Socket cliSock) {
        this.cliSock = cliSock;
        
        System.out.println("Accepted Connection from " + cliSock.getInetAddress().toString());
    }

    @Override
    public void run(){
        Sdp2021 sdp = new Sdp2021();
        
        InetAddress clientIP;
        clientIP = cliSock.getInetAddress();
        System.out.println("New client connection from " + clientIP.getHostAddress()
                + ", port number " + cliSock.getPort());
        
        try {
            boolean terminate=false;
            while(!terminate){
                DataOutputStream sOut = new DataOutputStream(cliSock.getOutputStream());
                DataInputStream sIn = new DataInputStream(cliSock.getInputStream());

                Sdp2021Message request = sdp.readMessage(sIn);

                switch(request.getCodigo()){
                    case Sdp2021.MESSAGE_TEST:
                        sdp.writeUnderstood(sOut);
                        break;
                    case Sdp2021.MESSAGE_END:
                        sdp.writeUnderstood(sOut);
                        terminate=true;
                        break;
                        
                    case 5: //test 1000
                        request.getDados()[500]=5;
                        sdp.writeMessage(request, sOut);
                        break;
                        
                    case 20: //envio email
                        //request.getDados()[500]=5;
                        Sdp2021Message response = processSendMail(request);
                        sdp.writeMessage(response, sOut);
                        break;
                        
                        
                    default:
                        //Sdp2021Message response = processMessage(request);
                        sdp.writeUnderstood(sOut);
                        break;
                }
            }
            cliSock.close();
        } catch (IOException ex) {
            System.out.println("IOException");
        } catch (Exception ex) {
            Logger.getLogger(AutoTaskRunnerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }




    private Sdp2021Message processMessage(Sdp2021Message message) throws IOException { //LE SCRIPT
      
        if (message.getCodigo()==10){//pedidos stats
            String stat = new String(message.getDados());
            
            //recebe STATS_ACTIVITIES:userId
            if (stat.startsWith("STATS_ACTIVITIES:")){
                String userId = stat.substring(17);
                
                    //STATS_ACTIVITIES:isep959
                    //Sdp2021Message response = new Sdp2021Message(Sdp2021.VERSION, (byte)11, "53".getBytes());
                    /*
                    
                    ByteArrayOutputStream bos = new ByteArrayOutputStream();
                    ObjectOutputStream out = new ObjectOutputStream(bos);   
                    out.write(53);
                    out.write(53);
                    out.write(53);
                    out.flush();
                    bos.flush();
                    Sdp2021Message response = new Sdp2021Message(Sdp2021.VERSION, (byte)11, bos.toByteArray());
                    */
                    //Colaborator c1 = colabRepo.findByMecanographicNumber(MecanographicNumber.valueOf(userId)).get();
                    
                    /*Sdp2021Message response = new Sdp2021Message(Sdp2021.VERSION, (byte)11, "something".getBytes());
                    
                    return response;*/
            }
            /*else if (){
                
            }*/
            
            
        }
        
        
        
        Sdp2021Message response = new Sdp2021Message(Sdp2021.VERSION, (byte)11, "something".getBytes());
                    
        return response;
        
        //return null;
    

    }

    private Sdp2021Message processSendMail(Sdp2021Message request) {
        
        System.out.println("SendEmail: " + new String(request.getDados()));
        String s = new String(request.getDados());
        s=s.replace("\\r\\n","\\n");
        s=s.replace("\\r","\\n");

        String subject = "";
        String body = "";
        String from = "";
        String to = "";
        String script = "";
        
        
        String[] lines = s.split("\\n");
        for(String line: lines){
            if (line.startsWith("from: "))
                from = line.substring(6);
            else if (line.startsWith("to: "))
                to = line.substring(4);
            else if (line.startsWith("subject: "))
                subject = line.substring(9);
            else if (line.startsWith("script: "))
                script = line.substring(8);
            else if (line.startsWith("body:"))
                body = line.substring(5);
        }
        
        Session session = criarSessionMail();

        //sendEmail("antmen132@gmail.com"/*from*/, to, subject, body, session);
        
        Sdp2021Message response = new Sdp2021Message(Sdp2021.VERSION, (byte)20, "Email Sent".getBytes());
        
        return response;
    }

    public static Session criarSessionMail() {
        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        //props.put("mail.smtp.socketFactory.port", 465);
        //props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.ssl.enable", true);
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.port", 465);

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("antmen132@gmail.com", "laprevida");
            }
        });

        session.setDebug(true);

        return session;
    }
    
    
    
}
