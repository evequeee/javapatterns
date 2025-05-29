package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {
    private List<Graphic> childGraphics = new ArrayList<>();

    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }

    @Override
    public void draw() {
        System.out.println("Drawing composite:");
        for(Graphic graphic : childGraphics) {
            graphic.draw();
        }
    }
}
