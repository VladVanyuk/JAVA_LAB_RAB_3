
import ua.lviv.iot.dishesShop.model.*;
import ua.lviv.iot.dishesShop.manager.ShopManager;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ShopManager managerShop = new ShopManager();


        KitchenDishes fryingPan = new KitchenDishes(12.3, 10, "Poland", MaterialType.METAL, CookingType.FORCOOKING, WorkingType.GAS, true);

        Dinnerware plate = new Dinnerware(44, 4, "Germany", MaterialType.CERAMIC, 25, true);

        DishesForStorage pitcher = new DishesForStorage(23, 100, "Ukraine", MaterialType.WOOD, 30, StorageType.WATER);


        List<Dishes> newDishesList = new ArrayList<>();

        managerShop.toAdd(fryingPan);
        managerShop.toAdd(plate);
        managerShop.toAdd(pitcher);

        System.out.println("Search by material:"+ managerShop.searchByMaterial(MaterialType.CERAMIC).toString()+ "\n"); //sorting by type

        System.out.println("Search by capacity:"+ managerShop.searchByCapacity(10)+ "\n");

        System.out.println("Sort by price"+ managerShop.sortByPrice(true)+ "\n");

        System.out.println("Sort by capacity"+ managerShop.sortByCapacity(true)+ "\n");



    }
}