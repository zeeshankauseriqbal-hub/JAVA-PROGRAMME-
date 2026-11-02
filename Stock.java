package com.portfolio.model;
import java.util.Objects;
public final class Stock extends Asset {
    public Stock(String name, double value) {
        super(name, value);
    }
    @Override
    public void display() {
        System.out.println("Stock Name: " + name);
        System.out.println("Stock Value: " + value);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Stock)) return false;
        Stock other = (Stock) obj;
        return Objects.equals(name, other.name)
                && Double.compare(value, other.value) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }
}
