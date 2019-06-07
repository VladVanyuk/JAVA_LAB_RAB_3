package ua.lviv.iot.dishesShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.lviv.iot.dishesShop.manager.DishesRepository;
import ua.lviv.iot.dishesShop.model.Dishes;

import java.util.List;

public class DishesController {
    @Autowired
    private DishesRepository dishesRepository;

    @RequestMapping(value = "/dishes", method = RequestMethod.GET)
    public List<Dishes> getDishes() {
        return (List<Dishes>) dishesRepository.findAll();
    }

    @RequestMapping(value = "/dishes/{id}", method = RequestMethod.GET)
    public Dishes getDishes(@PathVariable Integer id) {
        return dishesRepository.findById(id).get();
    }

    @RequestMapping(value = "/dishes", method = RequestMethod.POST)
    public Dishes postDishes(@RequestBody Dishes dishes) {
        return dishesRepository.save(dishes);
    }

 /*   @RequestMapping(value = "/dishes/{id}", method = RequestMethod.PUT)
    public Dishes updateDishes(@RequestBody Dishes newDish, @PathVariable Integer id) {
        return dishesRepository.findById(id)
                .map(dishes -> {
                    newDish.setId(id);
                    return dishesRepository.save(newDish);
                }).orElseThrow();
    } */

    @RequestMapping(value = "/dishes/{id}", method = RequestMethod.DELETE)
    public Dishes deleteEquity(@PathVariable Integer id) {
        Dishes temp = getDishes(id);
        dishesRepository.deleteById(id);
        return temp;
    }
}
