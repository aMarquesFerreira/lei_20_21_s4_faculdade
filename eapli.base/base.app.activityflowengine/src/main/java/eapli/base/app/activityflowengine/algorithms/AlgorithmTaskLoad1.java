/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.activityflowengine.algorithms;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.domain.ActivityExecution;
import eapli.base.app.activityflowengine.DataBaseFetcher;
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
public class AlgorithmTaskLoad1 implements AssignColaboratorAlgorithm{
    
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    
    private List<Colaborator> colabs;
    
    @Override
    public Colaborator next(Team team){
        return nextLowestWork(team);
    }
    
    
    /**
     * Returns List of Colabs by team
     * @param team
     * @return 
     */
    private List<Colaborator> getColabListByTeam(Team team){
        Iterable<Colaborator> iterableTeam = team.colaborators(); //colabs of the team
        colabs = new ArrayList();
        for (Colaborator colab : iterableTeam) {
            colabs.add(colab);
        }
        return colabs;
    }
    
    
    /**
     * Returns List of Colabs by taskLoad
     * @param team
     * @return 
     */
    private List<Colaborator> orderColabListByTaskLoad(List<Colaborator> team){
        List<Colaborator> tempList = new ArrayList();
        DataBaseFetcher dbf = new DataBaseFetcher();
        Iterable<ActivityExecution> acts;
        Colaborator lowestLoadColab = null;
        int count = 0, min = 1000;
        while(!team.isEmpty()){
            for(Colaborator colab : team){
                acts = dbf.activityExecutionFetchAsIterable(colab);
                for(ActivityExecution act : acts){
                    count++;
                }
                if(count < min){
                    min = count;
                    lowestLoadColab = colab;
                }
            }
            tempList.add(lowestLoadColab);
            team.remove(0);
        }
        team = tempList;
        return team;
    }
    
    private Colaborator nextLowestWork(Team team){
        List<Colaborator> colabs = getColabListByTeam(team);
        colabs = orderColabListByTaskLoad(colabs);
        Colaborator colab = colabs.get(0);
        colabs.remove(0);
        return colab;
    }
    
}
