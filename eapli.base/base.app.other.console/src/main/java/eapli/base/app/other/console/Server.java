/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.other.console;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import java.io.*; 
import java.net.*; 

import java.net.ServerSocket;
import java.net.Socket;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;

/**
 *
 * @author Omen
 */
public class Server {

    static ServerSocket sock;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Socket cliSock;

        try {
            sock = new ServerSocket(9999);
        } catch (IOException ex) {
            System.out.println("Failed to open server socket");
            System.exit(1);
        }

        while (true) {
            cliSock = sock.accept();
            new Thread(new TcpSrvThread(cliSock)).start();
        }
    }
}
    
class TcpSrvThread implements Runnable {

    private Socket s;
    private DataOutputStream sOut;
    private DataInputStream sIn;

    public TcpSrvThread(Socket cli_s) {
        s = cli_s;
    }

    public void run() {
        long f, i, num, sum;
        InetAddress clientIP;

        clientIP = s.getInetAddress();
        System.out.println("New client connection from " + clientIP.getHostAddress() + ", port number " + s.getPort());
        try {
            sOut = new DataOutputStream(s.getOutputStream()); // Response FROM the server
            sIn = new DataInputStream(s.getInputStream()); // Contents FROM the client
//            do {
//                sum = 0;
//                do {
//                    num = 0;
//                    f = 1;
//                    for (i = 0; i < 4; i++) {
//                        num = num + f * sIn.read();
//                        f = f * 256;
//                    }
//                    sum = sum + num;
//                } while (num > 0);
//                num = sum;
//                for (i = 0; i < 4; i++) {
//                    sOut.write((byte) (num % 256));
//                    num = num / 256;
//                }
//            } while (sum > 0);

            System.out.println("\n--- SERVER TESTING PURPOSES ---\n" + sIn + "\n");
            sOut.writeBytes("\n---TESTING DONE ---\n");
            System.out.println("\nSERVER OUTPUT FINISHED\n");
            System.out.println("Client " + clientIP.getHostAddress() + ", port number: " + s.getPort() + " disconnected");
            s.close();
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }
}
