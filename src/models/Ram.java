package models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;

public class Ram implements Serializable, Comparable<Ram> {
    private String code;
    private String type;
    private String bus;
    private String brand;
    private int quantity;
    private String productionMonthYear;
    private boolean active;

    public Ram(String code, String type, String bus, String brand, int quantity, String productionMonthYear,
            boolean active) {
        this.code = code;
        this.type = type;
        this.bus = bus;
        this.brand = brand;
        this.quantity = quantity;
        this.productionMonthYear = productionMonthYear;
        this.active = active;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductionMonthYear() {
        return productionMonthYear;
    }

    public void setProductionMonthYear(String productionMonthYear) {
        this.productionMonthYear = productionMonthYear;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        // Removed active from the output
        String str = String.format("%-10s%-10s%-9s%-13s%-22s%-20s |", code, type, bus, brand, quantity,
                productionMonthYear,active);
        return str;
    }

    @Override
    public int compareTo(Ram o) {
        if (this.bus.compareTo(o.bus) > 0) {
            return 1;
        } else if (this.bus.compareTo(o.bus) < 0) {
            return -1;
        } else if (this.brand.compareTo(o.brand) > 0) {
            return 1;
        } else if (this.brand.compareTo(o.brand) < 0) {
            return -1;
        }
        return 0;

       
    }
  
}
