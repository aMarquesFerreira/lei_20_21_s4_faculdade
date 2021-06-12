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

import java.io.*;
import java.net.*;
import java.security.KeyStore;
import javax.net.*;
import javax.net.ssl.*;
import javax.security.cert.X509Certificate;

/**
 *
 * @author Omen
 */
public class Client {

    static final int SERVER_PORT = 32507;
    static final String KEYSTORE_PASS = "forgotten";
    
    static InetAddress serverIP;
    //static Socket sock;
    static SSLSocket sock;

    public void ClientClass(String args[]) throws Exception {
        //if (args.length != 1) {
        if (args.length != 2) {
            System.out.println("Server IPv4/IPv6 address or DNS name is required as argument");
            System.out.println("Client name is required as second argument (a matching keystore must exist)");
            System.exit(1);
        }
        
        // Trust these certificates provided by servers
	System.setProperty("javax.net.ssl.trustStore", args[1]+".jks");
	System.setProperty("javax.net.ssl.trustStorePassword",KEYSTORE_PASS);

	// Use this certificate and private key for client certificate when requested by the server
	System.setProperty("javax.net.ssl.keyStore",args[1]+".jks");
    	System.setProperty("javax.net.ssl.keyStorePassword",KEYSTORE_PASS);

	SSLSocketFactory sf = (SSLSocketFactory) SSLSocketFactory.getDefault();

        try {
            serverIP = InetAddress.getByName(args[0]);
        } catch (UnknownHostException ex) {
            System.out.println("Invalid server specified: " + args[0]);
            System.exit(1);
        }

        try {
            //sock = new Socket(serverIP, 9999);
            sock = (SSLSocket) sf.createSocket(serverIP,SERVER_PORT);
        } catch (IOException ex) {
            //System.out.println("Failed to establish TCP connection");
            System.out.println("Failed to connect to: " + args[0] + ":" + SERVER_PORT);
            System.out.println("Application aborted.");
            System.exit(1);
        }
        
        System.out.println("Connected to: " + args[0] + ":" + SERVER_PORT);
        
        sock.startHandshake();

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
