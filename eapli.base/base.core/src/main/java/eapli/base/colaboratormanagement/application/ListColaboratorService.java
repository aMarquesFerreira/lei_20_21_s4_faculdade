/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.colaboratormanagement.application;

import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

/**
 *
 * @author andre
 */
public class ListColaboratorService {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final ColaboratorRepository colaboratorRepository = PersistenceContext.repositories().colaborators();
    
    
    public Iterable<Colaborator> activeColaborators() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER,
                BaseRoles.ADMIN);
        return this.colaboratorRepository.findAllActive();
        
    }
    
}
