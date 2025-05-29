package patterns.creational.factory;

import patterns.creational.Product;

public class ConcreteProductA implements Product {
    public void use() {
        System.out.println("ConcreteProductA");
    }

    @Override
    public void show() {
        System.out.println("Showing ConcreteProductA");
    }
}
