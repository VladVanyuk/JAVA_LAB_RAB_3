package ua.lviv.iot;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.dishesShop.manager.ShopManager;
import ua.lviv.iot.dishesShop.model.*;

public class RepairManagerTest {

    private List<Dishes> dishesList;

    private ShopManager iShopManager;



    @BeforeEach
    public void beforeEach() {
        dishesList = new ArrayList<>();
        dishesList.add(new KitchenDishes(12.3, 10, "Poland", MaterialType.METAL, CookingType.FORCOOKING, WorkingType.GAS, true);
        dishesList.add(new Dinnerware(44, 4, "Germany", MaterialType.CERAMIC, 25, true));
        dishesList.add(new DishesForStorage(23, 100, "Ukraine", MaterialType.WOOD, 30, StorageType.WATER));
        dishesList.add(new Dishes(1,2,"A", MaterialType.CERAMIC));
        iShopManager = new ShopManager(dishesList);
    }

    @Test
    void testSortPriceAscending() {
        ShopManager.sortByPrice(dishesList , true);
        Assertions.assertEquals(300, dishesList.get(2).getPrice());
    }

    @Test
    void testSortPriceAscendingR() {
        ShopManager.sortByPrice(dishesList , false);
        Assertions.assertEquals(300, dishesList.get(2).getPrice());
    }

    @Test
    void testSortProducerAscending() {
        ShopManager.sortByCapacity(dishesList , true);
        Assertions.assertEquals(36, dishesList.get(1).getCapacity());
    }

    @Test
    void testSortProducerAscendingR() {
        ShopManager.sortByCapacity(dishesList , false);
        Assertions.assertEquals(36, dishesList.get(2).getCapacity());
    }

    @Test
    void testFilterByMaterial() {
        Assertions.assertEquals(2, iShopManager.searchByMaterial(MaterialType.CERAMIC).size());
        Assertions.assertEquals(1, iShopManager.searchByMaterial(MaterialType.WOOD).size());
        Assertions.assertEquals(1, iShopManager.searchByMaterial(MaterialType.METAL).size());
        Assertions.assertEquals(1, iShopManager.searchByMaterial(MaterialType.GLASS).size());
    }


}
