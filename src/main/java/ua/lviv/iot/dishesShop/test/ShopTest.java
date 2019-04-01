package ua.lviv.iot.dishesShop.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.dishesShop.manager.ShopManager;
import ua.lviv.iot.dishesShop.model.*;

public class ShopTest {

    private List<Dishes> dishesList;

    private ShopManager iShopManager;



    @BeforeEach
    public void beforeEach() {
        dishesList = new ArrayList<>();
        dishesList.add(new KitchenDishes(12.3, 10, "Poland", MaterialType.METAL, CookingType.FORCOOKING, WorkingType.GAS, true));
        dishesList.add(new Dinnerware(44, 4, "Germany", MaterialType.CERAMIC, 25, true));
        dishesList.add(new DishesForStorage(23, 100, "Ukraine", MaterialType.WOOD, 30, StorageType.WATER));
        dishesList.add(new Dishes(1,2,"A", MaterialType.CERAMIC));
        iShopManager = new ShopManager(dishesList);
    }

    @Test
    void testSortPriceAscendingTrue() {
        ShopManager.sortByPrice(dishesList , true);
        Assertions.assertEquals(44, dishesList.get(0).getPrice());
        Assertions.assertEquals(23, dishesList.get(1).getPrice());
        Assertions.assertEquals(12.3, dishesList.get(2).getPrice());
        Assertions.assertEquals(1, dishesList.get(3).getPrice());

    }

    @Test
    void testSortPriceAscendingFalse() {
        ShopManager.sortByPrice(dishesList , false);
        Assertions.assertEquals(1, dishesList.get(0).getPrice());
        Assertions.assertEquals(12.3, dishesList.get(1).getPrice());
        Assertions.assertEquals(23, dishesList.get(2).getPrice());
        Assertions.assertEquals(44, dishesList.get(3).getPrice());
    }


    @Test
    void testSortCapacityAscendingTrue() {
        ShopManager.sortByCapacity(dishesList, true);
        Assertions.assertEquals(100, dishesList.get(0).getCapacity());
        Assertions.assertEquals(10, dishesList.get(1).getCapacity());
        Assertions.assertEquals(4, dishesList.get(2).getCapacity());
        Assertions.assertEquals(2, dishesList.get(3).getCapacity());
    }

    @Test
    void testSortCapacityAscendingFalse(){
        ShopManager.sortByCapacity(dishesList, false);
        Assertions.assertEquals(2, dishesList.get(0).getCapacity());
        Assertions.assertEquals(4, dishesList.get(1).getCapacity());
        Assertions.assertEquals(10, dishesList.get(2).getCapacity());
        Assertions.assertEquals(100, dishesList.get(3).getCapacity());
    }


    @Test
    void testSearchCapacity() {
        Assertions.assertEquals(1, iShopManager.searchByCapacity(2).size());
        Assertions.assertEquals(1, iShopManager.searchByCapacity(4).size());
        Assertions.assertEquals(1, iShopManager.searchByCapacity(10).size());
        Assertions.assertEquals(1, iShopManager.searchByCapacity(100).size());
    }


    @Test
    void testSearchByMaterial() {
        Assertions.assertEquals(2, iShopManager.searchByMaterial(MaterialType.CERAMIC).size());
        Assertions.assertEquals(1, iShopManager.searchByMaterial(MaterialType.WOOD).size());
        Assertions.assertEquals(1, iShopManager.searchByMaterial(MaterialType.METAL).size());
        Assertions.assertEquals(0, iShopManager.searchByMaterial(MaterialType.GLASS).size());
    }




}
