/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.sdp2021;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
public class Sdp2021 {
    
    public static final int SDP2021_PORT = 32507;
    
    public final static byte VERSION = 1;  
    public final static byte MESSAGE_TEST = 0;  
    public final static byte MESSAGE_END = 1;
    public final static byte MESSAGE_UNDERSTOOD = 2;  
    public final static byte MESSAGE_SEGMENT = (byte) 255;  
    
    
    public Sdp2021Message readMessage(InputStream is) throws Exception{
        byte[] buffer = new byte[258];
        byte[] data = new byte[0];
        try {
            int size = is.read(buffer);
            byte versao = buffer[0];
            byte codigo = buffer[1];
            byte dataSize = buffer[2];
            data = addToData(data,buffer,3,dataSize);
            while (codigo==MESSAGE_SEGMENT){
                size = is.read(buffer);
                codigo = buffer[1];
                dataSize = buffer[2];
                data=addToData(data,buffer,3,dataSize);
            }
                
            return new Sdp2021Message(versao, codigo, data);
        } catch (IOException ex) {
            throw new Exception("Communication error", ex);
        }
    }
    
    public void writeMessage(Sdp2021Message message, OutputStream os) throws Exception{
        try {
            byte[] buffer;
        
            int sent = 0;
            //send parts if bigger than 255
            while (message.getDados().length-sent > 255){
                buffer = new byte[258];
                buffer[0]=message.getVersao();                
                buffer[1]=(byte)MESSAGE_SEGMENT;
                buffer[2]=(byte)255;
            
                System.arraycopy(message.getDados(), sent, buffer, 3, 255);
                os.write(buffer);
                sent+=255;
            }
            //send final block
            buffer = new byte[3+message.getDados().length-sent];
            buffer[0]=message.getVersao();                
            buffer[1]=message.getCodigo();
            buffer[2]=(byte) (message.getDados().length-sent);

            System.arraycopy(message.getDados(), sent, buffer, 3, message.getDados().length-sent);
            os.write(buffer);
        } catch (IOException ex) {
            throw new Exception("Communication error", ex);
        }
    }
    
    private byte[] addToData(byte[] data, byte[] buffer, int ofset, byte dataSize) {
        byte[] newData = new byte[data.length+(((int)dataSize)&0xff)];
        
        System.arraycopy(data, 0, newData, 0, data.length);
        
        System.arraycopy(buffer, ofset, newData, data.length, ((int)dataSize)&0xff);
        
        return newData;
    }
    
    public void writeUnderstood(OutputStream os) throws Exception{
        writeMessage(new Sdp2021Message(VERSION, MESSAGE_UNDERSTOOD, new byte[0]), os);
    }
    
    public void writeTest(OutputStream os) throws Exception{
        writeMessage(new Sdp2021Message(VERSION, MESSAGE_TEST, new byte[0]), os);
    }

    public void writeEnd(OutputStream os) throws Exception{
        writeMessage(new Sdp2021Message(VERSION, MESSAGE_END, new byte[0]), os);
    }
}
