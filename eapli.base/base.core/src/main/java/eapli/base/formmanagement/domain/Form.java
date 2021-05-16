/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.formmanagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.base.servicemanagement.domain.Service;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.general.domain.model.Designation;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author andre
 */
public class Form implements AggregateRoot<FormId>{
    
    @Version
    private Long version;

    @XmlElement
    @JsonProperty
    @EmbeddedId
    private FormId formId;

    @XmlElement
    @JsonProperty
    @AttributeOverride(name = "value", column = @Column(name = "Name"))
    private Designation name;
    
    
    @XmlElement
    @JsonProperty
    private boolean active;


    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @OneToOne()
    private Service service;
    
    
    //private List<FormParameters> formPar;
    //private List<String> formPar;
    private FormParameters formParameters;
   
    /**
     * Constructor.
     *
     * @param formId
     * @param name
     * @param service
     * @param formParameters
     */
    public Form(final FormId formId, final Designation name, Service service, List<FormParameters> formParameters) {
        //this.formPar = new ArrayList<String>();        
        if (formId == null || name == null || service == null || formParameters == null) {
            throw new IllegalArgumentException();
        }
        this.formId = formId;
        this.name = name;
        this.service = service;
        formParameters = new ArrayList<>();
        this.active = true;

    }

    protected Form() {
        // for ORM only
    }


    public Service service() {
        return this.service;
    }
    
    public FormParameters formParameters() {
        return this.formParameters;
    }

    @Override
    public boolean equals(final Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    @Override
    public boolean sameAs(final Object other) {
        final Form form = (Form) other;
        return DomainEntities.areEqual(this, other) && isActive() == form.isActive();
    }

    public FormId formId() {
        return identity();
    }

    @Override
    public FormId identity() {
        return this.formId;
    }

    public Designation formName() {
        return this.name;
    }


    public boolean isActive() {
        return this.active;
    }

    public boolean toggleState() {

        this.active = !this.active;
        return isActive();
    }

   


    
   
}
