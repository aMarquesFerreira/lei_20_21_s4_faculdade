package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.domain.TeamCode;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Jorge Santos ajs@isep.ipp.pt 02/04/2016
 */
class JpaTeamRepository
        extends JpaAutoTxRepository<Team, TeamCode, TeamCode>
        implements TeamRepository {   
    
    public JpaTeamRepository(TransactionalContext autoTx) {
        super(autoTx, "teamCode");
    }

    public JpaTeamRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "teamCode");
    }

    @Override
    public Optional<Team> findByTeamCode(TeamCode teamCode) {
        final Map<String, Object> params = new HashMap<>();
        params.put("teamCode", teamCode);
        return matchOne("e.teamCode=:teamCode", params);
    }

    @Override
    public Iterable<Team> findAllActive() {
        return match("e.active = true");
    }

    @Override
    public Iterable<Team> findByColaborator(Colaborator who) {
        final Map<String, Object> params = new HashMap<>();
        params.put("who", who);
        return match("e.colaborators contains :who", params);
    }
    
    
    
}

