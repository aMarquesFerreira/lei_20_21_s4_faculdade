/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.activitymanagement.domain.Activity;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.domain.FormAnswer;
import eapli.base.formmanagement.domain.FormAnswerId;
import eapli.base.formmanagement.domain.FormId;
import eapli.base.formmanagement.repositories.FormAnswerRepository;
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
public class JpaFormAnswerRepository extends JpaAutoTxRepository<FormAnswer, FormAnswerId, FormAnswerId>
        implements FormAnswerRepository{
    
     public JpaFormAnswerRepository(TransactionalContext autoTx) {
        super(autoTx, "formAnswerId");
    }

    public JpaFormAnswerRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "formAnswerId");
    }

    @Override
    public Optional<FormAnswer> findByFormAnswerId(FormAnswerId formAnswerId) {
        final Map<String, Object> params = new HashMap<>();
        params.put("formAnswerId", formAnswerId);
        return matchOne("e.formAnswerId=:formAnswerId", params);
    }

    @Override
    public Iterable<FormAnswer> findAllActive() {
        //return match("e.catalogue.active = true");
        return match("e.active = true");
    }
    
    @Override
    public Iterable<FormAnswer> findByColaborator(Colaborator who) {
        
        return match("e.colaborator = colaborator");
    
    }
   
}
