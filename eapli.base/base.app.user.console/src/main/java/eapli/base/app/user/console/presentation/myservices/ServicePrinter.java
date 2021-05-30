/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.user.console.presentation.myservices;

import eapli.base.servicemanagement.domain.Service;
import eapli.framework.visitor.Visitor;

/**
 *
 * @author andre
 */
@SuppressWarnings("squid:S106")
public class ServicePrinter implements Visitor<Service> {
    
    @Override
    public void visit(final Service visitee){
       System.out.printf("%-10s", visitee.identity(), visitee.isActive());
    }
    
}
