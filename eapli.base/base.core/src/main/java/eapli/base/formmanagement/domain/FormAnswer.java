/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.formmanagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.general.domain.model.Designation;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author andre
 */
@Entity
public class FormAnswer implements AggregateRoot<FormAnswerId> {
    
    @Version
    private Long version;

    @XmlElement
    @JsonProperty
    @EmbeddedId
    private FormAnswerId formAnswerId;
    
    @XmlElement
    @JsonProperty
    private boolean active;

    /**
     * cascade = CascadeType.NONE
     */
    @ManyToOne()
    private Form form;
    
    @ManyToOne()
    private Colaborator colaborator;
        
    
    @OneToMany()
    private List<FormParameterAnswer> formParametersAnswer;
   
    /**
     * Constructor.
     *
     * @param formAnswerId
     * @param name
     * @param service
     * @param formParameters
     */
    public FormAnswer(final FormAnswerId formAnswerId, Form form, Colaborator colaborator) {
            
        if (formAnswerId == null || colaborator == null || form == null || colaborator == null) {
            throw new IllegalArgumentException();
        }
        this.formAnswerId = formAnswerId;
        this.form = form;
        this.colaborator = colaborator;
        formParametersAnswer = new ArrayList<>();
        this.active = false;
    }

    protected FormAnswer() {
        // for ORM only
    }

    public Form form() {
        return this.form;
    }
    

    public Colaborator colaborator() {
        return this.colaborator;
    }
    
    public boolean addFormParameterAnswer(final FormParameterAnswer fpa) {
        if (formParametersAnswer.contains(fpa))
            return false;
        
        return formParametersAnswer.add(fpa);
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
        final FormAnswer formAnswer = (FormAnswer) other;
        return DomainEntities.areEqual(this, other) && isActive() == formAnswer.isActive();
    }

    public FormAnswerId formAnswerId() {
        return identity();
    }

    @Override
    public FormAnswerId identity() {
        return this.formAnswerId;
    }

    public boolean isActive() {
        return this.active;
    }

    public boolean toggleState() {

        this.active = !this.active;
        return isActive();
    }

   


    
   
    
}
