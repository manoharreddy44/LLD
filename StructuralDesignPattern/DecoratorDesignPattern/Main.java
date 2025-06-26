package StructuralDesignPattern.DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();                         // 5.0
        coffee = new MilkDecorator(coffee);                        // +1.5
        coffee = new SugarDecorator(coffee);                       // +0.5

        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Total: ₹" + coffee.getCost());
    }
}

