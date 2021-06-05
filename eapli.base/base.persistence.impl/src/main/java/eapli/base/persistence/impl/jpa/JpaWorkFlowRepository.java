/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.workflowmanagement.domain.WorkFlow;
import eapli.base.workflowmanagement.domain.WorkFlowId;
import eapli.base.workflowmanagement.repositories.WorkFlowRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author andre
 */
public class JpaWorkFlowRepository extends JpaAutoTxRepository<WorkFlow, WorkFlowId, WorkFlowId>
        implements WorkFlowRepository{
    
     public JpaWorkFlowRepository(TransactionalContext autoTx) {
        super(autoTx, "workFlowId");
    }

    public JpaWorkFlowRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "workFlowId");
    }

    @Override
    public Optional<WorkFlow> findByID(WorkFlowId workFlowId) {
        final Map<String, Object> params = new HashMap<>();
        params.put("workFlowId", workFlowId);
        return matchOne("e.workFlowId=:workFlowId", params);
    }

    @Override
    public Iterable<WorkFlow> findAllActive() {
        //return match("e.catalogue.active = true");
        return match("e.active = true");
    }

    
}
