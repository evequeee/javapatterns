package patterns.creational.prototype;

public class ConcretePrototype implements Prototype {
    private String data;

    public ConcretePrototype(String data) {
        this.data = data;
    }

    public Prototype clone() {
        return new ConcretePrototype(this.data);
    }

    public void show() {
        System.out.println("Prototype with data: " + data);
    }
}
