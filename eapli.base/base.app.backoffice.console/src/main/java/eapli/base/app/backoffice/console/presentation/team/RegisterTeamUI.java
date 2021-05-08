/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.backoffice.console.presentation.team;

import eapli.base.colaboratormanagement.application.RegisterColaboratorController;
import eapli.base.teammanagement.application.RegisterTeamController;
import eapli.base.teammanagement.domain.TeamAcronym;
import eapli.base.teammanagement.domain.TeamCode;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.general.domain.model.Designation;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

/**
 *
 * @author andre
 */
public class RegisterTeamUI extends AbstractUI {
    
    private final RegisterTeamController theController = new RegisterTeamController();
   // private final UserManagementService userSvc = AuthzRegistry.userService();
    
    
    @Override
    protected boolean doShow() {
        // FIXME avoid duplication with SignUpUI. reuse UserDataWidget from

        final String code = Console.readLine("Team Code");
        final String designation = Console.readLine("Team Designation");
        final String acronym = Console.readLine("Team Acronym");
        
        try {
            this.theController.registerTeam(code, acronym, designation);
        } catch (@SuppressWarnings("unused") final IntegrityViolationException e) {
            System.out.println("You tried to enter a catalogue which already exists in the database.");
        }

        return false;
    }
    
    @Override
    public String headline() {
        return "Register Team";
    }
    
}
