/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceCode;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author andre
 */
public class JpaServiceRepository  extends JpaAutoTxRepository<Service, ServiceCode, ServiceCode>
        implements ServiceRepository {
    
    public JpaServiceRepository(TransactionalContext autoTx) {
        super(autoTx, "serviceCode");
    }

    public JpaServiceRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "serviceCode");
    }

    @Override
    public Optional<Service> findByServiceCode(ServiceCode serviceCode) {
        final Map<String, Object> params = new HashMap<>();
        params.put("serviceCode", serviceCode);
        return matchOne("e.serviceCode=:serviceCode", params);
    }

    @Override
    public Iterable<Service> findAllActive() {
        //return match("e.catalogue.active = true");
        return match("e.active = true");
    }
    
    @Override
    public Iterable<Service> findAllInactive() {
        //return match("e.catalogue.active = true");
        return match("e.active = false");
    }
    
    @Override
    public Iterable<Service> findAll() {
        //return match("e.catalogue.active = true");
        //TODO fix!
        return match("e.active = false inner join e.active = true");
    }

    @Override
    public Iterable<Service> findByCatalogue(Catalogue catalogue) {
        final Map<String, Object> params = new HashMap<>();
        params.put("catalogue", catalogue);
        return match("e.catalogue = :catalogue",params);
    }

    
    
}
