/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.typeofteammanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

/**
 *
 * @author Omen
 */
public class Color implements ValueObject, Comparable<Color> {
    
     private static final long serialVersionUID = 1L;
     
     private String color;
     
      public Color(final String color) {
        if (StringPredicates.isNullOrEmpty(color)) {
            throw new IllegalArgumentException(
                    "Color should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.color = color;
    }
      
    protected Color() {
        // for ORM
    }
    
    public static Color valueOf(final String color) {
        return new Color(color);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Color)) {
            return false;
        }

        final Color that = (Color) o;
        return this.color.equals(that.color);
    }
    
     @Override
    public int hashCode() {
        return this.color.hashCode();
    }

    @Override
    public String toString() {
        return this.color;
    }
    
    @Override
    public int compareTo(final Color arg0) {
        return color.compareTo(arg0.color);
    }
    
}
