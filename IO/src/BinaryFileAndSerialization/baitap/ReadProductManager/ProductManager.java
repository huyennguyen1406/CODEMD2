package BinaryFileAndSerialization.baitap.ReadProductManager;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> products;
    private Scanner scanner = new Scanner(System.in);
    private final File pathName = new File("src/baitap/ReadProductManager/products");

    public ProductManager() {
        if (pathName.length() == 0) {
            products = new ArrayList<>();
        } else {
            products = readDataFromFile(pathName);
        }
    }

    public Product createProduct() {
        System.out.println("Nhập id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập hãng: ");
        String brand = scanner.nextLine();
        System.out.println("Nhập giá: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập tình trạng sản phẩm: ");
        String status = scanner.nextLine();
        scanner.nextLine();
        return new Product(id, name, brand, price, status);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public int checkID(int id, Scanner scanner) {
        try {
            for (Product product : products) {
                while (product.getId() == id) {
                    System.out.println("ID trùng, yêu cầu nhập lại");
                    id = scanner.nextInt();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    public void writeToFile(File path, ArrayList<Product> product) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(pathName);
        } catch (IOException e) {
            System.out.println("File not found");
        }
        try {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(product);
            oos.close();
            assert fos != null;
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Product> readDataFromFile(File path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (ArrayList<Product>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    public void displayProduct() {
        for (Product p : products) {
            System.out.println(p);
        }
        if (products.size() == 0) {
            System.out.println("Không có sảm phẩm nào");
        }
    }

    public void findProduct(int id) {
        boolean check = false;
        for (Product p : products) {
            if (p.getId() == id) {
                System.out.println(p);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sản phẩm theo ID trên");
        }
    }


}
