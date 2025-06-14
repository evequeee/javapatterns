package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

    private static class Circle implements Shape {
        private String color;

        private Circle(String color) {
            this.color = color;
        }

        @Override
        public void draw() {
            System.out.println("Drawing " + color + " circle");
        }
    }
}
