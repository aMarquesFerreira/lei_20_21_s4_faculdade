/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.user.console.presentation.mycatalogues;


import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.presentation.console.ListUI;
import eapli.framework.presentation.console.ListWidget;
import eapli.framework.visitor.Visitor;

import java.util.function.Supplier;

/**
 *
 * @author andre
 */
public class ListCataloguesUI<T> extends ListUI<T> {
    
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    public ListCataloguesUI(final Supplier<Iterable<T>> source, final Visitor<T> printer,
            final String elementName, final String headline, final String emptyMessage) {
        super(source, printer, elementName,
                String.format("#  %-15s%-15s%-10s", "ON", "TYPE", "AMOUNT"), headline,
                emptyMessage);
    }

    /**
     *
     * @return true if the user wants to leave this UI
     */
    @Override
    protected boolean doShow() {
        final Iterable<T> catalogues = elements();
        if (!catalogues.iterator().hasNext()) {
            System.out.println("There is no registered " + elementName());
        } else {
            new ListWidget<>("Listing " + elementName() + "s", catalogues, elementPrinter()).show();
        }
        return true;
    }

    

    @Override
    public String headline() {
        return authz.session().map(
                s -> "base [@" + s.authenticatedUser().identity() + "]   " )
                .orElseThrow(IllegalStateException::new);
    }
    
    @Override
    protected void drawFormTitle(final String title) {
        final String titleBorder = BORDER.substring(0, 2) + " " + title;
        System.out.println(titleBorder);
        drawFormBorder();
    }
}
