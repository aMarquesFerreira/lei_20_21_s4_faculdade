/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.servicemanagement.repositories;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueId;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceCode;
import eapli.framework.domain.repositories.DomainRepository;
import java.util.Optional;

/**
 *
 * @author andre
 */
public interface ServiceRepository extends DomainRepository<ServiceCode, Service>{
    
     /**
     * returns the Catalogue with the given ID number
     *
     * @param catalogueId
     * @return
     */
    default Optional<Service> findByServiceCode(ServiceCode serviceCode) {
        return ofIdentity(serviceCode);
    }

    public Iterable<Service> findAllActive();
    
}
