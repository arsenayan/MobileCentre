package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // write your code here

        try {
            AdminOfMobileCentre admin = new AdminOfMobileCentre();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Model chooseModelforSale(int number) {
        switch (number) {
            case 1:
                return Model.IPHONE;
            case 2:
                return Model.SAMSUNG;
            case 3:
                return Model.NOKIA;
            case 4:
                return Model.HTC;
            case 5:
                return Model.SIMENS;
            default:
                return Model.NO_SELECTED;
        }
    }
}
