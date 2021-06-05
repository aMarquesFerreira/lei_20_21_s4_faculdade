package eapli.base.colaboratormanagement.application;

import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

/**
 *
 * Created by nuno on 21/03/16.
 */
@UseCaseController
public class AddColaboratorToTeamController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final TeamRepository teamRepository = PersistenceContext.repositories().teams(); 

    public void addColaboratorToTeam(Colaborator colab, Team team) {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HUMAN_RESOURCES_MANAGER);

        team.addColaborator(colab);
        
        teamRepository.save(team);
    }
}