package ua.lviv.iot.dishesShop.model;

public class Dinnerware extends Dishes {

    private double radius;
    private boolean withDye;

    public Dinnerware() {
    }

    public Dinnerware(double price, double capacity, String manufacturerCountry, MaterialType material, double radius, boolean withDye) {
        super(price, capacity, manufacturerCountry, material);
        this.radius = radius;
        this.withDye = withDye;
    }

    public String getHeaders() {
        return super.getHeaders() + ","
                + "radius" + ","
                + "withDye";
    }

    public String toCSV() {
        return super.toCSV() + ","
                + this.radius + ","
                + this.withDye;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isWithDye() {
        return withDye;
    }

    public void setWithDye(boolean withDye) {
        this.withDye = withDye;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "Dinnerware{" + "\n" +
                "radius=" + radius + "\n" +
                ", withDye=" + withDye + "\n" +
                '}';
    }
}
