package eapli.base.colaboratormanagement.repositories;

import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.infrastructure.authz.domain.model.Username;


import java.util.Optional;

public interface ColaboratorRepository extends DomainRepository<MecanographicNumber, Colaborator> {

    /**
     * returns the colaborator whose username is given
     *
     * @param name
     *            the username to search for
     * @return
     */
    Optional<Colaborator> findByUsername(Username name);

    /**
     * returns the colaborator with the given mecanographic number
     *
     * @param number
     * @return
     */
    default Optional<Colaborator> findByMecanographicNumber(MecanographicNumber number) {
        return ofIdentity(number);
    }

    public Iterable<Colaborator> findAllActive();
}
