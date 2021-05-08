/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.backoffice.console.presentation.catalogue;

import eapli.base.app.backoffice.console.presentation.colaborator.ColaboratorPrinter;
import eapli.base.app.backoffice.console.presentation.team.TeamPrinter;
import eapli.base.cataloguemanagement.application.RegisterCatalogueController;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.teammanagement.application.ListTeamService;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.SelectWidget;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.ListWidget;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.security.auth.callback.ConfirmationCallback;

/**
 *
 * @author andre
 */
public class RegisterCatalogueUI extends AbstractUI {
    
    private final RegisterCatalogueController theController = new RegisterCatalogueController();
    //private final ListTeamService listTeamService = new ListTeamService();
    
    protected boolean doShow() {
        final Iterable<Team> teams = this.theController.teams();
        
        List<Team> theTeams = new ArrayList<>();
        
        boolean moreTeams=true;
        while(moreTeams){
            final SelectWidget<Team> selector = new SelectWidget<>("Teams:", teams, new TeamPrinter());
            selector.show();
        
            final Team theTeam = selector.selectedElement();
            theTeams.add(theTeam);
            
            moreTeams = Console.readBoolean("Add more Teams ?");
        }
        
        final Iterable<Colaborator> colaborators = this.theController.colaborators();
        
        final SelectWidget<Colaborator> Colabselector = new SelectWidget<>("Colaborators:", colaborators,
                new ColaboratorPrinter());
        Colabselector.show();
        
        final Colaborator theColaborator = Colabselector.selectedElement();
        
        
            
        final String catalogueId = Console.readLine("CatalogueId");
        
        final String shortDescription = Console.readLine("Short Description");
        
        final String catalogueTitle = Console.readLine("Catalogue Title");
       
       // ArrayList<Team> teams = new ArrayList<Team>();      
        
        try {
            this.theController.RegisterCatalogue(theColaborator, catalogueId, shortDescription, catalogueTitle, theTeams);
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
