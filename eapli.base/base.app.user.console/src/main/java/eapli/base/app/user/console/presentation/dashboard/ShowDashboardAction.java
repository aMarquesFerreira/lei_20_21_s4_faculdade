/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.user.console.presentation.dashboard;

import eapli.framework.actions.Action;

/**
 *
 * @author andre
 */
public class ShowDashboardAction implements Action {
    
    @Override
    public boolean execute() {
        System.out.println("Starting HTTP Server");
        
        DashboardServerSSL.getInstance("127.0.0.1").start();
        
        return true;
    }
    
}
