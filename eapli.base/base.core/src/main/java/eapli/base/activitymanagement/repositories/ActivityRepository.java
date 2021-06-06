/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.activitymanagement.repositories;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.domain.ActivityId;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

/**
 *
 * @author andre
 */
public interface ActivityRepository 
        extends DomainRepository<ActivityId, Activity>{
    
     Iterable<Activity> findByColaborator(Colaborator who);

    /**
     * returns the Catalogue with the given ID number
     *
     * @param activityId
     * @return
     */
    default Optional<Activity> findByActivityId(ActivityId activityId) {
        return ofIdentity(activityId);
    }

    Iterable<Activity> findAllActive();
    
}
