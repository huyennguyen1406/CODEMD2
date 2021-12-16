package Minitest01;

public class Product {
    private int code;
    private String name;
    private double price;
    private String type;
    static String unit = "USD";

    public Product() {

    }

    public Product(int code, String name, double price, String type) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                '}';
    }
    
}
