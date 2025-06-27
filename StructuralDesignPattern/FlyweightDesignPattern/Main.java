package StructuralDesignPattern.FlyweightDesignPattern;

import java.util.Random;

public class Main {
    private static final String[] colors = {"Red", "Green", "Blue", "Yellow", "Black"};


    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            String color = colors[rand.nextInt(colors.length)];
            Circle circle = CircleFactory.getCircle(color);

            int x = rand.nextInt(100);
            int y = rand.nextInt(100);
            int radius = rand.nextInt(50);

            circle.draw(x, y, radius);
        }
    }
}

