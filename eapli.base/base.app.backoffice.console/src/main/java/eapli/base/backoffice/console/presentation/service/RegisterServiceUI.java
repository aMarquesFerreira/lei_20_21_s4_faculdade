/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.backoffice.console.presentation.service;

import eapli.base.app.backoffice.console.presentation.catalogue.CataloguePrinter;
import eapli.base.app.backoffice.console.presentation.colaborator.ColaboratorPrinter;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.servicemanagement.application.RegisterServiceController;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;


/**
 *
 * @author andre
 */
public class RegisterServiceUI extends AbstractUI{
    
    private final RegisterServiceController theController = new RegisterServiceController();
    

    //private final ListTeamService listTeamService = new ListTeamService();
    
    @Override
    protected boolean doShow() {
        
        final Iterable<Catalogue> catalogues = this.theController.catalogues();
        
        final SelectWidget<Catalogue> selector = new SelectWidget<>("Catalogues:", catalogues,
                new CataloguePrinter());
        selector.show();
        final Catalogue theCatalogue = selector.selectedElement();


        final String serviceCode = Console.readLine("ServiceCode");

        final String serviceDescription = Console.readLine("Service Description");

        final String serviceTitle = Console.readLine("Service Title");

        // ArrayList<Team> teams = new ArrayList<Team>();

        try {
            this.theController.RegisterService(serviceCode, serviceDescription, serviceTitle, theCatalogue);
        } catch (@SuppressWarnings("unused") final IntegrityViolationException e) {
            System.out.println("You tried to enter a service which already exists in the database.");
        }

        return false;
    

    }
    @Override
    public String headline() {
        return "Register Service";
    }


    
}
