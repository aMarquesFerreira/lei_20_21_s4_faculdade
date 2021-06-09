/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.other.console;

import eapli.base.sdp2021.Sdp2021;
import eapli.base.sdp2021.Sdp2021Message;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.bridge.Message;

/**
 *
 * @author andre
 */
public class TcpServerThread implements Runnable {

    private final Socket cliSock;
    private static final int VERSAO = 0;

    public TcpServerThread(Socket cliSock) {
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
                        Sdp2021Message response = processMessage(request);
                        sdp.writeMessage(response, sOut);
                        break;
                }
            }
            cliSock.close();
        } catch (IOException ex) {
            System.out.println("IOException");
        } catch (Exception ex) {
            Logger.getLogger(TcpServerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }




    private Sdp2021Message processMessage(Sdp2021Message message) throws IOException {
        if (message.getCodigo()==10){//pedidos stats
            String stat = new String(message.getDados());
            
            switch (stat){
                case "STATS_CATALOG":
                    
                    Sdp2021Message response = new Sdp2021Message(Sdp2021.VERSION, (byte)11, "53".getBytes());
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
                    return response;
            }
            
            
        }
        
        
        
        
        
        return null;
    }

}
