package patterns;

import patterns.creational.builder.ConcreteProduct;
import patterns.creational.singleton.Singleton;
import patterns.creational.factory.Factory;
import patterns.creational.Product;
import patterns.creational.abstractfactory.AbstractFactory;
import patterns.creational.abstractfactory.FactoryA;
import patterns.creational.abstractfactory.FactoryB;
import patterns.creational.prototype.ConcretePrototype;
import patterns.structural.adapter.Shape;
import patterns.structural.adapter.RectangleAdapter;
import patterns.structural.adapter.LegacyRectangle;
import patterns.structural.bridge.DrawAPI;
import patterns.structural.bridge.RedCircle;
import patterns.structural.composite.CompositeGraphic;
import patterns.structural.composite.Graphic;
import patterns.structural.composite.Leaf;
import patterns.structural.decorator.Coffee;
import patterns.structural.decorator.SimpleCoffee;
import patterns.structural.decorator.MilkDecorator;
import patterns.structural.decorator.SugarDecorator;
import patterns.structural.facade.ComputerFacade;
import patterns.structural.flyweight.ShapeFactory;
import patterns.structural.proxy.Image;
import patterns.structural.proxy.ProxyImage;

public class Main {
    public static void main(String[] args) {
        // Creational Patterns
        System.out.println("=== Singleton ===");
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        System.out.println("\n=== Factory Method ===");
        Product productA = Factory.createProduct("A");
        productA.use();
        Product productB = Factory.createProduct("B");
        productB.use();

        System.out.println("\n=== Abstract Factory ===");
        AbstractFactory factoryA = new FactoryA();
        Product abstractProductA = factoryA.createProduct();
        abstractProductA.use();
        AbstractFactory factoryB = new FactoryB();
        Product abstractProductB = factoryB.createProduct();
        abstractProductB.use();

        System.out.println("\n=== Builder ===");
        Product builderProduct = new ConcreteProduct.Builder()
                .setPartA("Feature A")
                .setPartB("Feature B")
                .build();
        builderProduct.show();

        System.out.println("\n=== Prototype ===");
        ConcretePrototype prototype = new ConcretePrototype("Original Data");
        ConcretePrototype clonedPrototype = (ConcretePrototype) prototype.clone();
        prototype.show();
        clonedPrototype.show();

        // Structural Patterns
        System.out.println("\n=== Adapter Pattern ===");
        Shape adaptedRectangle = new RectangleAdapter(new LegacyRectangle());
        adaptedRectangle.draw(10, 20, 30, 40);

        System.out.println("\n=== Bridge Pattern ===");
        DrawAPI redCircle = new RedCircle();
        redCircle.drawCircle(100, 100, 10);

        System.out.println("\n=== Composite Pattern ===");
        CompositeGraphic graphic = new CompositeGraphic();
        Graphic leaf1 = new Leaf("Leaf 1");
        Graphic leaf2 = new Leaf("Leaf 2");
        graphic.add(leaf1);
        graphic.add(leaf2);
        graphic.draw();

        System.out.println("\n=== Decorator Pattern ===");
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " costs: $" + coffee.getCost());

        System.out.println("\n=== Facade Pattern ===");
        ComputerFacade computer = new ComputerFacade();
        computer.start();

        System.out.println("\n=== Flyweight Pattern ===");
        patterns.structural.flyweight.Shape redCircle1 = ShapeFactory.getCircle("red");
        patterns.structural.flyweight.Shape redCircle2 = ShapeFactory.getCircle("red");
        patterns.structural.flyweight.Shape blueCircle = ShapeFactory.getCircle("blue");
        redCircle1.draw();
        redCircle2.draw();
        blueCircle.draw();

        System.out.println("\n=== Proxy Pattern ===");
        Image image = new ProxyImage("test.jpg");
        image.display(); // loading necessary
        image.display(); // loading unnecessary
    }
}

