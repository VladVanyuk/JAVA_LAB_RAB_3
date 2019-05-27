package ua.lviv.iot.dishesShop.model;

public class DishesForStorage extends Dishes{

    private int height;
    private StorageType storage;

    public DishesForStorage(){
    }

    public DishesForStorage(double price, double capacity, String manufacturerCountry, MaterialType material, int height, StorageType storage){
        super(price, capacity, manufacturerCountry, material);
        this.height = height;
        this.storage = storage;
    }

    public String getHeaders() {
        return super.getHeaders() + ","
                + "height" + ","
                + "storage";
    }

    public String toCSV() {
        return super.toCSV() + ","
                + this.height + ","
                + this.storage;
    }

    public StorageType getStorage() {
        return storage;
    }

    public void setStorage(StorageType storage) {
        this.storage = storage;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "\n" +super.toString() + "DishesForStorage{" + "\n" +
                "height=" + height + "\n" +
                ", storage=" + storage + "\n" +
                '}';
    }
}
