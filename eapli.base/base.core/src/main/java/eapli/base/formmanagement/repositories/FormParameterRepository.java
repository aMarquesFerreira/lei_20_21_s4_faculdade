/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.formmanagement.repositories;

import eapli.base.formmanagement.domain.FormParameter;
import eapli.base.formmanagement.domain.FormParameterId;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

/**
 *
 * @author andre
 */
public interface FormParameterRepository extends DomainRepository<FormParameterId, FormParameter>{

    default Optional<FormParameter> findByFormParameterId(FormParameterId formParameterId) {
        return ofIdentity(formParameterId);
    }
    
    @Override
    public Iterable<FormParameter> findAll();
    
  //  public Iterable<FormParameters> findAllActive();
    
}
