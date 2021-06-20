/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.activityflowengine.client;

import eapli.base.sdp2021.Sdp2021;
import eapli.base.sdp2021.Sdp2021Message;
import eapli.framework.actions.Action;

/**
 *
 * @author andre
 */
public class InitializeConnectionAction implements Action {
    
    @Override
    public boolean execute() {
        System.out.println("Starting Connection to AutoTaskRunner");
        
        //ClientSSL.getInstance("ssh1.dei.isep.ipp.pt").start();
        //ClientSSL client = new ClientSSL("10.8.0.80",new Sdp2021Message(Sdp2021.VERSION, (byte)10, "teste".getBytes()));
        ClientSSL client = new ClientSSL("127.0.0.1",new Sdp2021Message(Sdp2021.VERSION, (byte)10, "teste".getBytes()), null);
        
        client.start();
        //ClientSSL.getInstance("127.0.0.1").start();   /*for local*/
        
        return true;
    }
}
