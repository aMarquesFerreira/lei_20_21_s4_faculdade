/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.infrastructure.bootstrapers;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.domain.TeamCode;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.base.typeofteammanagement.application.RegisterTypeOfTeamController;
import eapli.framework.actions.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Omen
 */
public class TypeOfTeamBootstrapper implements Action{
    
     private static final Logger LOGGER = LoggerFactory.getLogger(eapli.base.infrastructure.bootstrapers.TypeOfTeamBootstrapper.class);

    private final RegisterTypeOfTeamController typeOfTeamController = new RegisterTypeOfTeamController();
    
    private final TeamRepository teamRepo = PersistenceContext.repositories().teams();
    
    
    @Override
    public boolean execute() {  
        
        Team team1 = teamRepo.findByTeamCode(TeamCode.valueOf("001")).get();
        Team team2 = teamRepo.findByTeamCode(TeamCode.valueOf("002")).get();

        List<Team> teamsEx = new ArrayList<>();
        List<Team> teams = new ArrayList<>();
        
        teamsEx.add(team1);
        teams.add(team2);
        
        registerNewTypeOfTeam("ColorA", "TypeOfTeamA", teamsEx);
        
        registerNewTypeOfTeam("Blue", "Departamento de Vendas", teams);
       // registerNewTypeOfTeam("ColorB", "TypeOfTeamB", teams);
        
        return true;
    }
    
    public void registerNewTypeOfTeam(String color, String description, List<Team> teams) {
        typeOfTeamController.RegisterTypeOfTeam(color, description, teams);
        LOGGER.debug("»»» Creating new Type of Team %s", color);
    }
    
}
