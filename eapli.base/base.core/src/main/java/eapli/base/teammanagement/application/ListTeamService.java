/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.teammanagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.ApplicationService;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

/**
 *
 * @author andre
 */
@ApplicationService
public class ListTeamService {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final TeamRepository teamRepository = PersistenceContext.repositories().teams();
    
    
    public Iterable<Team> allTeams() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER,
                BaseRoles.ADMIN);
        return this.teamRepository.findAll();
    }
}
