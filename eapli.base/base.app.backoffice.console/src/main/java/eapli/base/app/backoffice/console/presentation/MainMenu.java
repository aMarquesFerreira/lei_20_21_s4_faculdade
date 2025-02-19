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
package eapli.base.app.backoffice.console.presentation;

import eapli.base.Application;
import eapli.base.app.backoffice.console.presentation.activity.AssignActivityToColabAction;
import eapli.base.app.backoffice.console.presentation.activity.RegisterActivityAction;
import eapli.base.app.backoffice.console.presentation.authz.AddUserUI;
import eapli.base.app.backoffice.console.presentation.authz.DeactivateUserAction;
import eapli.base.app.backoffice.console.presentation.authz.ListUsersAction;
import eapli.base.app.backoffice.console.presentation.catalogue.RegisterCatalogueAction;
import eapli.base.app.backoffice.console.presentation.clientuser.AcceptRefuseSignupRequestAction;
import eapli.base.app.backoffice.console.presentation.colaborator.AddColaboratorToTeamAction;
import eapli.base.app.backoffice.console.presentation.colaborator.RegisterColaboratorAction;
import eapli.base.app.backoffice.console.presentation.team.RegisterTeamAction;
import eapli.base.app.backoffice.console.presentation.typeofteam.RegisterTypeOfTeamAction;
import eapli.base.app.common.console.presentation.authz.MyUserMenu;
import eapli.base.backoffice.console.presentation.form.RegisterFormAction;
import eapli.base.backoffice.console.presentation.service.FinishServiceAction;
import eapli.base.backoffice.console.presentation.service.RegisterServiceAction;
import eapli.base.backoffice.console.presentation.workflow.RegisterWorkflowAction;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.ExitWithMessageAction;
import eapli.framework.presentation.console.ShowMessageAction;
import eapli.framework.presentation.console.menu.HorizontalMenuRenderer;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

/**
 * TODO split this class in more specialized classes for each menu
 *
 * @author Paulo Gandra Sousa
 */
public class MainMenu extends AbstractUI {

    private static final String RETURN_LABEL = "Return ";

    private static final int EXIT_OPTION = 0;

    // USERS
    private static final int ADD_USER_OPTION = 1;
    private static final int LIST_USERS_OPTION = 2;
    private static final int DEACTIVATE_USER_OPTION = 3;
    private static final int ACCEPT_REFUSE_SIGNUP_REQUEST_OPTION = 4;

    // SETTINGS
    private static final int SET_LABORAL_TIME = 1;


    // MEALS
    private static final int LIST_MEALS_OPTION = 1;
    private static final int MEAL_REGISTER_OPTION = 2;

    // CATALOGUES
    private static final int CATALOGUE_REGISTER_OPTION = 1;

    // COLABORATORS
    private static final int COLABORATOR_REGISTER_OPTION = 1;
    private static final int COLABORATOR_ADD_TOTEAM = 2;

    // TEAMS
    private static final int TEAM_REGISTER_OPTION = 1;
    private static final int TYPEOFTEAM_REGISTER_OPTION = 1;
    
    
    // SERVICES
    private static final int SERVICE_REGISTER_OPTION = 1;
    private static final int FORM_REGISTER_OPTION = 2;
    private static final int SERVICE_FINISH_OPTION = 3;
    private static final int LIST_ACTIVE_SERVICES= 4;
    private static final int LIST_INACTIVE_SERVICES = 5;
    //private static final int LIST_ALL_SERVICES = 6;
    
    
    //WORKFLOW 
    private static final int WORKFLOW_REGISTER_OPTION = 1;
    
    //ACTIVITY
    private static final int ACTIVITY_REGISTER_OPTION = 1;
    private static final int ASSIGN_ACTIVITY_TO_COLAB_OPTION = 2;
    

    // MAIN MENU
    private static final int MY_USER_OPTION = 1;
    private static final int USERS_OPTION = 2;
    private static final int CATALOGUE_OPTION = 3;
    private static final int COLABORATOR_OPTION = 4;
    private static final int TEAM_OPTION = 5;
    private static final int TYPEOFTEAM_OPTION = 6;
    private static final int SERVICE_OPTION = 7;
    private static final int WORKFLOW_OPTION = 8;
    private static final int ACTIVITY_OPTION = 9;
    
    
    
    
    
    private static final int SETTINGS_OPTION = 10;
    private static final int DISH_OPTION = 11;
    private static final int TRACEABILITY_OPTION = 12;
    private static final int MEALS_OPTION = 13;
    private static final int REPORTING_DISHES_OPTION = 14;
    

    private static final String SEPARATOR_LABEL = "--------------";

    private final AuthorizationService authz = AuthzRegistry.authorizationService();

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
        final MenuRenderer renderer;
        if (Application.settings().isMenuLayoutHorizontal()) {
            renderer = new HorizontalMenuRenderer(menu, MenuItemRenderer.DEFAULT);
        } else {
            renderer = new VerticalMenuRenderer(menu, MenuItemRenderer.DEFAULT);
        }
        return renderer.render();
    }

    @Override
    public String headline() {

        return authz.session().map(s -> "Base [ @" + s.authenticatedUser().identity() + " ]")
                .orElse("Base [ ==Anonymous== ]");
    }

    private Menu buildMainMenu() {
        final Menu mainMenu = new Menu();

        final Menu myUserMenu = new MyUserMenu();
        mainMenu.addSubMenu(MY_USER_OPTION, myUserMenu);

        if (!Application.settings().isMenuLayoutHorizontal()) {
            mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
        }

        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.POWER_USER, BaseRoles.ADMIN)) {
            final Menu usersMenu = buildCataloguesMenu();
            mainMenu.addSubMenu(CATALOGUE_OPTION, usersMenu);
        }

        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.POWER_USER, BaseRoles.ADMIN)) {
            final Menu usersMenu = buildColaboratorMenu();
            mainMenu.addSubMenu(COLABORATOR_OPTION, usersMenu);
        }

        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.POWER_USER, BaseRoles.ADMIN)) {
            final Menu usersMenu = buildTeamMenu();
            mainMenu.addSubMenu(TEAM_OPTION, usersMenu);
        }

        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.POWER_USER, BaseRoles.ADMIN)) {
            final Menu usersMenu = buildServiceMenu();
            mainMenu.addSubMenu(SERVICE_OPTION, usersMenu);
        }
         
        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.POWER_USER, BaseRoles.ADMIN)) {
            final Menu usersMenu = buildTypeOfTeamMenu();
            mainMenu.addSubMenu(TYPEOFTEAM_OPTION, usersMenu);
        }
        
        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.POWER_USER, BaseRoles.ADMIN)) {
            final Menu usersMenu = buildWorkflowMenu();
            mainMenu.addSubMenu(WORKFLOW_OPTION, usersMenu);
        }
        
        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.POWER_USER, BaseRoles.ADMIN)) {
            final Menu usersMenu = buildActivityMenu();
            mainMenu.addSubMenu(ACTIVITY_OPTION, usersMenu);
        }
         
        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.POWER_USER, BaseRoles.ADMIN)) {
            final Menu usersMenu = buildUsersMenu();
            mainMenu.addSubMenu(USERS_OPTION, usersMenu);
            final Menu settingsMenu = buildAdminSettingsMenu();
            mainMenu.addSubMenu(SETTINGS_OPTION, settingsMenu);
        }

        if (!Application.settings().isMenuLayoutHorizontal()) {
            mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
        }

        mainMenu.addItem(EXIT_OPTION, "Exit", new ExitWithMessageAction("Bye, Bye"));

        return mainMenu;
    }

    private Menu buildAdminSettingsMenu() {
        final Menu menu = new Menu("Settings >");

        menu.addItem(SET_LABORAL_TIME, "Set laboral time",
                new ShowMessageAction("Not implemented yet"));
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildUsersMenu() {
        final Menu menu = new Menu("Users >");

        menu.addItem(ADD_USER_OPTION, "Add User", new AddUserUI()::show);
        menu.addItem(LIST_USERS_OPTION, "List all Users", new ListUsersAction());
        menu.addItem(DEACTIVATE_USER_OPTION, "Deactivate User", new DeactivateUserAction());
        menu.addItem(ACCEPT_REFUSE_SIGNUP_REQUEST_OPTION, "Accept/Refuse Signup Request",
                new AcceptRefuseSignupRequestAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildCataloguesMenu() {
        final Menu menu = new Menu("Catalogues >");

        menu.addItem(CATALOGUE_REGISTER_OPTION, "Register Catalogue", new RegisterCatalogueAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildColaboratorMenu() {
        final Menu menu = new Menu("Colaborators >");

        menu.addItem(COLABORATOR_REGISTER_OPTION, "Register Colaborator", new RegisterColaboratorAction());
        menu.addItem(COLABORATOR_ADD_TOTEAM, "Add Colaborator to team", new AddColaboratorToTeamAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }


    private Menu buildTeamMenu() {
        final Menu menu = new Menu("Teams >");

        menu.addItem(TEAM_REGISTER_OPTION, "Register a Team", new RegisterTeamAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }
      
      private Menu buildTypeOfTeamMenu() {
        final Menu menu = new Menu("Types of team >");

        menu.addItem(TYPEOFTEAM_REGISTER_OPTION, "Register a Type of team", new RegisterTypeOfTeamAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }
      
      private Menu buildServiceMenu() {
        final Menu menu = new Menu("Services >");

        menu.addItem(SERVICE_REGISTER_OPTION, "Register Service", new RegisterServiceAction());
        menu.addItem(FORM_REGISTER_OPTION, "Register Form", new RegisterFormAction());
        menu.addItem(SERVICE_FINISH_OPTION, "Finish Service Registration", new FinishServiceAction());
        //menu.addItem(SERVICE_REGISTER_OPTION, "Register Service", new RegisterServiceAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }
      
    private Menu buildWorkflowMenu() {
        final Menu menu = new Menu("Workflows >");

        menu.addItem(WORKFLOW_REGISTER_OPTION, "Register Workflow", new RegisterWorkflowAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }
      
    private Menu buildActivityMenu() {
        final Menu menu = new Menu("Activities >");

        menu.addItem(ACTIVITY_REGISTER_OPTION, "Register Activity", new RegisterActivityAction());
        menu.addItem(ASSIGN_ACTIVITY_TO_COLAB_OPTION, "Assign Activity to Colaborator", new AssignActivityToColabAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }
      
       
    




}
