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

    private final List<Team> allTeams = new ArrayList<Team>();
    private final List<Team> salesTeams = new ArrayList<Team>();


    @Override
    public boolean execute() {
        Colaborator c1 = colabRepo.findByMecanographicNumber(MecanographicNumber.valueOf("isep959")).get();
        //Colaborator c2 = colabRepo.findByMecanographicNumber(MecanographicNumber.valueOf("isep960")).get();
        Team team1 = teamRepo.findByTeamCode(TeamCode.valueOf("001")).get();
        Team team2 = teamRepo.findByTeamCode(TeamCode.valueOf("002")).get();
        Team team3 = teamRepo.findByTeamCode(TeamCode.valueOf("003")).get();
        Team team4 = teamRepo.findByTeamCode(TeamCode.valueOf("004")).get();
        Team team5 = teamRepo.findByTeamCode(TeamCode.valueOf("005")).get();
        Team team6 = teamRepo.findByTeamCode(TeamCode.valueOf("006")).get();
        
        //ALL TEAMS
        allTeams.add(team1);
        allTeams.add(team2);
        allTeams.add(team3);
        allTeams.add(team4);
        allTeams.add(team5);
        allTeams.add(team6);
        //ALL TEAMS
        
        //CATALOGUE WITH SERVICE 1
        registerNewCatalogue(c1, "Catalogo Ausencias", "Ausencias", "Catalogo onde contem servicos para ausencias", allTeams);
        //CATALOGUE WITH SERVICE 1
        
        //CATALOGUE WITH SERVICE 2
        salesTeams.add(team6);
        registerNewCatalogue(c1, "Catalogo Descontos", "Descontos", "Catalogo onde contem servicos para descontos", allTeams);
        //CATALOGUE WITH SERVICE 2
        
        
        //CATALOGUE WITH SERVICE 3
        registerNewCatalogue(c1, "Catalogo Demonstracao atividades auto", "Demonstracao", "Catalogo para demonstracao atividades automaticas", allTeams);
        //CATALOGUE WITH SERVICE 3

        return true;
    }

    private void registerNewCatalogue(Colaborator respColaborator, String catalogueId, String shortDescription, String catalogueTitle, List<Team> teams) {
        //Catalogue newCatalogue = new Catalogue(respColaborator, CatalogueId.valueOf(catalogueId), Description.valueOf(shortDescription),  Designation.valueOf(catalogueTitle));
        //teams.forEach(t -> {newCatalogue.addTeam(t);});
        catalogueController.RegisterCatalogue(respColaborator, catalogueId, shortDescription, catalogueTitle, teams);
        LOGGER.debug("»»» Creating new Team %s", catalogueId);
    }


}
