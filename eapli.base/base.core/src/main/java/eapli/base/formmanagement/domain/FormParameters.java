/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.formmanagement.domain;

import eapli.base.teammanagement.domain.Team;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 *
 * @author andre
 */
public class FormParameters implements ValueObject, Comparable<FormParameters>{
    

    private String parameterData;
    private String variableName;
    private String label;
    private String description;
   // private boolean active;

    /**
     * Constructor.
     *
     * @param parameterData
     * @param variableName
     * @param label
     * @param description
     */
    public FormParameters(String parameterData, String variableName, String label, String description) {
        if (StringPredicates.isNullOrEmpty(parameterData)||StringPredicates.isNullOrEmpty(variableName)
            ||StringPredicates.isNullOrEmpty(label)||StringPredicates.isNullOrEmpty(description)) {
            throw new IllegalArgumentException(
                    "Form parameters should neither be null nor empty");
        }
        this.parameterData = parameterData;
        this.variableName = variableName;
        this.label = label;
        this.description = description;
        //this.active = true;
        
    }

    protected FormParameters() {
        // for ORM only
    }
    
    
    public static FormParameters valueOf(final String parameterData, final String variableName, final String label, final String description) {
        return new FormParameters(parameterData, variableName, label, description);
    }
    
   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FormParameters other = (FormParameters) obj;
        if (!Objects.equals(this.variableName, other.variableName)) {
            return false;
        }
        if (!Objects.equals(this.label, other.label)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
    
    @Override
    public int hashCode() {
        return this.parameterData.hashCode();
    }

    @Override
    public String toString() {
        return this.parameterData;
    }
    
    @Override
    public int compareTo(final FormParameters arg0) {
        return parameterData.compareTo(arg0.parameterData);
    }
    
   /* public boolean isActive() {
        return this.active;
    }

    public boolean toggleState() {

        this.active = !this.active;
        return isActive();
    }*/
   
    
}
