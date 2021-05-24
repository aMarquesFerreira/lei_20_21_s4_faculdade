/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.typeofteammanagement.application;


import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teammanagement.application.ListTeamService;
import eapli.base.teammanagement.domain.Team;
import eapli.base.typeofteammanagement.domain.Color;
import eapli.base.typeofteammanagement.domain.TypeOfTeam;
import eapli.base.typeofteammanagement.repositories.TypeOfTeamRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.general.domain.model.Description;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import java.util.List;

/**
 *
 * @author Omen
 */
public class RegisterTypeOfTeamController {
    
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final ListTeamService svcTeams = new ListTeamService();
    private final TypeOfTeamRepository typeofteamRepository = PersistenceContext.repositories().typesofteam();

    /**
     *
     * @param color
     * @param description
     * @param teams
     * @return
     */
    public TypeOfTeam RegisterTypeOfTeam(final String color, final String description, List<Team> teams) {
       
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HELP_DESK_SERVICE_MANAGER);

        final TypeOfTeam newTypeOfTeam = new TypeOfTeam(Color.valueOf(color), Description.valueOf(description));
            
        teams.forEach(t -> {newTypeOfTeam.addTeam(t);});
        
        return typeofteamRepository.save(newTypeOfTeam);
      
    }
 
 
    public Iterable<Team> teams() {
        return svcTeams.allTeams();
    }
    
}
