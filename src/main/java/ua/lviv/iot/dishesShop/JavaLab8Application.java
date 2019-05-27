package ua.lviv.iot.dishesShop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.lviv.iot.dishesShop.manager.DishesRepository;
import ua.lviv.iot.dishesShop.model.*;
import ua.lviv.iot.dishesShop.manager.ShopManager;


@SpringBootApplication
public class JavaLab8Application {

    public static void main(String[] args) {
        SpringApplication.run(JavaLab8Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(final DishesRepository repository) {
        return (args) -> {
            repository.save(new KitchenDishes(12.3, 10, "Poland", MaterialType.METAL, CookingType.FORCOOKING, WorkingType.GAS, true));
            repository.save(new Dinnerware(44, 4, "Germany", MaterialType.CERAMIC, 25, true));
            repository.save(new DishesForStorage(23, 100, "Ukraine", MaterialType.WOOD, 30, StorageType.WATER));


            repository.findAll().forEach(goods -> System.out.println(goods));
            System.out.println("------------------------------------------------------------");

            System.out.println("------------------------------------------------------------");
        };

    }
}
