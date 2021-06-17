/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.automatictaskrunner;

import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.sdp2021.Sdp2021;
import eapli.base.sdp2021.Sdp2021Message;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
public class AutoTaskRunnerThread implements Runnable {

    private final Socket cliSock;
    private static final int VERSAO = 0;
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();

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
                        
                        
                    default:
                        /*Sdp2021Message response = processMessage(request);
                        sdp.writeMessage(response, sOut);*/
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




//    private Sdp2021Message processMessage(Sdp2021Message message) throws IOException {
//        if (message.getCodigo()==10){//pedidos stats
//            String stat = new String(message.getDados());
//            
//            //recebe STATS_ACTIVITIES:userId
//            if (stat.startsWith("STATS_ACTIVITIES:")){
//                String userId = stat.substring(17);
//                
//                    //STATS_ACTIVITIES:isep959
//                    //Sdp2021Message response = new Sdp2021Message(Sdp2021.VERSION, (byte)11, "53".getBytes());
//                    /*
//                    
//                    ByteArrayOutputStream bos = new ByteArrayOutputStream();
//                    ObjectOutputStream out = new ObjectOutputStream(bos);   
//                    out.write(53);
//                    out.write(53);
//                    out.write(53);
//                    out.flush();
//                    bos.flush();
//                    Sdp2021Message response = new Sdp2021Message(Sdp2021.VERSION, (byte)11, bos.toByteArray());
//                    */
//                    Colaborator c1 = colabRepo.findByMecanographicNumber(MecanographicNumber.valueOf(userId)).get();
//                    
//                    Sdp2021Message response = new Sdp2021Message(Sdp2021.VERSION, (byte)11, fetcher.activityFetchAsJson(c1).getBytes());
//                    
//                    return response;
//            }
//           
//            
//            
//        }
//        
//        
//        
//        
//        
//        return null;
//    }

    
}
