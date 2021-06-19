/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.formmanagement.repositories;

import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.domain.FormAnswer;
import eapli.base.formmanagement.domain.FormAnswerId;
import eapli.base.formmanagement.domain.FormId;
import eapli.framework.domain.repositories.DomainRepository;
import java.util.Optional;

/**
 *
 * @author andre
 */
public interface FormAnswerRepository extends DomainRepository<FormAnswerId, FormAnswer>{
    

    /**
     * returns the Form with the given ID number
     *
     * @param formAnswerId
     * @return
     */
    default Optional<FormAnswer> findByFormAnswerId(FormAnswerId formAnswerId) {
        return ofIdentity(formAnswerId);
    }

    public Iterable<FormAnswer> findAllActive();
    
    public Iterable<FormAnswer> findByColaborator(Colaborator who);
    
  //  public Iterable<FormParameters> findAllActive();
}
