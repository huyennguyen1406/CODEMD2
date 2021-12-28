package Bai2ElectricManager.main;

import Bai2ElectricManager.manager.ElectricManager;
import Bai2ElectricManager.model.Bill;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static final String PATH_NAME = "src/Bai2ElectricManager/bills";

    public static void main(String[] args) {
        ElectricManager electricManager = null;
        try {
            electricManager = new ElectricManager(PATH_NAME);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);

        if (electricManager != null) {
            int choice;
            do {
                System.out.println("MENU:");
                System.out.println("1. Add Customer");
                System.out.println("2. Display All");
                System.out.println("3. Display Electric Bill By IdElectric");
                System.out.println("4. Write Bill To File");
                System.out.println("5. Read Bill From File");
                System.out.println("0. Exit");
                System.out.println("Enter your choice");
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        if (!electricManager.addBill()) {
                            System.out.println("IdElectric bị trùng hoặc nhập sai chỉ số, mời nhập lại!");
                        }
                        break;
                    case 2:
                        electricManager.displayAll();
                        break;
                    case 3:
                        System.out.println("Enter idElectric:");
                        int idSearch = scanner.nextInt();
                        electricManager.getElectricBillByIdElectric(idSearch);
                        break;
                    case 4:
                        try {
                            HashMap<Integer, Bill> billHashMap = electricManager.getBills();
                            electricManager.writeBillToFile(billHashMap, PATH_NAME);
                        } catch (IOException e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                    case 5:
                        try {
                            HashMap<Integer, Bill> billHashMap = electricManager.readBillFromFile(PATH_NAME);
                            billHashMap.values().forEach(System.out::println);
                        } catch (IOException | ClassNotFoundException e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                }
            } while (choice != 0);
        }
    }
}
