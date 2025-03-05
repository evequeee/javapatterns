package patterns.creational.prototype;

public class Demo {
    public static void main (String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("Original");
        ConcretePrototype cloned = (ConcretePrototype) prototype.clone();

        prototype.show();
        cloned.show();
    }
}
