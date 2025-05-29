package patterns.structural.bridge;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing red circle at (" + x + "," + y + ") with radius " + radius);
    }
}
