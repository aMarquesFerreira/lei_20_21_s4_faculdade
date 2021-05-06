/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.backoffice.console.presentation.catalogue;

import eapli.base.app.backoffice.console.presentation.colaborator.ColaboratorPrinter;
import eapli.base.cataloguemanagement.application.RegisterCatalogueController;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.SelectWidget;
import eapli.framework.presentation.console.AbstractUI;

/**
 *
 * @author andre
 */
public class RegisterCatalogueUI extends AbstractUI {
    
    private final RegisterCatalogueController theController = new RegisterCatalogueController();
    
    
    protected boolean doShow() {
        //final String catalogueName = Console.readLine("Catalogue Name:");
        
        final Iterable<Colaborator> colaborators = this.theController.colaborators();

        final SelectWidget<Colaborator> selector = new SelectWidget<>("Colaborators:", colaborators,
                new ColaboratorPrinter());
        selector.show();
        final Colaborator theColaborator = selector.selectedElement();
            
        final String catalogueId = Console.readLine("CatalogueId");

        try {
            this.theController.RegisterCatalogue(theColaborator, catalogueId);
        } catch (@SuppressWarnings("unused") final IntegrityViolationException e) {
            System.out.println("You tried to enter a catalogue which already exists in the database.");
        }

        return false;
    }
    
    
    //@Override
    public String headline() {
        return "Register Catalogue";
    }
    
}
