/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.activitymanagement.application;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.repositories.ActivityRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

/**
 *
 * @author andre
 */
public class ListActivityService {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final ActivityRepository activityRepository = PersistenceContext.repositories().activities();
    
    
    public Iterable<Activity> activeActivities() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER,
                BaseRoles.ADMIN);
        return this.activityRepository.findAllActive();
        
    }
        
}
