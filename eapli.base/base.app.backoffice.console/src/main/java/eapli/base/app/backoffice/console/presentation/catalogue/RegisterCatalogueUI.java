/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.backoffice.console.presentation.catalogue;

import eapli.base.cataloguemanagement.application.RegisterCatalogueController;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;

/**
 *
 * @author andre
 */
public class RegisterCatalogueUI {
    
    private final RegisterCatalogueController theController = new RegisterCatalogueController();
    
    
    protected boolean doShow() {
        final String catalogueName = Console.readLine("Catalogue Name:");
            
        final Iterable<Catalogue> catalogue = this.theController.catalogue();

        final SelectWidget<Catalogue> selector = new SelectWidget<>("Catalogues:", catalogue,
                new CataloguePrinter());
        selector.show();
        final Catalogue theCatalogue = selector.selectedElement();

        final String catalogueId = Console.readLine("CatalogueId");

        

        try {
            this.theController.registerCatalogueh(theCatalogue, catalogueId);
        } catch (@SuppressWarnings("unused") final IntegrityViolationException e) {
            System.out.println("You tried to enter a catalogue which already exists in the database.");
        }

        return false;
    }
    
}
