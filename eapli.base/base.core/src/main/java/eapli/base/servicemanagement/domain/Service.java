/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.servicemanagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.formmanagement.domain.Form;
import eapli.base.workflowmanagement.domain.WorkFlow;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.general.domain.model.Description;
import eapli.framework.general.domain.model.Designation;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author andre
 */
@Entity
public class Service implements AggregateRoot<ServiceCode>{
    
    @Version
    private Long version;

    @XmlElement
    @JsonProperty
    @EmbeddedId
    private ServiceCode serviceCode;
    
    @XmlElement
    @JsonProperty
    @AttributeOverride(name = "value", column = @Column(name = "Description"))
    private Description serviceDescription;
    
    @XmlElement
    @JsonProperty
    @AttributeOverride(name = "value", column = @Column(name = "Title"))
    private Designation serviceTitle;
    
    @XmlElement
    @JsonProperty
    private boolean active;

    @OneToOne
    private WorkFlow workFlow;
    
    
    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @ManyToOne()
    private Catalogue catalogue;
    
    
//    @ManyToOne //(mappedBy = "service")
    @OneToOne (cascade = CascadeType.ALL)//(mappedBy = "service")
    private Form form;
   
               
    /**
     * Constructor.
     *
     * @param serviceCode
     * @param serviceDescription
     * @param serviceTitle
     * @param catalogue
     */
    public Service(final ServiceCode serviceCode, final Description serviceDescription, final Designation serviceTitle, final Catalogue catalogue) {
        if (serviceCode == null || serviceDescription == null || serviceTitle == null || catalogue == null) {
            throw new IllegalArgumentException();
        }
        this.serviceCode = serviceCode;
        this.serviceDescription = serviceDescription;
        this.serviceTitle = serviceTitle;
        this.catalogue = catalogue;
        this.form = null;
        this.active = false;//true;
        this.workFlow = null;       
    }
    
    protected Service() {
        // for ORM only
    }

    
    public Catalogue catalogue() {
        return this.catalogue;
    }
    
    public Form getForm() {
        return this.form;
    }

    public void setForm(Form form) {
        this.form = form;
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
        return DomainEntities.areEqual(this, other);
    }
    
    public ServiceCode serviceCode() {
        return identity();
    }
    
    @Override
    public ServiceCode identity() {
        return this.serviceCode;
    }
    
     public Description serviceDescription() {
        return this.serviceDescription;
    }
    
    public Designation serviceTitle() {
        return this.serviceTitle;
    }
    
    public boolean isActive() {
        return this.active;
    }

    public boolean toggleState() {

        this.active = !this.active;
        return isActive();
    }

    public WorkFlow getWorkFlow() {
        return workFlow;
    }

    /*public void addWorkFlow(WorkFlow workFlow) {
        this.workFlow = workFlow;
    }*/
    
    
    
}
