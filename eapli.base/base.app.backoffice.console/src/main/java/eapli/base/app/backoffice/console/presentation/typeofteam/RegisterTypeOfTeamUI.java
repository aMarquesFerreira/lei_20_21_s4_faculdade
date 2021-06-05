/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.backoffice.console.presentation.typeofteam;

import eapli.base.app.backoffice.console.presentation.team.TeamPrinter;
import eapli.base.teammanagement.domain.Team;
import eapli.base.typeofteammanagement.application.RegisterTypeOfTeamController;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Omen
 */
public class RegisterTypeOfTeamUI extends AbstractUI {
    
    private final RegisterTypeOfTeamController theController = new RegisterTypeOfTeamController();
    final Iterable<Team> teams = this.theController.teams();

    //private final ListTeamService listTeamService = new ListTeamService();
    
    @Override
    protected boolean doShow() {
        final Iterable<Team> teams = this.theController.teams();
        
        List<Team> theTeams = new ArrayList<>();
        
        boolean moreTeams = true;
        while(moreTeams){
            final SelectWidget<Team> selector = new SelectWidget<>("Teams:", teams, new TeamPrinter());
            selector.show();
        
            final Team theTeam = selector.selectedElement();
            theTeams.add(theTeam);
            
            moreTeams = Console.readBoolean("Add more Teams? (y/n)");
        }

        final String color = Console.readLine("Color");

        final String description = Console.readLine("Description");

        try {
            this.theController.RegisterTypeOfTeam(color, description, theTeams);
        } catch (@SuppressWarnings("unused") final IntegrityViolationException e) {
            System.out.println("You tried to enter a type of team which already exists in the database.");
        }

        return false;
    

    }
    @Override
    public String headline() {
        return "Register Type of Team";
    }
    
}
