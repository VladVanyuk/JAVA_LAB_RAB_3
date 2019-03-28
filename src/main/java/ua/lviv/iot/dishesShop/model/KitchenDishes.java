package ua.lviv.iot.dishesShop.model;

public class KitchenDishes extends Dishes{

    private CookingType kitchen;
    private WorkingType onWhatWorks;
    private boolean workingWithFire;

    public KitchenDishes(){
    }

    public KitchenDishes(double price, double capacity, String manufacturerCountry, MaterialType material, CookingType kitchen, WorkingType onWhatWorks, boolean workingWithFire){
        super(price, capacity, manufacturerCountry, material);
        this.kitchen = kitchen;
        this.onWhatWorks = onWhatWorks;
        this.workingWithFire = workingWithFire;
    }


    public CookingType getKitchen() {
        return kitchen;
    }

    public void setKitchen(CookingType kitchen) {
        this.kitchen = kitchen;
    }


    public WorkingType getOnWhatWorks() {
        return onWhatWorks;
    }

    public void setOnWhatWorks(WorkingType onWhatWorks) {
        this.onWhatWorks = onWhatWorks;
    }


    public boolean isWorkingWithFire() {
        return workingWithFire;
    }

    public void setWorkingWithFire(boolean workingWithFire) {
        this.workingWithFire = workingWithFire;
    }


    public boolean isActive(){return this.workingWithFire;}

    public void setActive(boolean active){this.workingWithFire = active;}

    @Override
    public String toString() {
        return "\n" +super.toString() + "KitchenDishes{" + "\n" +
                "kitchen=" + kitchen + "\n" +
                ", onWhatWorks=" + onWhatWorks + "\n" +
                ", workingWithFire=" + workingWithFire + "\n" +
                '}';
    }
}
