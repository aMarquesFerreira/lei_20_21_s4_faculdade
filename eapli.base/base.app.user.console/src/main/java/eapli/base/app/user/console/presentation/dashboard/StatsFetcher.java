/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.user.console.presentation.dashboard;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import eapli.base.sdp2021.Sdp2021;
import eapli.base.sdp2021.Sdp2021Message;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author andre
 */
public class StatsFetcher {

    public static String getStatsActivities(DataInputStream dis, DataOutputStream dos, String userId) {
        Sdp2021 sdp = new Sdp2021();        
        //criar uma mensagem para pedir stats catalogos
        String response = null;
        try {
            String request = "STATS_ACTIVITIES:"+userId;
            
            Sdp2021Message m = new Sdp2021Message(Sdp2021.VERSION, (byte) 10, request.getBytes());
            sdp.writeMessage(m, dos);
            m = sdp.readMessage(dis);
            byte codigo = m.getCodigo();
            
            if (codigo == 11/*10*//*3*/) { //OK

                response = new String(m.getDados());

            } else {
                String erro = new String(m.getDados());
                response = "{\"error\":\"" + erro + "\"}";
            }
        } catch (Exception ex) {
            
        }

        return response;
    }
}