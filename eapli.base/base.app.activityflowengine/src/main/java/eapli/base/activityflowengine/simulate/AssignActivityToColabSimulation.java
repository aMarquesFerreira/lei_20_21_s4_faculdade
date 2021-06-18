/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.activityflowengine.simulate;

import eapli.base.activityflowengine.control.ActivityDistribution;
import eapli.base.activitymanagement.application.RegisterActivityController;
import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.domain.ActivityId;
import eapli.base.activitymanagement.repositories.ActivityRepository;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.formmanagement.repositories.FormRepository;
import eapli.base.infrastructure.bootstrapers.XXAssigneActivityToColabBootstrapper;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.ticketmanagement.application.RequestServiceController;
import eapli.framework.actions.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author andre
 */
public class AssignActivityToColabSimulation implements Action {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(XXAssigneActivityToColabBootstrapper.class);

    private final RegisterActivityController activityController = new RegisterActivityController();
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    private final FormRepository formRepo = PersistenceContext.repositories().forms();
    private final ActivityRepository actRepo = PersistenceContext.repositories().activities();
    private final RequestServiceController requestServController =  new RequestServiceController();
    private final ActivityDistribution actDistrib = new ActivityDistribution();

    //private final List<Catalogue> catalogues = new ArrayList<Catalogue>();

    //final String activityId, final String description, final Colaborator colaborator,final Form form) {

    @Override
    public boolean execute() {
        Colaborator c1 = colabRepo.findByMecanographicNumber(MecanographicNumber.valueOf("isep959")).get();
        Activity a1 = actRepo.findByActivityId(ActivityId.valueOf("A2")).get();
        
        assignActivityToColab(c1, a1);

        return true;
    }
    private void assignActivityToColab(Colaborator colab, Activity act) {
        
        actDistrib.assignActivityToColab(colab, act);
        LOGGER.debug("»»» Creating new Activity %s", colab, act);
        
    }

    
}
