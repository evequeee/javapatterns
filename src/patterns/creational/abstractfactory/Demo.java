package patterns.creational.abstractfactory;

import patterns.creational.Product;

public class Demo {
    public static void main (String[] args) {
        AbstractFactory FactoryA = new FactoryA();
        Product productA = FactoryA.createProduct();
        productA.use();

        AbstractFactory FactoryB = new FactoryB();
        Product productB = FactoryB.createProduct();
        productB.use();
    }
}
