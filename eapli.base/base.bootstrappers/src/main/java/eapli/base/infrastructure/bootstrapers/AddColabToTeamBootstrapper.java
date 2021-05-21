/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.infrastructure.bootstrapers;

import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.colaboratormanagement.application.AddColaboratorToTeamController;
import eapli.base.colaboratormanagement.domain.Address;
import eapli.base.colaboratormanagement.domain.BirthDate;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.domain.Contact;
import eapli.base.colaboratormanagement.domain.Evaluation;
import eapli.base.colaboratormanagement.domain.Name;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.actions.Action;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author andre
 */
public class AddColabToTeamBootstrapper /*implements Action*/ {
    /*private static final Logger LOGGER = LoggerFactory.getLogger(AddColabToTeamBootstrapper.class);

    private final AddColaboratorToTeamController addColabController = new AddColaboratorToTeamController();
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    
 
     @Override
    public boolean execute() {  
        
        addColabToTeam("001", "TeamA", "Team AAAA");
        registerNewTeam("002", "TeamB", "Team BBBB");
        registerNewTeam("003", "TeamC", "Team CCCC");
        registerNewTeam("004", "TeamD", "Team DDDD");
        
        return true;
    }
    
    public void addColabToTeam(Colaborator colab, Team team) {
        addColabController.addColaboratorToTeam(colab, team);
        LOGGER.debug("»»» Adding colab to team %s", colab, team);
        Colaborator colaborator = colabRepo.ofIdentity(idy(Username.valueOf("isep959")).get();
        
        
    }*/
    
    
}
