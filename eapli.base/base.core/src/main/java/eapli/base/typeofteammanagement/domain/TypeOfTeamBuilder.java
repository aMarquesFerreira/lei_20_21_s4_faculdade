package eapli.base.typeofteammanagement.domain;
import eapli.framework.domain.model.DomainFactory;
import eapli.framework.general.domain.model.Description;


public class TypeOfTeamBuilder implements DomainFactory<TypeOfTeam> {



    private Color color;
    private Description description;


    public TypeOfTeamBuilder withAll(Color colorType, Description descriptionType) {
        this.color = colorType;
        this.description = descriptionType;
        return this;
    }

    public Color withColor(Color colorType) {

        return this.color = colorType;
    }

    public Description withDesignation(Description descriptionType) {
        return this.description = descriptionType;

    }

    @Override
    public TypeOfTeam build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new TypeOfTeam(this.color, this.description);
    }
}
