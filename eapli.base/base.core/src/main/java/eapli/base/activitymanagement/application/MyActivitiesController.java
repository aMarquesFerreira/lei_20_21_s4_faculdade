/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.activitymanagement.application;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.domain.ActivityExecution;
import eapli.base.activitymanagement.dto.TicketActivityExecutionDto;
import eapli.base.activitymanagement.repositories.ActivityRepository;
import eapli.base.catalogue.repositories.CatalogueRepository;
import eapli.base.cataloguemanagement.application.ListCatalogueService;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.ticketmanagement.repositories.TicketRepository;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import java.util.Optional;

/**
 *
 * @author andre
 */
public class MyActivitiesController {
    
    private final ActivityRepository actRepo = PersistenceContext.repositories().activities();
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final ListCatalogueService svcCatalogues = new ListCatalogueService();
    private final TicketRepository ticketRepo = PersistenceContext.repositories().tickets();
    
    
    /**
     * Returns the catalogues of the authenticated colaborator.
     *
     * @return the catalogues of the authenticated colaborator
     */
    public Iterable<TicketActivityExecutionDto> myActivities() {
        //authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.COLABORATOR);

        return ticketRepo.findActivitiesAssignedTo(currentUser().get());
                
        //return currentUser().map(actRepo::findByColaborator).orElseThrow(IllegalStateException::new);
    }

    private Optional<Colaborator> currentUser() {
        return authz.session()
                .flatMap(s -> colabRepo.findByUsername(s.authenticatedUser().username()));
    }
    
    
    /*public Iterable<Catalogue> myCataloguesForBootstrapp(MecanographicNumber mcn) {
        Optional<Colaborator> colab = colabRepo.findByMecanographicNumber(mcn);
        
        catRepo.findByColaborator(colab);
        
        return 
    }*/

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
