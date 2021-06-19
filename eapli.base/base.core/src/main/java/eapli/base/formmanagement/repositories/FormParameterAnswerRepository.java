/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.formmanagement.repositories;

import eapli.base.formmanagement.domain.FormAnswerId;
import eapli.base.formmanagement.domain.FormParameter;
import eapli.base.formmanagement.domain.FormParameterAnswer;
import eapli.base.formmanagement.domain.FormParameterAnswerId;
import eapli.base.formmanagement.domain.FormParameterId;
import eapli.framework.domain.repositories.DomainRepository;
import java.util.Optional;

/**
 *
 * @author andre
 */
public interface FormParameterAnswerRepository extends DomainRepository<FormParameterAnswerId, FormParameterAnswer>{

    default Optional<FormParameterAnswer> findByFormParameterAnswerId(FormParameterAnswerId formParameterAnswerId) {
        return ofIdentity(formParameterAnswerId);
    }
    
    @Override
    public Iterable<FormParameterAnswer> findAll();
    
    //@Override
    public Iterable<FormParameterAnswer> findByFormAnswerId(FormAnswerId formAnswerId);
    
    //public Iterable<FormAnswer> findByColaborator();
    
  //  public Iterable<FormParameters> findAllActive();
}
