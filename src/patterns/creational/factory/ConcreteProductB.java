package patterns.creational.factory;

import patterns.creational.Product;

public class ConcreteProductB implements Product {
    public void use() {
        System.out.println("ConcreteProductB");
    }

    @Override
    public void show() {
        System.out.println("Showing ConcreteProductB");
    }
}
