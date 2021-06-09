/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.other.console;

import eapli.base.sdp2021.Sdp2021;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
class TcpServer {
    static ServerSocket sock;

    public static void main(String[] args) {
        System.out.println("TEST");
        
        try {
            new TcpServer().run();
        } catch (IOException ex) {
            Logger.getLogger(TcpServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void run() throws IOException {
        Socket cliSock;
        try {
            sock = new ServerSocket(Sdp2021.SDP2021_PORT);
        } catch (IOException ex) {
            System.out.println("Failed to open server socket");
            System.exit(1);
        }
        while (true) {
            cliSock = sock.accept();
            new Thread(new TcpServerThread(cliSock)).start();
        }
    }
}
