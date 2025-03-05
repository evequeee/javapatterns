package patterns;

import patterns.creational.builder.ConcreteProduct;
import patterns.creational.singleton.Singleton;
import patterns.creational.factory.Factory;
import patterns.creational.Product;
import patterns.creational.abstractfactory.AbstractFactory;
import patterns.creational.abstractfactory.FactoryA;
import patterns.creational.abstractfactory.FactoryB;
import patterns.creational.prototype.ConcretePrototype;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Singleton ===");
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        System.out.println("\n=== Factory Method ===");
        Product productA = (Product) Factory.createProduct("A");
        productA.use();
        Product productB = (Product) Factory.createProduct("B");
        productB.use();

        System.out.println("\n=== Abstract Factory ===");
        AbstractFactory factoryA = new FactoryA();
        Product abstractProductA = (Product) factoryA.createProduct();
        abstractProductA.use();
        AbstractFactory factoryB = new FactoryB();
        Product abstractProductB = (Product) factoryB.createProduct();
        abstractProductB.use();

        System.out.println("\n=== Builder ===");
        Product builderProduct = new  ConcreteProduct.Builder()
                .setPartA("Feauture A")
                .setPartB("Feauture B")
                .build();
        builderProduct.show();

        System.out.println("\n=== Prototype ===");
        ConcretePrototype prototype = new ConcretePrototype("Original Data");
        ConcretePrototype clonedPrototype = (ConcretePrototype) prototype.clone();
        prototype.show();
        clonedPrototype.show();
    }
}