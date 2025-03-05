package patterns.creational.factory;

import patterns.creational.Product;

public class Demo {
    public static void main(String[] args) {
        Product product1 = Factory.createProduct("A");
        product1.use();

        Product product2 = Factory.createProduct("B");
        product2.use();
    }
}