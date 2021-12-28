package Bai2ElectricManager.model;

import java.io.Serializable;

public class Customer implements Serializable {
    private String name;
    private int homeNumber;
    private int idElectric;

    public Customer() {
    }

    public Customer(String name, int homeNumber, int idElectric) {
        this.name = name;
        this.homeNumber = homeNumber;
        this.idElectric = idElectric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    public int getIdElectric() {
        return idElectric;
    }

    public void setIdElectric(int idElectric) {
        this.idElectric = idElectric;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", homeNumber=" + homeNumber +
                ", idElectric=" + idElectric +
                '}';
    }
}
