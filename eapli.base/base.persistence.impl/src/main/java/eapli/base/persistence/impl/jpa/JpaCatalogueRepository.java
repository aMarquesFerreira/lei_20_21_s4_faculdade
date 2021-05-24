package eapli.base.persistence.impl.jpa;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import eapli.base.Application;
import eapli.base.catalogue.repositories.CatalogueRepository;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueId;
import eapli.base.clientusermanagement.domain.ClientUser;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.clientusermanagement.repositories.ClientUserRepository;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SQLQuery;

/**
 *
 * @author Jorge Santos ajs@isep.ipp.pt 02/04/2016
 */
class JpaCatalogueRepository
        extends JpaAutoTxRepository<Catalogue, CatalogueId, CatalogueId>
        implements CatalogueRepository {   
    
    public JpaCatalogueRepository(TransactionalContext autoTx) {
        super(autoTx, "catalogueId");
    }

    public JpaCatalogueRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "catalogueId");
    }

    @Override
    public Optional<Catalogue> findByCatalogueId(CatalogueId catalogueId) {
        final Map<String, Object> params = new HashMap<>();
        params.put("catalogueId", catalogueId);
        return matchOne("e.catalogueId=:catalogueId", params);
    }

    @Override
    public Iterable<Catalogue> findAllActive() {
        //return match("e.catalogue.active = true");
        return match("e.active = true");
    }

    @Override
    public Iterable<Catalogue> findByColaborator(Colaborator who) {
        
        ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
        //Iterable<Team> teams = colabRepo.getTeams();
        
        TeamRepository teamRepo = PersistenceContext.repositories().teams();
        Iterable<Team> teams = teamRepo.findAll();
        List<Team> teamsColab = new ArrayList<>();
        for(Team t: teams){
            for(Colaborator c: t.colaborators()){
                if (c.equals(who)){
                    teamsColab.add(t);
                    break;
                }
            }
        }
        
        Iterable<Catalogue> catalogs = findAll();
        List<Catalogue> catalogsByColab =  new ArrayList<>();
        for(Catalogue c: catalogs){
            for(Team t : c.teams()){
                if (teamsColab.contains(t)){
                    catalogsByColab.add(c);
                    break;
                }
            }
        }
        
        return catalogsByColab;
/*        
        Iterable<Team> teams = teamRepo.findByColaborator(who);
        
        
        return null;*/
        /*
        
        //List<Team> teams = who.
        
        
        
        final Map<String, Object> params = new HashMap<>();
        params.put("colaborator", who);
        
        
        
        //colabRepo.findByTeam()
        
        return match("number in (select c.number from catalogue c join c.teams on c.numbercatalogue_team " +
                                "where teams_number in (select team_number "
                                                     + "from team_colaborator "
                                                     + "where colaborators_number=:colaborator"
                                                     + ")"

        return match("number in (select catalogue_number from catalogue_team " +
                                "where teams_number in (select team_number "
                                                     + "from team_colaborator "
                                                     + "where colaborators_number=:colaborator"
                                                     + ")"
                               + ")");
        
        //return match("who in select (team)   e. inner join teams t on e      e.who=:who", params);
        */
    }
    
    /*
    number in 
        (select catalogue_number from catalogue_team 
            where teams_number in (select team_number from team_colaborator where colaborators_number=:colaborator))
    
    */
}

