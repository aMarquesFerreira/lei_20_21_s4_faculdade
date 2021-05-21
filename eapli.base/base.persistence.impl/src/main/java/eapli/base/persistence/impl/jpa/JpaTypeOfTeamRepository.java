/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.typeofteammanagement.domain.Color;
import eapli.base.typeofteammanagement.domain.TypeOfTeam;
import eapli.base.typeofteammanagement.repositories.TypeOfTeamRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Omen
 */
public class JpaTypeOfTeamRepository
    extends JpaAutoTxRepository<TypeOfTeam, Color, Color>
        implements TypeOfTeamRepository{
    
    public JpaTypeOfTeamRepository(TransactionalContext autoTx) {
        super(autoTx, "color");
    }

    public JpaTypeOfTeamRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "color");
    }

    @Override
    public Optional<TypeOfTeam> findByColor(Color color) {
        final Map<String, Object> params = new HashMap<>();
        params.put("color", color);
        return matchOne("e.color=:color", params);
    }

    @Override
    public Iterable<TypeOfTeam> findAllActive() {
        //return match("e.catalogue.active = true");
        return match("e.active = true");
    }
    
}
