package eapli.base.infrastructure.bootstrapers;

import eapli.framework.time.util.Calendars;

import java.util.Calendar;

public final class TestDataConstants {

	public static final String DISH_TYPE_MEAT = "meat";
	public static final String DISH_TYPE_FISH = "fish";
	public static final String DISH_TYPE_VEGIE = "vegie";
        
        //COLABORATORS
        public static final String MECANOGRAPHIC_NUMBER_1 = "1200001";
	public static final String MECANOGRAPHIC_NUMBER_2 = "1200002";
	public static final String MECANOGRAPHIC_NUMBER_3 = "1200003";

        //CATALOGUES
        public static final String CATALOGUE_ID_1 = "1";
	public static final String CATALOGUE_ID_2 = "2";
	public static final String CATALOGUE_ID_3 = "3";
        
        //TEAMS
        public static final String TEAM_CODE_1 = "1";
	public static final String TEAM_CODE_2 = "2";
	public static final String TEAM_CODE_3 = "3";
        
        
        
        public static final String SHORT_DESCRIPTION_1 = "Vários serviços disponíveis de marcação de férias";
	public static final String SHORT_DESCRIPTION_2 = "vários serviços disponiveis de reposição de password";
	public static final String SHORT_DESCRIPTION_3 = "vários serviços possíveis para reclamações";
        
        public static final String CATALOGUE_TITLE_1 = "Marcação de Férias";
	public static final String CATALOGUE_TITLE_2 = "Reposição de Passwords";
	public static final String CATALOGUE_TITLE_3 = "Reclamações";
        
        
        
	public static final String ALLERGEN_CRUSTACEOS = "crustaceos";
	public static final String ALLERGEN_PEIXES = "peixes";
	public static final String ALLERGEN_GLUTEN = "gluten";

	public static final String DISH_NAME_COSTELETA_A_SALSICHEIRO = "costeleta à salsicheiro";
	public static final String DISH_NAME_PICANHA = "picanha";
	public static final String DISH_NAME_LAGOSTA_SUADA = "lagosta suada";
	public static final String DISH_NAME_BACALHAU_A_BRAZ = "bacalhau à braz";
	public static final String DISH_NAME_LENTILHAS_SALTEADAS = "lentilhas salteadas";
	public static final String DISH_NAME_TOFU_GRELHADO = "tofu grelhado";

	public static final String USER_TEST1 = "user1";

	@SuppressWarnings("squid:S2068")
	public static final String PASSWORD1 = "Password1";
        public static final String PASSANDRE = "ferreira1";

	@SuppressWarnings("squid:S2885")
	public static final Calendar DATE_TO_BOOK = Calendars.of(2017, 12, 01);

	private TestDataConstants() {
		// ensure utility
	}
}
