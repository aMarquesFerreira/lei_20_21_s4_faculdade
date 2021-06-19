/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.formmanagement.domain.FormParameter;
import eapli.base.formmanagement.domain.FormParameterId;
import eapli.base.formmanagement.repositories.FormParameterRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author andre
 */
public class JpaFormParameterRepository extends JpaAutoTxRepository<FormParameter, FormParameterId, FormParameterId>
        implements FormParameterRepository{
    
     public JpaFormParameterRepository(TransactionalContext autoTx) {
        super(autoTx, "formParameterId");
    }

    public JpaFormParameterRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "formParameterId");
    }

    @Override
    public Optional<FormParameter> findByFormParameterId(FormParameterId formParameterId) {
        final Map<String, Object> params = new HashMap<>();
        params.put("formParameterId", formParameterId);
        return matchOne("e.formParameterId=:formParameterId", params);
    }

  
    
}
