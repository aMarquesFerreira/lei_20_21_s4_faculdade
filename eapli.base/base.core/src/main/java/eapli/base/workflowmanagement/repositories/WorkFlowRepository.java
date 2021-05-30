/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.workflowmanagement.repositories;

import eapli.base.workflowmanagement.domain.WorkFlow;
import eapli.base.workflowmanagement.domain.WorkFlowId;
import eapli.framework.domain.repositories.DomainRepository;
import java.util.Optional;

/**
 *
 * @author andre
 */
public interface WorkFlowRepository  extends DomainRepository<WorkFlowId, WorkFlow> {
    
    /**
     * returns the typeOfTeam with the given workFlowId
     *
     * @param color
     * @return
     */
    default Optional<WorkFlow> findByID(WorkFlowId workFlowId) {
        return ofIdentity(workFlowId);
    }

    Iterable<WorkFlow> findAllActive();
    
}
