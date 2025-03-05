package patterns.creational.abstractfactory;

import patterns.creational.Product;
import patterns.creational.factory.ConcreteProductA;
import patterns.creational.factory.ConcreteProductB;

public class FactoryA implements AbstractFactory {
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
