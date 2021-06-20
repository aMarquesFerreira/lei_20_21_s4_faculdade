/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.activityflowengine.algorithms;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.repositories.ActivityRepository;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teammanagement.domain.Team;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Omen
 */
public class XXX_AlgorithmFCFS implements AssignColaboratorAlgorithm{
   
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    private final ActivityRepository actRepo = PersistenceContext.repositories().activities();

    private List<Colaborator> colabs;
    private int next=-1;
    
    public XXX_AlgorithmFCFS() {
        colabs = new ArrayList();
        for (Colaborator colab : colabRepo.findAllActive()) {
            colabs.add(colab);
        }
    }
    
    /*Algorithm that chooses the next colab*/
    @Override
    public Colaborator next(Team team){
        next++;
        if (next==colabs.size())
            next=0;
        
        //next = (next++)%colabs.size();
        
        return colabs.get(0);
    }
    
    
    
    public Colaborator nextLowestWork(Team team){
        
        //CODE
        //return colabs.get(0);
        return null;
    }
    
    
    
    
    /*public void execute(){
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
        
        for(Activity act : acts){
            try{
                thr.join();
            }catch(Exception e){
                System.out.println("Interrupted");
            }
        }
        
    }*/
}
