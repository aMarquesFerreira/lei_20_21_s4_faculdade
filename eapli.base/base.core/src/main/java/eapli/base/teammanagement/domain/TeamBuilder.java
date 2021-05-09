package eapli.base.teammanagement.domain;


import eapli.framework.domain.model.DomainFactory;
import eapli.framework.general.domain.model.Designation;

public class TeamBuilder implements DomainFactory<Team> {

    private TeamCode teamCode;
    private Designation designation;
    private TeamAcronym teamAcronym;

    public TeamBuilder withAll(TeamCode code, Designation designation, TeamAcronym acronym) {
        this.teamCode = code;
        this.designation = designation;
        this.teamAcronym = acronym;
        return this;
    }

    public TeamBuilder withTeamCode(TeamCode code) {
        this.teamCode = code;
        return this;
    }

    public TeamBuilder withDesignation(Designation designation) {
        this.designation = designation;
        return this;
    }

    public TeamBuilder withTeamAcronym(TeamAcronym acronym) {
        this.teamAcronym = acronym;
        return this;
    }

    @Override
    public Team build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new Team(this.teamCode, this.designation, this.teamAcronym);
    }
}
