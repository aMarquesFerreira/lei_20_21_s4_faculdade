package eapli.base.formmanagement.domain;

import eapli.base.servicemanagement.domain.Service;
import eapli.framework.domain.model.DomainFactory;
import eapli.framework.general.domain.model.Designation;

import java.util.ArrayList;
import java.util.List;

public class FormBuilder implements DomainFactory<Form> {


    private FormId formId;
    private Designation designation;
    private Service service;
    private List<FormParameter> formParametersList = new ArrayList<>();

    public FormBuilder withAll(FormId formId, Designation designation, Service service, FormParameter formParameter) {
        this.formId = formId;
        this.designation = designation;
        this.service = service;
        formParametersList.add(formParameter);
        return this;
    }

    public FormId withFormID(FormId id) {

        return this.formId = id;
    }

    public Designation withDesignation(Designation designation1) {
        return this.designation = designation1;

    }

    public Service withService(Service service1) {
        return this.service = service1;
    }

    public List<FormParameter> withFormParameters(FormParameter formParameters) {
        formParametersList.add(formParameters);
        return formParametersList;
    }

    @Override
    public Form build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new Form(this.formId, this.designation, this.formParametersList);
    }
}
