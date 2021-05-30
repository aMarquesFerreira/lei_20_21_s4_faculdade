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
import java.net.Socket;
import java.util.Arrays;

/**
 *
 * @author andre
 */
public class TcpServerThread implements Runnable {

    private final Socket cliSock;
    private static final int VERSAO = 0;

    public TcpServerThread(Socket cliSock) {
        this.cliSock = cliSock;
    }

    @Override
    public void run(){
        long f, i, num, sum;
        InetAddress clientIP;
        clientIP = cliSock.getInetAddress();
        System.out.println("New client connection from " + clientIP.getHostAddress()
                + ", port number " + cliSock.getPort());
        
        byte[] buffer = new byte[258];
        byte[] data = new byte[0];
        try {
            DataOutputStream sOut = new DataOutputStream(cliSock.getOutputStream());
            DataInputStream sIn = new DataInputStream(cliSock.getInputStream());
            
            int size = sIn.read(buffer);
            int versao = buffer[0];
            int codigo = buffer[1];
            int dataSize = buffer[2];
            data = addToData(data,buffer,3,dataSize);
            while (codigo==255){
                size = sIn.read(buffer);
                codigo = buffer[1];
                dataSize = buffer[2];
                data=addToData(data,buffer,3,dataSize);
            }
                
            //codigo tem o tipo de mensagem
            Mensagem resposta = processarMensagem(new Mensagem((byte) codigo, data));
            int sent = 0;
            
            while (resposta.dados().length-sent > 255){
                buffer = new byte[258];
                buffer[0]=VERSAO;                
                buffer[1]=(byte)255;
                buffer[2]=(byte)255;
            
                System.arraycopy(resposta.dados(), sent, buffer, 3, 255);
                sOut.write(buffer);
            }
            
            buffer = new byte[3+resposta.dados().length-sent];
            buffer[0]=VERSAO;
            buffer[1]=resposta.getCodigo();
            buffer[2]=(byte) (resposta.dados().length-sent);

            System.arraycopy(resposta.dados(), sent, buffer, 3, resposta.dados().length-sent);
            sOut.write(buffer);
            
            cliSock.close();
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }


    private byte[] addToData(byte[] data, byte[] buffer, int ofset, int dataSize) {
        byte[] newData = new byte[data.length+dataSize];
        
        System.arraycopy(data, 0, newData, 0, data.length);
        
        System.arraycopy(buffer, ofset, newData, data.length, dataSize);
        
        return newData;
    }

    private Mensagem processarMensagem(Mensagem mensagem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
