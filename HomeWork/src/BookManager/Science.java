package BookManager;

public class Science extends Book {
    private String category;

    public Science() {
    }

    public Science(String name, double price, int quantity, String date, String category) {
        super(name, price, quantity, date);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString() + ", Science book { "+
                "category='" + category + '\'' +
                '}';
    }
}
