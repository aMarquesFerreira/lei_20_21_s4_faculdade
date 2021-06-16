/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.activityflowengine;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.colaboratormanagement.domain.Colaborator;

/**
 *
 * @author Omen
 */
public class Threads extends Thread{
    
    private Activity act;
    private Iterable<Colaborator> colabs;
    AssignActToColab aatc;
    
    public Threads(){
        
    }
    
    public Threads(Activity activity, Iterable<Colaborator> colaborators, AssignActToColab assign){
        act = activity;
        colabs = colaborators;
        aatc = assign;
    }
    
    public void run(){
        synchronized(aatc){
            aatc.assign(act, colabs);
        }
    }
}
