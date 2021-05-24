/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.infrastructure.bootstrapers.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eapli.base.clientusermanagement.application.AcceptRefuseSignupFactory;
import eapli.base.clientusermanagement.application.AcceptRefuseSignupRequestController;
import eapli.base.clientusermanagement.domain.SignupRequest;
import eapli.base.infrastructure.bootstrapers.TestDataConstants;
import eapli.base.myclientuser.application.SignupController;
import eapli.base.teammanagement.application.RegisterTeamController;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;

/**
 *
 * @author Paulo Sousa
 */public class TeamBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(TeamBootstrapper.class);

    private final RegisterTeamController teamController = new RegisterTeamController();
    
    
    
    @Override
    public boolean execute() {  
        
        registerNewTeam("001", "TeamA", "Team AAAA");
        registerNewTeam("002", "TeamB", "Team BBBB");
        registerNewTeam("003", "TeamC", "Team CCCC");
        registerNewTeam("004", "TeamD", "Team DDDD");
        
        return true;
    }
    
    public void registerNewTeam(String number, String acronym, String name) {
        teamController.registerTeam(number, acronym, name);
        LOGGER.debug("»»» Creating new Team %s", number);
    }

}
