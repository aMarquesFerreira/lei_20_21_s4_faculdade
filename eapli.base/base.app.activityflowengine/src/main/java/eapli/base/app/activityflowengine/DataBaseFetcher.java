/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.activityflowengine;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.domain.ActivityExecution;
import eapli.base.activitymanagement.repositories.ActivityExecutionRepository;
import eapli.base.activitymanagement.repositories.ActivityRepository;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.infrastructure.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
//import org.json.simple.JSONObject;

/**
 *
 * @author andre
 */
public class DataBaseFetcher {
    
    private final ActivityRepository actRepo = PersistenceContext.repositories().activities();
    private final ActivityExecutionRepository actExecRepo = PersistenceContext.repositories().activityExecutions();
    
    
    //method to get activitys by colab
    public String activityFetchAsJson(Colaborator who){
        
        Iterable<Activity> list;
        
        list = actRepo.findByColaborator(who);

        JSONArray acts = new JSONArray();
        for (Activity activity : list) {
            JSONObject a = new JSONObject();
            a.put("description", activity.description().toString());
            a.put("id", activity.identity().toString());

            acts.add(a);
        }
        
        return acts.toString();//list.toString();
        
    }
    
    
    public String activityExecFetchAsJson(Colaborator who){
        
        Iterable<ActivityExecution> list;
        
        list = actExecRepo.findByColaborator(who);

        JSONArray acts = new JSONArray();
        for (ActivityExecution activityExec : list) {
            JSONObject a = new JSONObject();
            a.put("description", activityExec.getActivity().description().toString());
            a.put("id", activityExec.getActivity().identity().toString());

            acts.add(a);
        }
        
        return acts.toString();//list.toString();
        
    }
    
    public Iterable<Activity> activityFetchAsIterable(Colaborator who){
        
        Iterable<Activity> list;
        
        list = actRepo.findByColaborator(who);
        
        return list;
    }
    
    
    public Iterable<ActivityExecution> activityExecutionFetchAsIterable(Colaborator who){
        
        Iterable<ActivityExecution> list;
        
        list = actExecRepo.findByColaborator(who);
        
        return list;
    }
    
    
    public List<ActivityExecution> activitiesExecutionFetchAsList(){
        
        Iterable<ActivityExecution> actExecs = actExecRepo.findAllActive(); //colabs of the team
        List<ActivityExecution> activities = new ArrayList();
        for (ActivityExecution actExec : actExecs) {
            activities.add(actExec);
        }
        return activities;
    }
    
   
}
