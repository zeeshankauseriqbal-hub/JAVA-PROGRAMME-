package com.portfolio.model;
public final class Bond extends Asset {
    public Bond(String name, double value) {
        super(name, value);
    }
    @Override
    public void display() {
        System.out.println("Bond Name: " + name);
        System.out.println("Bond Value: " + value);
    }
}
