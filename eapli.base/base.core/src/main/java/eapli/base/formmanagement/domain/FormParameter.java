/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.formmanagement.domain;


import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.general.domain.model.Description;
import eapli.framework.general.domain.model.Designation;
import eapli.framework.strings.util.StringPredicates;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlElement;


/**
 *
 * @author andre
 */
@Entity
public class FormParameter implements AggregateRoot<FormParameterId>{
    

    /*private String parameterData;
    private String variableName;
    private String label;
    private String description;*/
    
    @Version
    private Long version;

    @XmlElement
    @JsonProperty
    @EmbeddedId
    private FormParameterId formParameterId;

    @XmlElement
    @JsonProperty
    @AttributeOverride(name = "value", column = @Column(name = "variableName"))
    private Designation variableName;
    
    @XmlElement
    @JsonProperty
    @AttributeOverride(name = "value", column = @Column(name = "Label"))
    private Label label;

   
    @XmlElement
    @JsonProperty
    @AttributeOverride(name = "value", column = @Column(name = "Description"))
    private Description description;

    private FormParameterData formParameterData;

    @XmlElement
    @JsonProperty
    private boolean active;


    /**
     * Constructor.
     *
     * @param formId
     * @param variableName
     * @param label
     * @param description
     */
    public FormParameter(final FormParameterId formParameterId, final Designation variableName, final Label label, final Description description, final FormParameterData formParameterData) {
        if (formParameterId == null || variableName == null || label == null || description == null) {
            throw new IllegalArgumentException();
        }
        this.formParameterId = formParameterId;
        this.variableName = variableName;
        this.label = label;
        this.description = description;
        this.active = true;
        this.formParameterData = formParameterData;

    }

    protected FormParameter() {
        // for ORM only
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
        final FormParameter formParameter = (FormParameter) other;
        return DomainEntities.areEqual(this, other) && isActive() == formParameter.isActive();
    }


    public FormParameterId getFormParameterId() {
        return identity();
    }

    @Override
    public FormParameterId identity() {
        return this.formParameterId;
    }

    public Description description() {
        return this.description;
    }

    public Designation variableName() {
        return this.variableName;
    }

    public Label label() {
        return this.label;
    }

    public boolean isActive() {
        return this.active;
    }

    public boolean toggleState() {

        this.active = !this.active;
        return isActive();
    }

    
}
