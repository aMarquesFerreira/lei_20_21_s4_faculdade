/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.backoffice.console;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author andre
 */
public class Server {
    
    public static void main(String[] args) {
        
        try {
            HttpServer server = HttpServer.create();
            server.bind(new InetSocketAddress("127.0.0.1", 8000), 8000);
            server.createContext("/teste", new TestHandlerRespondWithString());
            server.createContext("/dashboard", new TestHandlerRespondWithFile());
            
            server.createContext("/stats/catalogs", new CatalogsHandlerRespondWithString());
            server.setExecutor(null); 
            server.start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static class TestHandlerRespondWithString implements HttpHandler {
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
    
    static class TestHandlerRespondWithFile implements HttpHandler {
       @Override
       public void handle(HttpExchange t) throws IOException {
           
           InputStream is = t.getRequestBody(); //post data, vazio se fro um GET
           byte[] buffer = new byte[4096];
           int n = is.read(buffer); 
           if (n>0){
               String s = new String(buffer, 0, n);
               System.out.println("Recebido: " + s);
           }
           
           //para transferir um ficheiro:
           long size = Files.size(Paths.get("C:\\Users\\andre\\Desktop\\app\\html\\dashboard.html"));
           t.setAttribute("Content-type", "Text/Html");
           t.sendResponseHeaders(200, size);
           OutputStream os = t.getResponseBody();
           FileInputStream fis = new FileInputStream("C:\\Users\\andre\\Desktop\\app\\html\\dashboard.html");
           while ((n=fis.read(buffer))>0){
               os.write(buffer,0,n);
           }
           os.close();
           fis.close();
       }
   }

    
    static class CatalogsHandlerRespondWithString implements HttpHandler {
       @Override
       public void handle(HttpExchange t) throws IOException {
           
           InputStream is = t.getRequestBody(); //post data, vazio se fro um GET
           byte[] buffer = new byte[1024];
           int n = is.read(buffer); 
           if (n>0){
               String s = new String(buffer, 0, n);
               System.out.println("Recebido: " + s);
           }
           
           String response = "{\"num_catalogs\":\"23\"}";
           t.sendResponseHeaders(200, response.length());
           OutputStream os = t.getResponseBody();
           os.write(response.getBytes());
           os.close();
       }
    }
    
    
}
