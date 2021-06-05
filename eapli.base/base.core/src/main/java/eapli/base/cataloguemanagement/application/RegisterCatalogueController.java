/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.cataloguemanagement.application;

import eapli.base.catalogue.repositories.CatalogueRepository;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueId;
import eapli.base.colaboratormanagement.application.ListColaboratorService;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teammanagement.application.ListTeamService;
import eapli.base.teammanagement.domain.Team;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.general.domain.model.Description;
import eapli.framework.general.domain.model.Designation;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.List;

/**
 *
 * @author andre
 */
public class RegisterCatalogueController {
   
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final ListColaboratorService svcColaborators = new ListColaboratorService();
    private final ListTeamService svcTeams = new ListTeamService();
    private final CatalogueRepository catalogueRepository = PersistenceContext.repositories().catalogues();

    /**
     *
     * @param respColaborator
     * @param catalogueId
     * @param shortDescription
     * @param catalogueTitle
     * @param teams
     * @return
     */
    public Catalogue RegisterCatalogue(final Colaborator respColaborator, final String catalogueId, final String shortDescription, final String catalogueTitle, List<Team> teams) {
       
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HELP_DESK_SERVICE_MANAGER);

        final Catalogue newCatalogue = new Catalogue(respColaborator, CatalogueId.valueOf(catalogueId), Description.valueOf(shortDescription),  Designation.valueOf(catalogueTitle));
            
        teams.forEach(t -> {newCatalogue.addTeam(t);});
        
        return catalogueRepository.save(newCatalogue);
      
    }
    
    
    public Iterable<Colaborator> colaborators() {
        return svcColaborators.activeColaborators();
    }
 
    public Iterable<Team> teams() {
        return svcTeams.allTeams();
    }
    
}
