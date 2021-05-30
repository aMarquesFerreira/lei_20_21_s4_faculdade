/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.formmanagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author andre
 */
@Entity
public class FormParameterAnswer implements AggregateRoot<FormParameterAnswerId>{
    
    /*private String parameterData;
    private String variableName;
    private String label;
    private String description;*/
    

    @XmlElement
    @JsonProperty
    @EmbeddedId
    private FormParameterAnswerId formParameterAnswerId;
    
    @Version
    private Long version;    
    
    @XmlElement
    @JsonProperty
    private Answer answer;

    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @ManyToOne()
    private FormParameter formParameter;
    
    @ManyToOne()
    private FormAnswer formAnswer;

    /**
     * Constructor.
     *
     * @param respColaborator
     * @param catalogueId
     * @param shortDescription
     * @param catalogueTitle
     */
    public FormParameterAnswer(final FormParameterAnswerId formParameterAnswerId, final FormParameter formParameter, final Answer answer) {
        if (formParameterAnswerId == null || answer == null || formParameter == null) {
            throw new IllegalArgumentException();
        }
        this.formParameterAnswerId = formParameterAnswerId;
        this.answer = answer;
        this.formParameter = formParameter;
    }

    protected FormParameterAnswer() {
        // for ORM only
    }


    public FormParameter formParameter() {
        return this.formParameter;
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
        final FormParameterAnswer formParameterAnswer = (FormParameterAnswer) other;
        return DomainEntities.areEqual(this, other);
    }


    public FormParameterAnswerId formParameterAnswerId() {
        return identity();
    }
    
    public Answer answer() {
        return this.answer;
    }

    @Override
    public FormParameterAnswerId identity() {
        return this.formParameterAnswerId;
    }

    
}
