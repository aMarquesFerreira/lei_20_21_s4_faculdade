/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.formmanagement.repositories;

import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.domain.FormId;
import eapli.base.formmanagement.domain.FormParameters;
import eapli.framework.domain.repositories.DomainRepository;
import java.util.Optional;

/**
 *
 * @author andre
 */
public interface FormRepository extends DomainRepository<FormId, Form>{
    

    /**
     * returns the Form with the given ID number
     *
     * @param formId
     * @return
     */
    default Optional<Form> findByFormId(FormId formId) {
        return ofIdentity(formId);
    }

    public Iterable<Form> findAllActive();
    
  //  public Iterable<FormParameters> findAllActive();
    
}
