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

/**
 *
 * @author andre
 */
public class CatalogueBootstrapper /*implements Action*/{
    
    /* private static final Logger LOGGER = LoggerFactory.getLogger(
            CatalogueBootstrapper.class);
     
    private final ColaboratorRepository colaboratorRepo = PersistenceContext.repositories().colaborators();
    private final TeamRepository teamRepo = PersistenceContext.repositories().teams();
    private final RegisterCatalogueController controller = new RegisterCatalogueController();

    private Optional<Colaborator> getColaborator(final String mecanographicNumber) {
        return colaboratorRepo.ofIdentity(new MecanographicNumber(mecanographicNumber));
    }
    
    private Optional<Team> getTeam(final String teamCode) {
        return teamRepo.ofIdentity(new TeamCode(teamCode));
    }
    
    private final RegisterCatalogueController registerCatalogueController = new RegisterCatalogueController();

    @Override
    public boolean execute() {
        final Optional<Colaborator> colab1 = getColaborator(TestDataConstants.MECANOGRAPHIC_NUMBER_1);
        final Optional<Colaborator> colab2 = getColaborator(TestDataConstants.MECANOGRAPHIC_NUMBER_2);
        final Optional<Colaborator> colab3 = getColaborator(TestDataConstants.MECANOGRAPHIC_NUMBER_3);
        
        final Optional<Team> team1 = getTeam(TestDataConstants.TEAM_CODE_1);
        final Optional<Team> team2 = getTeam(TestDataConstants.TEAM_CODE_2);
        final Optional<Team> team3 = getTeam(TestDataConstants.TEAM_CODE_3);
        
       
        
        registerCatalogue(colab1, TestDataConstants.CATALOGUE_ID_1, TestDataConstants.SHORT_DESCRIPTION_1 TestDataConstants.CATALOGUE_TITLE_1);
        registerCatalogue(colab2, TestDataConstants.DISH_NAME_LENTILHAS_SALTEADAS, 180, 1, 2.85, allergeans4);
        registerCatalogue(colab3, TestDataConstants.DISH_NAME_BACALHAU_A_BRAZ, 250, 2, 3.99, allergeans1);
        
               

        return true;
        
    }

    private Catalogue registerCatalogue(final Colaborator respColaborator, final String catalogueId, final String shortDescription, final String catalogueTitle, List<Team> teams) {
        try {
            LOGGER.debug("{} ( {} )", catalogueId, respColaborator);
            
           final Catalogue newCatalogue = new Catalogue(respColaborator, CatalogueId.valueOf(catalogueId), Description.valueOf(shortDescription),  Designation.valueOf(catalogueTitle));
           teams.forEach(t -> {newCatalogue.addTeam(t);});
            
           return controller.RegisterCatalogue(respColaborator, catalogueId, shortDescription, catalogueTitle, teams);
             
        } catch (final IntegrityViolationException | ConcurrencyException
                | TransactionSystemException e) {
            // ignoring exception. assuming it is just a primary key violation
            // due to the tentative of inserting a duplicated object
            LOGGER.warn("Assuming {} already exists (see trace log for details on {} {})", 
                    catalogueId,
                    e.getClass().getSimpleName(), e.getMessage());
            LOGGER.trace("Assuming existing record", e);
            return null;
            
        }
    }

    /*private Colaborator registerColaborator(){
        SystemUser systemUser = new SystemUser("isep959", "Password1", "Mary Smith", "mary@smith.com", "isep959");
        registerColaboratorController.registerColaborator(systemUser, new MecanographicNumber("isep959"), new Name("Mary Smith"),
                new Address("Rua","Cidade"),
                new BirthDate(new Date(2005,12,12)),);

        return;
    }*/
    
}
