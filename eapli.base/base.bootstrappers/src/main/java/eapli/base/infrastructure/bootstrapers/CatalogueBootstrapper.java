/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.infrastructure.bootstrapers;

import eapli.base.cataloguemanagement.application.RegisterCatalogueController;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.domain.TeamCode;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.framework.actions.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author andre
 */
public class CatalogueBootstrapper implements Action {


    private static final Logger LOGGER = LoggerFactory.getLogger(CatalogueBootstrapper.class);

    private final RegisterCatalogueController catalogueController = new RegisterCatalogueController();
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    private final TeamRepository teamRepo = PersistenceContext.repositories().teams();

    private final List<Team> teams = new ArrayList<Team>();


    @Override
    public boolean execute() {
        Colaborator c1 = colabRepo.findByMecanographicNumber(MecanographicNumber.valueOf("isep959")).get();
        Team team1 = teamRepo.findByTeamCode(TeamCode.valueOf("001")).get();
        Team team2 = teamRepo.findByTeamCode(TeamCode.valueOf("002")).get();

        List<Team> teams = new ArrayList<>();
        List<Team> teams2 = new ArrayList<>();
        teams.add(team1);
        teams2.add(team2);
        

        registerNewCatalogue(c1, "Catalogue with services for vacations ex", "Vacations", "Vacations Catalogue", teams);
        registerNewCatalogue(c1, "Catalogue for repairs ex", "Repairs", "Repairs Catalogue", teams);
        registerNewCatalogue(c1, "Catalogue For Books ex", "Books", "Books Catalogue", teams);
        
        //Service2
        registerNewCatalogue(c1, "Catalogo de Descontos", "Catalogo com servicos de descontos", "Catalogo de Descontos", teams2);
       //Service2

        return true;
    }

    private void registerNewCatalogue(Colaborator respColaborator, String catalogueId, String shortDescription, String catalogueTitle, List<Team> teams) {
        //Catalogue newCatalogue = new Catalogue(respColaborator, CatalogueId.valueOf(catalogueId), Description.valueOf(shortDescription),  Designation.valueOf(catalogueTitle));
        //teams.forEach(t -> {newCatalogue.addTeam(t);});
        catalogueController.RegisterCatalogue(respColaborator, catalogueId, shortDescription, catalogueTitle, teams);
        LOGGER.debug("»»» Creating new Team %s", catalogueId);
    }


}
