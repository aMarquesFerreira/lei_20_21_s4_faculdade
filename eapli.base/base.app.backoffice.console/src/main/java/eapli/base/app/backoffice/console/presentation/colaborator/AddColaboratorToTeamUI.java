/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.backoffice.console.presentation.colaborator;

import eapli.base.app.backoffice.console.presentation.authz.SystemUserPrinter;
import eapli.base.app.backoffice.console.presentation.team.TeamPrinter;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.colaboratormanagement.application.AddColaboratorToTeamController;
import eapli.base.colaboratormanagement.application.ListColaboratorService;
import eapli.base.colaboratormanagement.application.RegisterColaboratorController;
import eapli.base.colaboratormanagement.domain.Address;
import eapli.base.colaboratormanagement.domain.BirthDate;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.domain.Contact;
import eapli.base.colaboratormanagement.domain.Evaluation;
import eapli.base.colaboratormanagement.domain.Name;
import eapli.base.teammanagement.application.ListTeamService;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.application.UserManagementService;
import eapli.framework.infrastructure.authz.domain.model.Role;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author andre
 */
public class AddColaboratorToTeamUI extends AbstractUI{

    private final AddColaboratorToTeamController theController = new AddColaboratorToTeamController();
    private final ListColaboratorService colabSvc = new ListColaboratorService();
    private final ListTeamService teamSvc = new ListTeamService();

    @Override
    protected boolean doShow() {
        // FIXME avoid duplication with SignUpUI. reuse UserDataWidget from

        Iterable<Colaborator> colaborators = colabSvc.activeColaborators();
        
        SelectWidget<Colaborator> userSelector = new SelectWidget<>("Colaborators:", colaborators);
        userSelector.show();

        Colaborator colab = userSelector.selectedElement();
        
        final Iterable<Team> teams = teamSvc.allTeams();
        
        final SelectWidget<Team> selector = new SelectWidget<>("Teams:", teams, new TeamPrinter());
        selector.show();
        
        final Team theTeam = selector.selectedElement();
        
        theController.addColaboratorToTeam(colab,theTeam);
        
        return false;
    }


    @Override
    public String headline() {
        return "Add Colaborator to Team";
    }
    
}
