/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.formmanagement.domain.FormAnswerId;
import eapli.base.formmanagement.domain.FormParameter;
import eapli.base.formmanagement.domain.FormParameterAnswer;
import eapli.base.formmanagement.domain.FormParameterAnswerId;
import eapli.base.formmanagement.domain.FormParameterId;
import eapli.base.formmanagement.repositories.FormParameterAnswerRepository;
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
public class JpaFormParameterAnswerRepository extends JpaAutoTxRepository<FormParameterAnswer, FormParameterAnswerId, FormParameterAnswerId>
        implements FormParameterAnswerRepository{
    
     public JpaFormParameterAnswerRepository(TransactionalContext autoTx) {
        super(autoTx, "formParameterAnswerId");
    }

    public JpaFormParameterAnswerRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "formParameterAnswerId");
    }

    @Override
    public Optional<FormParameterAnswer> findByFormParameterAnswerId(FormParameterAnswerId formParameterAnswerId) {
        final Map<String, Object> params = new HashMap<>();
        params.put("formParameterAnswerId", formParameterAnswerId);
        return matchOne("e.formParameterAnswerId=:formParameterAnswerId", params);
    }

    /*@Override
    public Optional<FormParameterAnswer> findByFormAnswerId(FormAnswerId formAnswerId) {
        final Map<String, Object> params = new HashMap<>();
        params.put("formAnswerId", formAnswerId);
        return matchOne("e.formAnswerId=:formAnswerId", params);
    }*/

    @Override
    public Iterable<FormParameterAnswer> findByFormAnswerId(FormAnswerId formAnswerId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
