/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.cataloguemanagement.application;

import eapli.base.catalogue.repositories.CatalogueRepository;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import java.util.Calendar;
import java.util.Optional;

/**
 *
 * @author andre
 */
public class MyCataloguesController {
    
    private final CatalogueRepository catRepo = PersistenceContext.repositories().catalogues();
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final ListCatalogueService svcCatalogues = new ListCatalogueService();

    /**
     * Returns the catalogues of the authenticated colaborator.
     *
     * @return the catalogues of the authenticated colaborator
     */
    public Iterable<Catalogue> myCatalogues() {
        //authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.COLABORATOR);

        return currentUser().map(catRepo::findByColaborator).orElseThrow(IllegalStateException::new);
    }

    private Optional<Colaborator> currentUser() {
        return authz.session()
                .flatMap(s -> colabRepo.findByUsername(s.authenticatedUser().username()));
    }

   /* public Iterable<Meal> allMealsByDateAndType(final Calendar theDay, final MealType mealType) {
        return svcMeals.mealsByDayAndType(theDay, mealType);
    }*/

    /**
     *
     * @param theDay
     * @param mealType
     * @return
     */
    /*public Optional<Booking> iAlreadyHaveABooking(final Calendar theDay, final MealType mealType) {
        final CafeteriaUser user = currentUser().orElseThrow(IllegalStateException::new);
        return bookingsRepo.findByUserForADayAndMealType(user, theDay, mealType);
    }*/

    /**
     *
     * @param meal
     * @return
     * @see BookAMealForADayController#bookMeal(Meal, CafeteriaUser)
     */
    /*public BookingToken bookMealForMe(final Meal meal) {
        return new BookAMealForADayControllerImpl().bookMeal(meal,
                currentUser().orElseThrow(IllegalStateException::new));
    }*/
    
}
