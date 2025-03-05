package patterns.creational.factory;

import patterns.creational.Product;

public class Factory {
    public static Product createProduct(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Type must be specified");
        }
        if ("A".equalsIgnoreCase(type)) {
            return new ConcreteProductA();
        } else if ("B".equalsIgnoreCase(type)) {
            return new ConcreteProductB();
        }
        throw new IllegalArgumentException("Unknown product type");
    }
}