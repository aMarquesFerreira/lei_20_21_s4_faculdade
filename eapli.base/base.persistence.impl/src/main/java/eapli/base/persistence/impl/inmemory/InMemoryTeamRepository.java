/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.persistence.impl.inmemory;

import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.domain.TeamCode;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

/**
 *
 * @author andre
 */
public class InMemoryTeamRepository extends InMemoryDomainRepository<Team, TeamCode> 
                                                                  implements TeamRepository{
    
    static {
        InMemoryInitializer.init();
    }

   /* @Override
    public Optional<Catalogue> findByCatalogueId(CatalogueId catalogueId) {
        return matchOne(e -> e.user().username().equals(name));
    }
*/
    @Override
    public Optional<Team> findByTeamCode(TeamCode teamCode) {
        return Optional.of(data().get(teamCode));
    }

   @Override
    public Iterable<Team> findAllActive() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterable<Team> findByColaborator(Colaborator who) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
