package patterns.structural.composite;

public class Leaf implements Graphic {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + name);
    }
}
