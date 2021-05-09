/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.infrastructure.bootstrapers;

import eapli.base.cataloguemanagement.application.RegisterCatalogueController;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueId;
import eapli.base.clientusermanagement.application.AcceptRefuseSignupFactory;
import eapli.base.clientusermanagement.application.AcceptRefuseSignupRequestController;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.colaboratormanagement.application.RegisterColaboratorController;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.myclientuser.application.SignupController;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.general.domain.model.Description;
import eapli.framework.general.domain.model.Designation;
import java.util.List;
import java.util.Optional;
import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.TransactionSystemException;
import eapli.base.infrastructure.bootstrapers.TestDataConstants;
import eapli.base.teammanagement.domain.TeamCode;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.base.infrastructure.bootstrapers.demo.TeamBootstrapper;
import eapli.base.teammanagement.application.RegisterTeamController;
import eapli.base.teammanagement.domain.TeamAcronym;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class CatalogueBootstrapper implements Action {
    
    
     private static final Logger LOGGER = LoggerFactory.getLogger(CatalogueBootstrapper.class);

    private final RegisterCatalogueController catalogueController = new RegisterCatalogueController();
    private final TeamBootstrapper teamBoot = new TeamBootstrapper();
    private final RegisterTeamController teamController = new RegisterTeamController();
    private final RegisterColaboratorController colabController = new RegisterColaboratorController();
    //private final ColaboratorBootstrapper colabBoot = new ColaboratorBootstrapper();
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    private final TeamRepository teamRepo = PersistenceContext.repositories().teams();
    
    private List<Team> teams = new ArrayList<Team>();
    
   
    
    @Override
    public boolean execute() {       
        Colaborator c1 = colabRepo.findByMecanographicNumber(MecanographicNumber.valueOf("isep959")).get();
        Team team1 = teamRepo.findByTeamCode(TeamCode.valueOf("001")).get();
        Team team2 = teamRepo.findByTeamCode(TeamCode.valueOf("002")).get();
        
        List<Team> teams = new ArrayList<>();
        teams.add(team1);
        teams.add(team2);
        
        registerNewCatalogue(c1, "Catalogue with services for vacations", "Vacations", "Vacations Catalogue", teams);
        registerNewCatalogue(c1, "Catalogue for repairs", "Repairs", "Repairs Catalogue", teams);
        teams.remove(1);
        registerNewCatalogue(c1, "Catalogue For Books", "Books", "Books Catalogue", teams);
        
        return true;
    }
    
    private void registerNewCatalogue(Colaborator respColaborator, String catalogueId, String shortDescription, String catalogueTitle, List<Team> teams) {
        //Catalogue newCatalogue = new Catalogue(respColaborator, CatalogueId.valueOf(catalogueId), Description.valueOf(shortDescription),  Designation.valueOf(catalogueTitle));
        //teams.forEach(t -> {newCatalogue.addTeam(t);});
        catalogueController.RegisterCatalogue(respColaborator, catalogueId, shortDescription,  catalogueTitle, teams);
        LOGGER.debug("»»» Creating new Team %s", catalogueId);
    }
    
    
    
    
}
