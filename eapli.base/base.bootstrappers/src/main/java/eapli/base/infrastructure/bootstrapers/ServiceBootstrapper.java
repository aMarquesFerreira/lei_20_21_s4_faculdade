/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.infrastructure.bootstrapers;

import eapli.base.catalogue.repositories.CatalogueRepository;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueId;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.application.RegisterServiceController;
import eapli.base.servicemanagement.domain.ServiceCode;
import eapli.base.workflowmanagement.domain.WorkFlow;
import eapli.base.workflowmanagement.domain.WorkFlowId;
import eapli.base.workflowmanagement.repositories.WorkFlowRepository;
import eapli.framework.actions.Action;
import eapli.framework.general.domain.model.Description;
import eapli.framework.general.domain.model.Designation;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author andre
 */
public class ServiceBootstrapper implements Action {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceBootstrapper.class);

    private final RegisterServiceController serviceController = new RegisterServiceController();
    private final CatalogueRepository catRepo = PersistenceContext.repositories().catalogues();
    private final WorkFlowRepository workflowRepo = PersistenceContext.repositories().workflows();
   // private final TeamRepository teamRepo = PersistenceContext.repositories().teams();

    //private final List<Catalogue> catalogues = new ArrayList<Catalogue>();


    @Override
    public boolean execute() {
        //SERVICE 1
        Catalogue c1 = catRepo.findByCatalogueId(CatalogueId.valueOf("Catalogo Ausencias")).get();
        registerNewService("S1", "Pedido de Ausência Futura", "Ausencia", c1 );
        //SERVICE 1
        
        //SERVICE 2
        Catalogue c2 = catRepo.findByCatalogueId(CatalogueId.valueOf("Catalogo Descontos")).get();
        registerNewService("S2", "Autorização para Aplicação de Desconto", "Aplicação de Desconto", c2 );
        //SERVICE 2
        
        
        //SERVICE 3
        Catalogue c3 = catRepo.findByCatalogueId(CatalogueId.valueOf("Catalogo Demonstracao atividades auto")).get();
        registerNewService("S3", "Demonstracao atividades automaticas", "Demonstracao atividades automaticas", c3 );
        //SERVICE 3
     
        

        return true;
    }
    private void registerNewService(String serviceCode, String serviceDescription, String serviceTitle, Catalogue catalogue) {
        
        serviceController.RegisterService(serviceCode, serviceDescription, serviceTitle, catalogue);
        LOGGER.debug("»»» Creating new Service %s", serviceCode);
        
    }

    
}
