/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.backoffice.console.presentation.colaborator;


import eapli.base.app.backoffice.console.presentation.team.TeamPrinter;
import eapli.base.colaboratormanagement.application.AddColaboratorToTeamController;
import eapli.base.colaboratormanagement.application.ListColaboratorService;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.teammanagement.application.ListTeamService;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;


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
