package ua.lviv.iot.dishesShop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "Dishes")

public class Dishes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private double price;

    @Column
    private double capacity;

    @Column
    private String manufacturerCountry;

    @Column
    private MaterialType material;


    public Dishes(){
    }

    public Dishes(double price, double capacity, String manufacturerCountry, MaterialType material){
        this.price = price;
        this.capacity = capacity;
        this.manufacturerCountry = manufacturerCountry;
        this.material = material; //type of the dishes
    }

    public  String getHeaders(){
        return "price" + ","
                + "capacity" + ","
                + "manufacturerCountry" + ","
                + "material";
    }

    public String toCSV() {
        return this.price + ","
                + this.capacity + ","
                + this.manufacturerCountry + ","
                + this.material;
    }

    public double getPrice() {
        return price ;
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
