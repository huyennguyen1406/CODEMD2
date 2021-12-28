package Bai2ElectricManager.manager;

import Bai2ElectricManager.model.Bill;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ElectricManager {
    HashMap<Integer, Bill> bills;
    Scanner scanner = new Scanner(System.in);

    public ElectricManager(String path) throws IOException, ClassNotFoundException {
        bills = readBillFromFile(path);
    }

    public HashMap<Integer, Bill> getBills() {
        return bills;
    }

    public boolean addBill() {
        System.out.println("Nhap ten chu ho: ");
        String name = scanner.nextLine();
        System.out.println("Nhap so nha: ");
        int homeNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ma cong to dien: ");
        int idElectric = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap chi so cu: ");
        int oldIndex = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap chi so moi: ");
        int newIndex = scanner.nextInt();
        scanner.nextLine();
        if (oldIndex <= newIndex) {
            Bill bill = new Bill(name, homeNumber, idElectric, oldIndex, newIndex);
            return checkIdElectricOfBill(bill);
        }
        return false;
    }

    private boolean checkIdElectricOfBill(Bill bill) {
        HashSet<Integer> integers = new HashSet<>(bills.keySet());
        if (integers.add(bill.getIdElectric())) {
            bills.put(bill.getIdElectric(), bill);
            return true;
        } else {
            return false;
        }
    }

    public void displayAll() {
        for (Bill bill : bills.values()) {
            System.out.println(bill);
        }
    }
    public void getElectricBillByIdElectric(int idElectric) {
        Bill bill = null;
        for (Bill b : bills.values()) {
            if (b.getIdElectric() == idElectric) {
                bill = b;
            }
        }
        if (bill == null) {
            System.err.println("Không tìm thấy !");
        } else {
            System.out.println("Gia đình ông/bà " + bill.getName() + " phải thanh toán:");
            System.out.println(bill.getElectricBill());
        }
    }

    public void writeBillToFile(HashMap<Integer, Bill> bills, String pathName) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(pathName));
        objectOutputStream.writeObject(bills);
        objectOutputStream.close();
        System.out.println("Write successfully!");
    }

    public HashMap<Integer, Bill> readBillFromFile(String pathName) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(pathName));
        return (HashMap<Integer, Bill>) objectInputStream.readObject();
    }
}
