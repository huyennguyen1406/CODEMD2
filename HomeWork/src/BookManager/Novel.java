package BookManager;

public class Novel extends Book {
    private String author;

    public Novel(String name, double price, int quantity, String date, String author) {
        super(name, price, quantity, date);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + ", Novel{" +
                "author='" + author + '\'' +
                '}';
    }
}
