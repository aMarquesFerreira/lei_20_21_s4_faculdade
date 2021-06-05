/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author andre
 */
public class JpaColaboratorRepository extends JpaAutoTxRepository<Colaborator, MecanographicNumber, MecanographicNumber>
        implements ColaboratorRepository{
    
     public JpaColaboratorRepository(TransactionalContext autoTx) {
        super(autoTx, "mecanographicNumber");
    }

    public JpaColaboratorRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "mecanographicNumber");
    }

    @Override
    public Optional<Colaborator> findByMecanographicNumber(MecanographicNumber mecanographicNumber) {
        final Map<String, Object> params = new HashMap<>();
        params.put("mecanographicNumber", mecanographicNumber);
        return matchOne("e.mecanographicNumber=:mecanographicNumber", params);
    }

    @Override
    public Iterable<Colaborator> findAllActive() {
        //return match("e.catalogue.active = true");
        return match("e.active = true");
    }

    @Override
    public Optional<Colaborator> findByUsername(Username name) {
        final Map<String, Object> params = new HashMap<>();
        params.put("username", name);
        return matchOne("e.systemUser.username=:username", params);
    }
    
}
