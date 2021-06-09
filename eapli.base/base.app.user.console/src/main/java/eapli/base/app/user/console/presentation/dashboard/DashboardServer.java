/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.user.console.presentation.dashboard;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import eapli.base.sdp2021.Sdp2021;
import eapli.base.sdp2021.Sdp2021Message;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author andre
 */
public class DashboardServer {
    private static DashboardServer instance;
    private HttpServer server = null;
    private Socket motorFluxoClient;
    private DataOutputStream dos;    
    private DataInputStream dis;
            

    private final String motorFluxoServerAddress;
    private Sdp2021 sdp;
    
    private DashboardServer(String motorFluxoServerAddress){
        this.motorFluxoServerAddress = motorFluxoServerAddress;
    }
    
    static DashboardServer getInstance(String motorFluxoServerAddress){
        if (instance==null)
            instance=new DashboardServer(motorFluxoServerAddress);
        
        return instance;
    }
    
    public void start() {
        if (server!=null){
            System.out.println("Dashboard Server already running");
            return;
        }
        
        try {
            //inicia conexao Sdp
            motorFluxoClient = new Socket(motorFluxoServerAddress, Sdp2021.SDP2021_PORT);
            dos = new DataOutputStream(motorFluxoClient.getOutputStream());
            dis = new DataInputStream(motorFluxoClient.getInputStream());
            
            sdp = new Sdp2021();
                    /*
                            System.out.println("Send TEST to motor server");
                            sdp.writeTest(dos);

                            Sdp2021Message response = sdp.readMessage(dis);
                            System.out.println("Received responde from motor server: " + response);

                            byte[] testData = new byte[1000];
                            for(int i=0;i<1000;i++)
                                testData[i]=(byte)(i%255);

                            sdp.writeMessage(new Sdp2021Message(Sdp2021.VERSION, (byte)5, testData), dos);

                            response = sdp.readMessage(dis);
                            System.out.println(response.dados().length);
                            System.out.println("byte 500= " + response.dados()[500]);
                    */
            
            
            
        } catch (IOException ex) {
            System.out.println("Error connecting to motorServer");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Error in communication with motorServer");
            ex.printStackTrace();
        }
        
        
        //inicia server http
        try {
            server = HttpServer.create();
            server.bind(new InetSocketAddress("127.0.0.1", 8000), 8000);
            //server.createContext("/teste", new TestHandlerRespondWithString());
            server.createContext("/dashboard", new TestHandlerRespondWithFile());
            
            server.createContext("/stats/catalogs", new CatalogsHandlerRespondWithString());
            server.setExecutor(null); 
            server.start();
        } catch (IOException ex) {            
            ex.printStackTrace();
        }
    }
    
    public void stop() {
        if (server==null){
            System.out.println("Dashboard Server not running");
            return;
        }
        
        server.stop(30);
        
        server = null;
        
        try {
            System.out.println("Terminating SDP Client");
            sdp.writeEnd(dos);
            
            motorFluxoClient.close();
        } catch (Exception ex) {
            Logger.getLogger(DashboardServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    class TestHandlerRespondWithString implements HttpHandler {
       @Override
       public void handle(HttpExchange t) throws IOException {
           
           InputStream is = t.getRequestBody(); //post data, vazio se fro um GET
           byte[] buffer = new byte[1024];
           int n = is.read(buffer); 
           if (n>0){
               String s = new String(buffer, 0, n);
               System.out.println("Recebido: " + s);
           }
           
           String response = "This is the response";
           t.sendResponseHeaders(200, response.length());
           OutputStream os = t.getResponseBody();
           os.write(response.getBytes());
           os.close();
       }
    }
    
    class TestHandlerRespondWithFile implements HttpHandler {
       @Override
       public void handle(HttpExchange t) throws IOException {
           
           InputStream is = t.getRequestBody(); //post data, vazio se fro um GET
           byte[] buffer = new byte[4096];
           int n = is.read(buffer); 
           if (n>0){
               String s = new String(buffer, 0, n);
               System.out.println("Recebido: " + s);
           }
           
           //para ver onde fica o ficheiro
           /*List<String>lines=new ArrayList<>();lines.add("popo");
           Files.write(Paths.get("lixo.txt"), lines, StandardOpenOption.CREATE_NEW);*/
           
           //para transferir um ficheiro:
           //long size = Files.size(Paths.get("C:\\Users\\andre\\Desktop\\app\\html\\dashboard.html"));
           long size = Files.size(Paths.get("dashboard.html"));
           t.setAttribute("Content-type", "Text/Html");
           t.sendResponseHeaders(200, size);
           OutputStream os = t.getResponseBody();
           //FileInputStream fis = new FileInputStream("C:\\Users\\andre\\Desktop\\app\\html\\dashboard.html");
           FileInputStream fis = new FileInputStream("dashboard.html");
           while ((n=fis.read(buffer))>0){
               os.write(buffer,0,n);
           }
           os.close();
           fis.close();
       }
   }

    
    class CatalogsHandlerRespondWithString implements HttpHandler {
       @Override
       public void handle(HttpExchange t) throws IOException {
           
           InputStream is = t.getRequestBody(); //post data, vazio se fro um GET
           byte[] buffer = new byte[1024];
           int n = is.read(buffer); 
           if (n>0){
               String s = new String(buffer, 0, n);
               System.out.println("Recebido: " + s);
           }
           
           
           //criar uma mensagem para pedir stats catalogos
           String response=null;
           try {
               Sdp2021Message m = new Sdp2021Message(Sdp2021.VERSION, (byte)10, "STATS_CATALOG".getBytes());
               sdp.writeMessage(m, dos);
               m = sdp.readMessage(dis);
               if (m.getCodigo()==11){ //OK
                   
                   /*ByteArrayInputStream bis = new ByteArrayInputStream(m.getDados());
                   
                   ObjectInput in = new ObjectInputStream(bis);
                   
                   int numCatalogs = in.readInt();*/
                   
                   int numCatalogs = Integer.parseInt(new String(m.getDados()));
                   
                   response = "{\"num_catalogs\":\""+ numCatalogs +"\"}";
               }else{
                   String erro = new String(m.getDados());
                   response = "{\"error\":\""+erro+"\"}";
               }
           } catch (Exception ex) {
               Logger.getLogger(DashboardServer.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           t.sendResponseHeaders(200, response.length());
           OutputStream os = t.getResponseBody();
           os.write(response.getBytes());
           os.close();
       }
    }
    
    
}
