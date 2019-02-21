package ua.lviv.iot.dishesShop.manager;

import ua.lviv.iot.dishesShop.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Comparator;


public class ShopManager {

    private List<Dishes> dishesList = new ArrayList<>();

    public void toAdd(Dishes dishes){
        dishesList.add (dishes);
    }

    public ShopManager(){
    }

    public ShopManager(List<Dishes> dishesList){
        this.dishesList= dishesList;
    }


    public List<Dishes> sortByPrice(boolean ascending) {
        if (ascending) {
            Collections.sort(dishesList, Comparator.comparing(Dishes::getPrice).reversed());
        } else {
            Collections.sort(dishesList, Comparator.comparing(Dishes::getPrice));
        }return dishesList;
    }

    public List<Dishes> sortByCapacity(boolean ascending) {
        if (ascending) {
            Collections.sort(dishesList, Comparator.comparing(Dishes::getCapacity).reversed());
        } else {
            Collections.sort(dishesList, Comparator.comparing(Dishes::getCapacity));
        }return dishesList;
    }

    public List<Dishes> searchByCapacity(double capacity) {
        return dishesList.stream().filter(vessel -> vessel.getCapacity() == capacity).
                collect(Collectors.toList());
    }

    public List<Dishes> searchByMaterial(MaterialType material) {
        return dishesList.stream().filter(vessel -> vessel.getMaterial() == material).
                collect(Collectors.toList());
    }
}
