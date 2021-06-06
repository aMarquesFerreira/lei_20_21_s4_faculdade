package eapli.base.colaboratormanagement.application;

import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.colaboratormanagement.domain.*;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.application.UserManagementService;
import eapli.framework.infrastructure.authz.domain.model.Role;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.util.Set;

/**
 *
 * Created by nuno on 21/03/16.
 */
@UseCaseController
public class RegisterColaboratorController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final UserManagementService userSvc = AuthzRegistry.userService();
    private final ColaboratorRepository colaboratorRepository = PersistenceContext.repositories().colaborators(); 

    /**
     * Get existing RoleTypes available to the user.
     *
     * @return a list of RoleTypes
     */
    public Role[] getRoleTypes() {
        return BaseRoles.nonUserValues();
    }
    
    public Colaborator registerColaborator(SystemUser user,
                                          MecanographicNumber mecanographicNumber,
                                          Name name,
                                          Address address,
                                          BirthDate birthDate,
                                          Evaluation evaluation,
                                          Contact contact,
                                          Set<Role> roleTypes) {
        //TODO register roles
        
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HUMAN_RESOURCES_MANAGER);

        Colaborator colaborator = new Colaborator(user,mecanographicNumber,address,birthDate,evaluation,contact);
        
        return colaboratorRepository.save(colaborator);
    }
}