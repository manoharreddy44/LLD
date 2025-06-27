package StructuralDesignPattern.FlyweightDesignPattern;

public class Circle {
    private String color; // intrinsic (shared)
    private int x, y, radius; // extrinsic (unique per circle)

    public Circle(String color) {
        this.color = color;
    }

    public void draw(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        System.out.println("Drawing " + color + " circle at (" + x + "," + y + ") with radius " + radius);
    }
}

