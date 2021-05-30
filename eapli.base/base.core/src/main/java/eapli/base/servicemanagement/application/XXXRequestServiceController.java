/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.servicemanagement.application;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.clientusermanagement.repositories.ClientUserRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.repositories.ServiceRepository;

/**
 *
 * @author andre
 */
public class XXXRequestServiceController {/*
    
    private final ServiceRepository serviceRepo = PersistenceContext.repositories().services();
    private final ClientUserRepository userRepo = PersistenceContext.repositories().clientUsers();

    /**
     *
     * @param when
     * @param forMeal
     * @return
     */
   /* @Override
    public Iterable<Service> getServicesOfCatalogue(final Catalogue catalogue, final Service service) {
        return serviceRepo.findByCatalogue(catalogue, service);
    }

    /**
     *
     * @param mealId
     * @param booker
     * @return
     */
   /* @Override
    public BookingToken bookMeal(final Long mealId, final MecanographicNumber booker) {
        final Meal meal = mealRepo.ofIdentity(mealId).orElseThrow(IllegalArgumentException::new);
        final CafeteriaUser user = userRepo.ofIdentity(booker).orElseThrow(IllegalArgumentException::new);
        return bookMeal(meal, user);
    }

    /**
     *
     * @param meal
     * @param booker
     * @return
     * @see MyBookingsController#bookMealForMe(Meal)
     */
   /* @Override
    public BookingToken bookMeal(final Meal meal, final CafeteriaUser booker) {
        // for pedagogical purposes: play around with the 2 approaches
        if (Application.settings().getUseEventfulControllers()) {
            return new BookAMealApplicationServiceEventfulImpl().bookMeal(meal, booker);
        } else {
            return new BookAMealApplicationServiceTransactionalImpl().bookMeal(meal, booker);
        }
    }
    */
}
