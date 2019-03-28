package ua.lviv.iot.dishesShop.model;

public class Dinnerware extends Dishes{

    private double radius;
    private boolean withDye;

    public Dinnerware(){
    }

    public Dinnerware(double price, double capacity, String manufacturerCountry, MaterialType material, double radius, boolean withDye){
        super(price, capacity, manufacturerCountry, material);
        this.radius = radius;
        this.withDye = withDye;
    }


    @Override
    public String toString() {
        return "\n" +super.toString()+ "Dinnerware{" + "\n" +
                "radius=" + radius + "\n" +
                ", withDye=" + withDye + "\n" +
                '}';
    }
}
