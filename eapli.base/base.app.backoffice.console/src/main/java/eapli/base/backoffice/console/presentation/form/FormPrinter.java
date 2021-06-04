/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.backoffice.console.presentation.form;

import eapli.base.formmanagement.domain.Form;
import eapli.framework.visitor.Visitor;

/**
 *
 * @author andre
 */
public class FormPrinter implements Visitor<Form> {
    
    @Override
    public void visit(final Form visitee) {
        System.out.printf("%-10s", visitee.identity(), visitee.isActive());
    }
}
