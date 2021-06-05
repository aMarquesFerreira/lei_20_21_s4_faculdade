/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.infrastructure.bootstrapers;

import eapli.base.activitymanagement.application.RegisterActivityController;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.domain.FormId;
import eapli.base.formmanagement.repositories.FormRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.framework.actions.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author andre
 */
public class ActivityBootstrapper implements Action {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ActivityBootstrapper.class);

    private final RegisterActivityController activityController = new RegisterActivityController();
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    private final FormRepository formRepo = PersistenceContext.repositories().forms();

    //private final List<Catalogue> catalogues = new ArrayList<Catalogue>();

    //final String activityId, final String description, final Colaborator colaborator,final Form form) {

    @Override
    public boolean execute() {
        Colaborator c1 = colabRepo.findByMecanographicNumber(MecanographicNumber.valueOf("isep959")).get();
        Form f1 = formRepo.findByFormId(FormId.valueOf("F1")).get();
        
        registerNewActivity("A1", "send email", c1, f1);
        registerNewActivity("A2", "sum all the costs", c1, f1);

        return true;
    }
    private void registerNewActivity(String activityId, String description, Colaborator colaborator, Form form) {
        
        activityController.RegisterActivity(activityId, description, colaborator, form);
        LOGGER.debug("»»» Creating new Activity %s", activityId);
        
    }

    
    
}
