package ua.lviv.iot.dishesShop.model;

public class Dishes {

    private double price;
    private double capacity;
    private String manufacturerCountry;
    private MaterialType material;


    public Dishes(){
    }

    public Dishes(double price, double capacity, String manufacturerCountry, MaterialType material){
        this.price = price;
        this.capacity = capacity;
        this.manufacturerCountry = manufacturerCountry;
        this.material = material; //type of the dishes
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public MaterialType getMaterial() {
        return material;
    }

    public void setMaterial(MaterialType material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "\n" +"Dishes{" + "\n" +
                "price=" + price + "\n" +
                ", capacity=" + capacity + "\n" +
                ", manufacturerCountry='" + manufacturerCountry + "\n" +
                ", material=" + material + "\n" +
                '}';
    }
}
