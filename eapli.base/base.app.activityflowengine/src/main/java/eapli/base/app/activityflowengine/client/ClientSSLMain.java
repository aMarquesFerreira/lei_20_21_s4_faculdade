/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.activityflowengine.client;

import eapli.framework.io.util.Console;

/**
 *
 * @author andre
 */
public class ClientSSLMain {

    private static Integer exitCode;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        InitializeConnectionAction initializeConnectionAction = new InitializeConnectionAction();
        
        initializeConnectionAction.execute();
        
        //ClientSSL.getInstance("127.0.0.1").start();
        
        exitCode = Console.readInteger("(0) to terminate");
        while(exitCode!=0){
            exitCode = Console.readInteger("(0) to terminate");
        }
    }
    
    
}
