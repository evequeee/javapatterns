package patterns.creational.abstractfactory;

import patterns.creational.Product;
import patterns.creational.factory.ConcreteProductB;

public class FactoryB implements AbstractFactory {
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
