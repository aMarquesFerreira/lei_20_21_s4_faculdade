/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.activityflowengine.client;

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
        ClientSSL.getInstance("10.8.0.80").start();     /*For isep*/
        //ClientSSL.getInstance("127.0.0.1").start();   /*for local*/
        
        return true;
    }
}
