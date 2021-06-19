/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.domain.ActivityExecution;
import eapli.base.activitymanagement.domain.ActivityExecutionId;
import eapli.base.activitymanagement.domain.ActivityId;
import eapli.base.activitymanagement.repositories.ActivityExecutionRepository;
import eapli.base.activitymanagement.repositories.ActivityRepository;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author andre
 */
public class JpaActivityExecutionRepository extends JpaAutoTxRepository<ActivityExecution, ActivityExecutionId, ActivityExecutionId>
        implements ActivityExecutionRepository{

     
     public JpaActivityExecutionRepository(TransactionalContext autoTx) {
        super(autoTx, "activityExecutionId");
    }

    public JpaActivityExecutionRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "activityExecutionId");
    }

    @Override
    public Optional<ActivityExecution> findByActivityExecutionId(ActivityExecutionId activityExecutionId) {
        final Map<String, Object> params = new HashMap<>();
        params.put("activityExecutionId", activityExecutionId);
        return matchOne("e.activityExecutionId=:activityExecutionId", params);
    }

    @Override
    public Iterable<ActivityExecution> findAllActive() {
        //return match("e.catalogue.active = true");
        return match("e.active = true");
    }

    @Override
    public Iterable<ActivityExecution> findByColaborator(Colaborator who) {
        
        return match("e.colaborator = colaborator");
    
    }
    
}
