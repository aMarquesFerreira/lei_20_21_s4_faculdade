/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.user.console.presentation.mycatalogues;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.framework.visitor.Visitor;

/**
 *
 * @author andre
 */
@SuppressWarnings("squid:S106")
public class CataloguePrinter implements Visitor<Catalogue> {
    
    @Override
    public void visit(final Catalogue visitee){
       System.out.printf("%-10s", visitee.identity(), visitee.isActive());
    }
}
