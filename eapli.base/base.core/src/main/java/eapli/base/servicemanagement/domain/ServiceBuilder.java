package eapli.base.servicemanagement.domain;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.framework.domain.model.DomainFactory;
import eapli.framework.general.domain.model.Description;
import eapli.framework.general.domain.model.Designation;

public class ServiceBuilder implements DomainFactory<Service> {



    private ServiceCode serviceCode;
    private Designation designation;
    private Description description;
    private Catalogue catalogue;

    public ServiceBuilder withAll(ServiceCode serviceCode, final Description serviceDescription, final Designation serviceTitle, final Catalogue catalogue) {
        this.serviceCode = serviceCode;
        this.description = serviceDescription;
        this.designation = serviceTitle;
        this.catalogue = catalogue;

        return this;
    }

    public ServiceCode withCode(ServiceCode serviceCode) {

        return this.serviceCode = serviceCode;
    }

    public Designation withDesignation(Designation designation) {
        return this.designation = designation;
    }
    
    public Description withDescription(Description description) {
        return this.description = description;
    }
    

    public Catalogue withCatalogue(Catalogue catalogue) {
        return this.catalogue = catalogue;

    }

    @Override
    public Service build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new Service(this.serviceCode, this.description, this.designation,this.catalogue);
    }
}
