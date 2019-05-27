package ua.lviv.iot.dishesShop.manager;

import org.springframework.data.repository.CrudRepository;
import ua.lviv.iot.dishesShop.model.Dishes;

public interface DishesRepository extends CrudRepository<Dishes, Integer> {


}
