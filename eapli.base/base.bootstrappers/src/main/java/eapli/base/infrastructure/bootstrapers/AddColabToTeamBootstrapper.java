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
import eapli.base.teammanagement.domain.TeamCode;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.framework.actions.Action;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author andre
 */
public class AddColabToTeamBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(AddColabToTeamBootstrapper.class);

    private final AddColaboratorToTeamController addColabController = new AddColaboratorToTeamController();
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    private final TeamRepository teamRepo = PersistenceContext.repositories().teams();
    
    
 
     @Override     
    public boolean execute() {  
        
        addColabToTeam("isep959", "001");
        addColabToTeam("isep959", "002");
        addColabToTeam("isep959", "003");
        
        
        
        //gera um erro de optimistic locking (o erro ocorre quando se tenta fazer com colaboradores diferentes
       /* addColabToTeam("isep960", "001");
        addColabToTeam("isep961", "002");
        addColabToTeam("isep962", "002");
        */
        return true;
    }
    
    public void addColabToTeam(String colaborator, String team) {
        Colaborator c = colabRepo.findByMecanographicNumber(MecanographicNumber.valueOf(colaborator)).get();
        Team t = teamRepo.findByTeamCode(TeamCode.valueOf(team)).get();
               
        addColabController.addColaboratorToTeam(c, t);
        
        
        //Team t2 = teamRepo.findByTeamCode(TeamCode.valueOf(team)).get();
        //addColabController.addColaboratorToTeam(c, t2);
        LOGGER.debug("»»» Adding colab to team %s", colaborator, team);
    }
    
    
}
