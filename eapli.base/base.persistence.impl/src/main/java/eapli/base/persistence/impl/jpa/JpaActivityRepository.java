/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.domain.ActivityId;
import eapli.base.activitymanagement.repositories.ActivityRepository;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author andre
 */
public class JpaActivityRepository extends JpaAutoTxRepository<Activity, ActivityId, ActivityId>
        implements ActivityRepository{

     
     public JpaActivityRepository(TransactionalContext autoTx) {
        super(autoTx, "activityId");
    }

    public JpaActivityRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "activityId");
    }

    @Override
    public Optional<Activity> findByActivityId(ActivityId activityId) {
        final Map<String, Object> params = new HashMap<>();
        params.put("activityId", activityId);
        return matchOne("e.activityId=:activityId", params);
    }

    @Override
    public Iterable<Activity> findAllActive() {
        //return match("e.catalogue.active = true");
        return match("e.active = true");
    }

    @Override
    public Iterable<Activity> findByColaborator(Colaborator who) {
        
        return match("e.colaborator = colaborator");
    
    }
    
}
