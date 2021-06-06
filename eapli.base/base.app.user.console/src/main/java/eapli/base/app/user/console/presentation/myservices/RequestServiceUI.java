/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.user.console.presentation.myservices;


import eapli.base.app.user.console.presentation.mycatalogues.CataloguePrinter;
import eapli.base.cataloguemanagement.application.MyCataloguesController;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.domain.FormParameter;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.ticketmanagement.application.RequestServiceController;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class RequestServiceUI extends AbstractUI {
    private final RequestServiceController theController = new RequestServiceController();
    private final MyCataloguesController cataloguesController = new MyCataloguesController();
    //private final MyServicesController serviceController = new MyServicesController();
    
    @Override
    protected boolean doShow() {
        
        //final Iterable<Catalogue> catalogues = this.serviceController.myCatalogues();

        final Iterable<Catalogue> catalogues = this.cataloguesController.myCatalogues();

        final SelectWidget<Catalogue> catSelector = new SelectWidget<>("Catalogues:", catalogues,
                new CataloguePrinter());
        catSelector.show();

        final Catalogue theCatalogue = catSelector.selectedElement();
        
        final SelectWidget<Service> svcSelector = new SelectWidget<>("Services:", theController.getServicesByCatalogue(theCatalogue),
                new ServicePrinter());
        svcSelector.show();

        final Service theService = svcSelector.selectedElement();
        
        Form form = theService.getForm();
        List<FormParameter> params = new ArrayList<>();
        List<String> values = new ArrayList<>();
        
        for(FormParameter fp: form.getFormParameters()){
            System.out.println(fp.description());            
            String value = Console.readLine(fp.label().toString());
            
            params.add(fp);
            values.add(value);
            
        }
        
        theController.requestService(theService, params, values);
        
        return false;
    }

    @Override
    public String headline() {
        return "Request Service";
    }

   
}
