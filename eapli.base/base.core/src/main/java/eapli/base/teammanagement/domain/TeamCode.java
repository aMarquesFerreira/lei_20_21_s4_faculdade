/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.teammanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 *
 * @author andre
 */
@Embeddable
public class TeamCode implements ValueObject, Comparable<TeamCode>  {
    
     private static final long serialVersionUID = 1L;
     
     private String number;
     
      public TeamCode(final String teamCode) {
        if (StringPredicates.isNullOrEmpty(teamCode)) {
            throw new IllegalArgumentException(
                    "Team code should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.number = teamCode;
    }
      
    protected TeamCode() {
        // for ORM
    }
    
    public static TeamCode valueOf(final String teamCode) {
        return new TeamCode(teamCode);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TeamCode)) {
            return false;
        }

        final TeamCode that = (TeamCode) o;
        return this.number.equals(that.number);
    }
    
     @Override
    public int hashCode() {
        return this.number.hashCode();
    }

    @Override
    public String toString() {
        return this.number;
    }
    
    @Override
    public int compareTo(final TeamCode arg0) {
        return number.compareTo(arg0.number);
    }
      
     
    
}
