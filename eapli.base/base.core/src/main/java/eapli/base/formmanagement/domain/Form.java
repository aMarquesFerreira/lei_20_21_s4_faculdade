/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.formmanagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.general.domain.model.Designation;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
@Entity
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
     * cascade = CascadeType.NONE
     */
    /*@ManyToOne()
    private Service service;*/
    
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<FormParameter> formParameters;
   
    /**
     * Constructor.
     *
     * @param formId
     * @param name
     * @param service
     * @param formParameters
     */
    public Form(final FormId formId, final Designation name, /*Service service, */List<FormParameter> formParameters) {
        //this.formPar = new ArrayList<String>();        
        if (formId == null || name == null ||/* service == null || */formParameters == null) {
            throw new IllegalArgumentException();
        }
        this.formId = formId;
        this.name = name;
        /*this.service = service;*/
        formParameters = new ArrayList<>();
        this.active = true;

    }

    protected Form() {
        // for ORM only
    }

    /*public Service service() {
        return this.service;
    }*/

    public Iterable<FormParameter> getFormParameters() {
        return formParameters;
    }

    
    public boolean addFormParameters(final FormParameter fp) {
        for (FormParameter formP : formParameters) {
            if (formP.equals(fp)) {
                return false;
            }
        }
        return formParameters.add(fp);
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
