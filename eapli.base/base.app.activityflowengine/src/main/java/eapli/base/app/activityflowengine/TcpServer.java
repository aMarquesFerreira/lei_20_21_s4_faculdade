/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.activityflowengine;

import eapli.base.sdp2021.Sdp2021;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
class TcpServer extends Thread{
    //static ServerSocket sock;
    
    //static final int SERVER_PORT = 32507;
    //static final String TRUSTED_STORE = "server_mfa.jks";
    //static final String KEYSTORE_PASS = "forgotten";

    public static void xxmain(String[] args) throws IOException {
        System.out.println("TEST");
        
        //SSLServerSocket sock = null;
	//Socket cliSock;
        /*
        // Trust these certificates provided by authorized clients
        System.setProperty("javax.net.ssl.trustStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.trustStorePassword",KEYSTORE_PASS);

         // Use this certificate and private key as server certificate
         System.setProperty("javax.net.ssl.keyStore",TRUSTED_STORE);
         System.setProperty("javax.net.ssl.keyStorePassword",KEYSTORE_PASS);
        */
        //SSLServerSocketFactory sslF = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
        
       
        new TcpServer().start();
            //sock = (SSLServerSocket) sslF.createServerSocket(SERVER_PORT);
            //sock.setNeedClientAuth(true);
            //System.out.println("Server failed to open local port " + SERVER_PORT);
           // System.exit(1);
         /*while(true){
            cliSock=sock.accept();
            new Thread(new TcpServerThread(cliSock)).start();
        }*/
    }
    
    
    @Override
    public void run() {
        
        
        /*// Trust these certificates provided by authorized clients
        System.setProperty("javax.net.ssl.trustStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.trustStorePassword",KEYSTORE_PASS);

        // Use this certificate and private key as server certificate
        System.setProperty("javax.net.ssl.keyStore",TRUSTED_STORE);
        System.setProperty("javax.net.ssl.keyStorePassword",KEYSTORE_PASS);
        */
        
        Socket cliSock;
        SSLServerSocket sock = null;
        SSLServerSocketFactory sslF = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
        
        try {
            //sock = new ServerSocket(Sdp2021.SDP2021_PORT);
            sock = (SSLServerSocket) sslF.createServerSocket(Sdp2021.SDP2021_PORT_AFM);
            sock.setNeedClientAuth(true);

            while (true) {
                cliSock = sock.accept();
                new Thread(new TcpServerThread(cliSock)).start();
            }

        } catch (IOException ex) {
            System.out.println("Failed to open server socket");
            System.exit(1);
        }
    }
}
