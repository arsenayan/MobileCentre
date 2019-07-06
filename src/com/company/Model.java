package com.company;

public enum Model {
    IPHONE("IPHONE"),
    SAMSUNG("SAMSUNG"),
    NOKIA("NOKIA"),
    HTC("HTC"),
    SIMENS("SIMENS"),
    NO_SELECTED("nun");

    private String name;
    Model(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
