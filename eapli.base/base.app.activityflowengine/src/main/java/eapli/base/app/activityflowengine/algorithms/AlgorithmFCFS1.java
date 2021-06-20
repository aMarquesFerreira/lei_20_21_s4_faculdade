/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.activityflowengine.algorithms;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.repositories.ActivityExecutionRepository;
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
public class AlgorithmFCFS1 implements AssignColaboratorAlgorithm{
   
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    //private final ActivityExecutionRepository actRepo = PersistenceContext.repositories().activityExecutions();
    //private final XXX_AlgorithmTaskLoad algTaskLoad = new XXX_AlgorithmTaskLoad();
    
    
    private List<Colaborator> colabs;
    private int next=-1;
    
    
    //Adiciona os colabs por ordem
    public AlgorithmFCFS1() {
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
    
    
    /*
    *Algorithm to assign Activities to the colaborator who has less work time
    */
    //@Override
   /* private Colaborator nextLowestWork(Team team){
        List<Colaborator> colabs = algTaskLoad.getColabListByTeam(team);
        colabs = algTaskLoad.orderColabListByTaskLoad(colabs);
        Colaborator colab = colabs.get(0);
        colabs.remove(0);
        return colab;
    }*/
}
