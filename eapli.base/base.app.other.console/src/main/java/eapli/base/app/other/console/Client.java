/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.other.console;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Omen
 */
public class Client {

    static InetAddress serverIP;
    static Socket sock;

    public void ClientClass(String args[]) throws Exception {
        if (args.length != 1) {
            System.out.println("Server IPv4/IPv6 address or DNS name is required as argument");
            System.exit(1);
        }

        try {
            serverIP = InetAddress.getByName(args[0]);
        } catch (UnknownHostException ex) {
            System.out.println("Invalid server specified: " + args[0]);
            System.exit(1);
        }

        try {
            sock = new Socket(serverIP, 9999);
        } catch (IOException ex) {
            System.out.println("Failed to establish TCP connection");
            System.exit(1);
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream sOut = new DataOutputStream(sock.getOutputStream());
        DataInputStream sIn = new DataInputStream(sock.getInputStream());

        byte[] bytes = new byte[1024];
        int n;
        while((n=sIn.read(bytes))>0){
            System.out.println(new String(bytes));
        }
        
        
        
        String frase;

        sOut.writeBytes("TEST STRING");
        
        
        
        System.out.println("\nCLIENT OUTPUT = " + sIn);
        sock.close();
    }

}
