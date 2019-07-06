package com.company;

public class Phone {
private Model model;
private int phoneYear;
private int phonePrice;
private int phoneRam;

    public Phone(Model model, int phoneYear, int phonePrice, int phoneRam) {
        this.model = model;
        this.phoneYear = phoneYear;
        this.phonePrice = phonePrice;
        this.phoneRam = phoneRam;
    }

    public Model getModel() {
        return model;
    }

    public int getPhoneYear() {
        return phoneYear;
    }

    public int getPhonePrice() {
        return phonePrice;
    }

    public int getPhoneRam() {
        return phoneRam;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model=" + model +
                ", phoneYear=" + phoneYear +
                ", phonePrice=" + phonePrice +
                ", phoneRam=" + phoneRam +
                '}';
    }
}
