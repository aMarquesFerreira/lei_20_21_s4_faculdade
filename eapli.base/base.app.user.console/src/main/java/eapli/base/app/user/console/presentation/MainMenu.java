/*
 * Copyright (c) 2013-2019 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package eapli.base.app.user.console.presentation;


import eapli.base.app.common.console.presentation.authz.MyUserMenu;
import eapli.base.app.user.console.presentation.dashboard.ShowDashboardAction;
import eapli.base.app.user.console.presentation.mycatalogues.CataloguePrinter;
import eapli.base.app.user.console.presentation.myservices.RequestServiceAction;
import eapli.base.app.user.console.presentation.performactivities.PerformActivityAction;
import eapli.base.cataloguemanagement.application.MyCataloguesController;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.presentation.console.ExitWithMessageAction;
import eapli.framework.presentation.console.ListUI;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

/**
 * @author Paulo Gandra Sousa
 */
class MainMenu extends ClientUserBaseUI {

    private static final String SEPARATOR_LABEL = "--------------";

    private static final String RETURN = "Return ";

    private static final String NOT_IMPLEMENTED_YET = "Not implemented yet";

    private static final int EXIT_OPTION = 0;

    // MAIN MENU
    private static final int MY_USER_OPTION = 1;
    private static final int BOOKINGS_OPTION = 2;
    private static final int CATALOGUES_OPTION = 3;
    private static final int REQUEST_OPTION = 4;
    private static final int SETTINGS_OPTION = 5;
    private static final int DASHBOARD_OPTION = 6;
    private static final int PERFORM_OPTION = 7;
    
    //CATALOGUES MENU
    private static final int LIST_CATALOGUES_OPTION = 1;
    
    //REQUESTS MENU
    private static final int REQUEST_SERVICE_OPTION = 2;
    
    
    //DASHBOARD MENU
    private static final int SHOW_DASHBOARD_OPTION = 1;
    
    //PERFORMS
    private static final int PERFORM_ACTIVITY_OPTION = 1;

    // BOOKINGS MENU
    private static final int BOOK_A_MEAL_OPTION = 2;
    private static final int LIST_MY_BOOKINGS_OPTION = 3;

    // ACCOUNT MENU
    private static final int LIST_MOVEMENTS_OPTION = 1;

    // SETTINGS
    private static final int SET_USER_ALERT_LIMIT_OPTION = 1;

    private final AuthorizationService authz =
            AuthzRegistry.authorizationService();

    @Override
    public boolean show() {
        drawFormTitle();
        return doShow();
    }

    /**
     * @return true if the user selected the exit option
     */
    @Override
    public boolean doShow() {
        final Menu menu = buildMainMenu();
        final MenuRenderer renderer =
                new VerticalMenuRenderer(menu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildMainMenu() {
        final Menu mainMenu = new Menu();

        final Menu myUserMenu = new MyUserMenu();
        mainMenu.addSubMenu(MY_USER_OPTION, myUserMenu);

        mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
        
        mainMenu.addSubMenu(CATALOGUES_OPTION, buildCataloguesMenu());
        
        mainMenu.addSubMenu(REQUEST_SERVICE_OPTION, buildRequestMenu());

        mainMenu.addSubMenu(DASHBOARD_OPTION, buildDashboardMenu());

        mainMenu.addSubMenu(PERFORM_OPTION, buildPerformMenu());

        mainMenu.addItem(EXIT_OPTION, "Exit", new ExitWithMessageAction("Bye, Bye"));

        return mainMenu;
    }
    
    private Menu buildCataloguesMenu() {
        final Menu menu = new Menu("Catalogues");
       // menu.addItem(BOOK_A_MEAL_OPTION, "Book a meal", () -> new RegisterBookingUI().show());*/

        menu.addItem(LIST_CATALOGUES_OPTION, "My Catalogues", () -> {
            new ListUI<>(new MyCataloguesController().myCatalogues(), new CataloguePrinter(), "Catalogue",
                    String.format("   %-40s %-15s %s", "TOKEN", "DAY", "STATUS"), "List My Catalogues",
                    "No data").show();
            return true;
        });
        menu.addItem(EXIT_OPTION, RETURN, Actions.SUCCESS);
        return menu;
    }
    
     private Menu buildRequestMenu() {
        final Menu menu = new Menu("Requests");
        menu.addItem(REQUEST_SERVICE_OPTION, "Request Services", new RequestServiceAction());
        menu.addItem(EXIT_OPTION, RETURN, Actions.SUCCESS);
        return menu;
    }

    private Menu buildDashboardMenu() {
        final Menu menu = new Menu("Dashboard");
        menu.addItem(SHOW_DASHBOARD_OPTION, "Show Dashboard", new ShowDashboardAction());
        //menu.addItem(STOP_DASHBOARD_OPTION, "Stop Dashboard HTTP Server", new ShowDashboardAction());
        menu.addItem(EXIT_OPTION, RETURN, Actions.SUCCESS);
        return menu;
    }
    
    
    private Menu buildPerformMenu() {
        final Menu menu = new Menu("Activity Perform");
        menu.addItem(PERFORM_ACTIVITY_OPTION, "Perform Activity", new PerformActivityAction());
        //menu.addItem(STOP_DASHBOARD_OPTION, "Stop Dashboard HTTP Server", new ShowDashboardAction());
        menu.addItem(EXIT_OPTION, RETURN, Actions.SUCCESS);
        return menu;
    }
     
     
}
