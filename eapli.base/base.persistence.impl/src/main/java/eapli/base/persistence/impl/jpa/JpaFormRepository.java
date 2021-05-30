/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.domain.FormId;
import eapli.base.formmanagement.domain.FormParameter;
import eapli.base.formmanagement.repositories.FormRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author andre
 */
public class JpaFormRepository extends JpaAutoTxRepository<Form, FormId, FormId>
        implements FormRepository{
    
     public JpaFormRepository(TransactionalContext autoTx) {
        super(autoTx, "formId");
    }

    public JpaFormRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "formId");
    }

    @Override
    public Optional<Form> findByFormId(FormId formId) {
        final Map<String, Object> params = new HashMap<>();
        params.put("formId", formId);
        return matchOne("e.formId=:formId", params);
    }

    @Override
    public Iterable<Form> findAllActive() {
        //return match("e.catalogue.active = true");
        return match("e.active = true");
    }
    
   /* @Override
    public Iterable<FormParameters> findAllActive() {
        //return match("e.catalogue.active = true");
        return match("e.active = true");
    }*/
    
}
