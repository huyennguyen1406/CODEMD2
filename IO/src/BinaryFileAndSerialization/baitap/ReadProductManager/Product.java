package BinaryFileAndSerialization.baitap.ReadProductManager;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String brand;
    private double price;
    private String status;

    public Product() {
    }

    public Product(int id, String name, String brand, double price, String status) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }
}
