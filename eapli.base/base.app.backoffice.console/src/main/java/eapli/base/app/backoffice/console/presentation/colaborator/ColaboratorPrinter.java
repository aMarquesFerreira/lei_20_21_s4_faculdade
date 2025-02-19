/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.backoffice.console.presentation.colaborator;

import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.framework.visitor.Visitor;

/**
 *
 * @author andre
 */
@SuppressWarnings("squid:S106")
public class ColaboratorPrinter implements Visitor<Colaborator>{
    @Override
    public void visit(final Colaborator visitee) {
        System.out.printf("%-10s", visitee.identity(),
                visitee.isActive());
    }
}
