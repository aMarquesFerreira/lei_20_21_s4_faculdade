/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.teammanagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.StringMixin;
import eapli.framework.strings.util.StringPredicates;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author andre
 */
public class TeamAcronym implements ValueObject, Comparable<TeamAcronym>, StringMixin {
    
    private static final long serialVersionUID = 1L;
    @XmlAttribute
    @JsonProperty     
    private String name;
     
    public TeamAcronym(final String name) {
        if (StringPredicates.isNullOrEmpty(name)) {
            throw new IllegalArgumentException(
                    "Team acronym should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.name = name;
    }
      
    protected TeamAcronym() {
        // for ORM
    }
    
    public static TeamAcronym valueOf(final String name) {
        return new TeamAcronym(name);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TeamAcronym)) {
            return false;
        }

        final TeamAcronym that = (TeamAcronym) o;
        return this.name.equals(that.name);
    }
    
     @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    @Override
    public int compareTo(final TeamAcronym arg0) {
        return name.compareTo(arg0.name);
    }
      
     
    
    
}
