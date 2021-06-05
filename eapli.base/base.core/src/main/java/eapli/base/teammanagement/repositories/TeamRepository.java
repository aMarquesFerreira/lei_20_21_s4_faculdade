package eapli.base.teammanagement.repositories;

import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.domain.TeamCode;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;
//import eapli.framework.infrastructure.authz.domain.model.

/**
 *
 * @author Jorge Santos ajs@isep.ipp.pt 02/04/2016
 */
public interface TeamRepository
        extends DomainRepository<TeamCode, Team> {

    /**
     * returns the catalogue whose Catalogue ID is given
     *
     * @param teamCode
     *            the Team Code to search for
     * @return
     */
    /*Optional<Catalogue> findByCatalogueId(CatalogueId catalogueId);*/

    /**
     * returns the Catalogue with the given ID number
     *
     * @param teamCode
     * @return
     */
    default Optional<Team> findByTeamCode(TeamCode teamCode) {
        return ofIdentity(teamCode);
    }

    Iterable<Team> findAllActive();

    public Iterable<Team> findByColaborator(Colaborator who);

    
}
