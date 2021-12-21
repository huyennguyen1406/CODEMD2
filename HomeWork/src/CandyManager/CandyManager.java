package CandyManager;

import java.util.ArrayList;
import java.util.Scanner;

public class CandyManager {
    private ArrayList<Candy> candies;
    private Scanner scanner = new Scanner(System.in);

    public CandyManager() {
        this.candies = new ArrayList<>();
    }

    public void displayAll() {
        for (Candy candy : candies) {
            System.out.println(candy);
        }
    }

    public Candy createCandy() {
        System.out.println("Nhập màu kẹo: ");
        String color = scanner.nextLine();
        System.out.println("Nhập tính chất kẹo: ");
        String property = scanner.nextLine();
        System.out.println("Nhập số lượng kẹo: ");
        int quantity = scanner.nextInt();
        System.out.println("Nhập đơn giá: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        return new Candy(color, property, quantity, amount);
    }

    public void addCandy(Candy candy) {
        candies.add(candy);
    }

    public Candy deleteCandy(int id) {
        Candy candy = null;
        for (Candy c : candies) {
            if (c.getId() == id) {
                candy = c;
            }
        }
        int index = candies.indexOf(candy);
        return candies.remove(index);
    }

    public Candy editCandy(int id) {
        Candy candy = null;
        for (Candy c : candies) {
            if (c.getId() == id) {
                candy = c;
            }
        }
        if (candy != null) {
            int index = candies.indexOf(candy);
            System.out.println("Nhập vào màu mới: ");
            String color = scanner.nextLine();
            candy.setColor(color);
            System.out.println("Nhập vào tính chất mới: ");
            String property = scanner.nextLine();
            candy.setProperty(property);
            System.out.println("Nhập số lượng mới: ");
            int quantity = scanner.nextInt();
            candy.setQuantity(quantity);
            System.out.println("Nhập đơn giá mới: ");
            double amount = scanner.nextDouble();
            candy.setAmount(amount);
            candies.set(index, candy);
        }
        return candy;
    }

    public void displayCandy(int id) {
        Candy candy = null;
        for (Candy c : candies) {
            if (c.getId() == id) {
                candy = c;
            }
        }
        if (candy != null) {
            System.out.println(candy);
        } else {
            System.out.println("Không có id kẹo nào tương ứng");
        }
    }

    public ArrayList<Candy> deleteCandyListByColor(String color) {
        ArrayList<Candy> candy = new ArrayList<>();
        for (Candy c : candies) {
            if (c.getColor().equals(color)) {
                candy.add(c);
            }
        }
        candies.removeAll(candy);
        return candy;
    }

    public ArrayList<Candy> displayCandyListByColor(String color) {
        ArrayList<Candy> candy = new ArrayList<>();
        for (Candy c : candies) {
            if (c.getColor().equals(color)) {
                candy.add(c);
            }
        }
        return candy;
    }

    public ArrayList<Candy> searchByPrice() {
        ArrayList<Candy> candy = new ArrayList<>();
        double max = candies.get(0).getAmount();
        for (Candy c : candies) {
            if (c.getAmount() > max) {
                max = c.getAmount();
            }
        }
        for (Candy c : candies) {
            if (c.getAmount() == max) {
                candy.add(c);
            }
        }
        return candy;
    }

    public void displayCandyListAndTotalPrice() {
        for (Candy c : candies) {
            System.out.println(c.getId() + "    " + (c.getAmount() * c.getQuantity()));
        }
    }
}
