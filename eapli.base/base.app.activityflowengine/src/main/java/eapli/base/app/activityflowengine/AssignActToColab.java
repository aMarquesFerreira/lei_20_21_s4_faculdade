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
public class AssignActToColab {
    
    public void assign(Activity act, Iterable<Colaborator> colabs){
        
        for(Colaborator colab : colabs){
            
        }
        
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
