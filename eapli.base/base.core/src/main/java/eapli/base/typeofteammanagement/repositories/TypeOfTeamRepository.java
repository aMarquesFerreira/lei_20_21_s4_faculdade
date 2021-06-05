/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.typeofteammanagement.repositories;

import eapli.base.typeofteammanagement.domain.Color;
import eapli.base.typeofteammanagement.domain.TypeOfTeam;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

/**
 *
 * @author Omen
 */
public interface TypeOfTeamRepository
    extends DomainRepository<Color, TypeOfTeam>{
    
     /**
     * returns the typeOfTeam with the given color
     *
     * @param color
     * @return
     */
    default Optional<TypeOfTeam> findByColor(Color color) {
        return ofIdentity(color);
    }

    Iterable<TypeOfTeam> findAllActive();
    
}
