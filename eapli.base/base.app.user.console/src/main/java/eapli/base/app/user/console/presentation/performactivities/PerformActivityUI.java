/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.user.console.presentation.performactivities;

import eapli.base.activitymanagement.application.ListActivityService;
import eapli.base.activitymanagement.application.MyActivitiesController;
import eapli.base.activitymanagement.application.PerformActivityController;
import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.domain.ActivityExecution;
import eapli.base.colaboratormanagement.application.ListColaboratorService;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.domain.FormParameter;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author andre
 */
public class PerformActivityUI extends AbstractUI {
    
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    private final ListActivityService actSvc = new ListActivityService();
    private final MyActivitiesController myActController = new MyActivitiesController();
    private final PerformActivityController performActController = new PerformActivityController();
    
    
    @Override
    protected boolean doShow(){
   
        final Iterable<ActivityExecution> activities = this.myActController.myActivities();

        final SelectWidget<ActivityExecution> Selector = new SelectWidget<>("Activities:", activities,
                new ActivityExecutionPrinter());
        Selector.show();

        final ActivityExecution theActivityExecution = Selector.selectedElement();
        
        Form form = theActivityExecution.getActivity().getForm();
        
        List<FormParameter> params = new ArrayList<>();
        List<String> values = new ArrayList<>();        
        for (FormParameter fp : form.getFormParameters()) {
            System.out.println("Enter a value for: " + fp.description());            
            String value = Console.readLine(fp.label().toString() + ":");
            
            params.add(fp);
            values.add(value);
        }
        
        //falta controller para realizar servico
        performActController.performActivity(theActivityExecution, params, values);
        
        return false;
        
    }

    @Override
    public String headline() {
        return "Perform Activity";
    }

}
