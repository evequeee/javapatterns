package patterns.creational.builder;

public class Demo {
    public static void main (String[] args) {
        ConcreteProduct product = new ConcreteProduct.Builder()
                .setPartA("Feauture A")
                .setPartB("Feature B")
                .build();
        product.show();
    }
}
