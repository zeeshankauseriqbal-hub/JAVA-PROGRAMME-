package com.portfolio.model;
public sealed abstract class Asset permits Stock, Bond {
    String name;
    double value;
    Asset(String name, double value) {
        this.name = name;
        this.value = value;
    }
    public abstract void display();
    @Override
    public String toString() {
        return name + " = " + value;
    }
}
