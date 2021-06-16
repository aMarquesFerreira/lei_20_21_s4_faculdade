/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.activityflowengine;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.repositories.ActivityRepository;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;

/**
 *
 * @author Omen
 */
public class AlgorithmFCFS {
   
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    private final ActivityRepository actRepo = PersistenceContext.repositories().activities();
    
    public void execute(){
        AssignActToColab aatc = new AssignActToColab();
        
        Iterable<Colaborator> colabs = colabRepo.findAllActive();
        Iterable<Activity> acts = actRepo.findAllActive();
        
        try{
            for(Activity act : acts){
                Threads thr = new Threads(act, colabs, aatc);
                thr.start();
                thr.join();
            }
        }catch(Exception e){
            System.out.println("Error");
        }
        
        /*for(Activity act : acts){
            try{
                thr.join();
            }catch(Exception e){
                System.out.println("Interrupted");
            }
        }*/
        
    }
}
