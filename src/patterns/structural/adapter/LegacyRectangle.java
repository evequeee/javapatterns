package patterns.structural.adapter;

public class LegacyRectangle {
    public void drawRectangle(int x1, int y1, int x2, int y2) {
        System.out.println("Drawing rectangle with coordinates: (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")");
    }
}
