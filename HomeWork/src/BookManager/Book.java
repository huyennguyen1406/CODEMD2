package BookManager;

public class Book {
    private String name;
    private double price;
    private int quantity;
    private String date;
    public static double sum = 0;

    public Book() {
    }

    public Book(String name, double price, int quantity, String date) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.date = date;
        sum += price * quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", date='" + date + '\'' +
                '}';
    }
}
