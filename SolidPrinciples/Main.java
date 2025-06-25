package SolidPrinciples;

// 1. SRP: Each class has a single responsibility

// Interface to brew coffee (ISP)
interface Coffee {
    void brew();
}

// 2. OCP: Add new coffee without modifying old code
class Espresso implements Coffee {
    public void brew() {
        System.out.println("Brewing Espresso...");
    }
}

class Cappuccino implements Coffee {
    public void brew() {
        System.out.println("Brewing Cappuccino...");
    }
}

// 3. LSP: Subtypes replace base types without breaking functionality
class Latte implements Coffee {
    public void brew() {
        System.out.println("Brewing Latte...");
    }
}

// 4. ISP: Splitting large interface into role-specific ones
interface User {
    void orderCoffee();
}

interface Admin extends User {
    void checkMachineStatus();
}

// Customer implementation
class Customer implements User {
    public void orderCoffee() {
        System.out.println("Customer ordering coffee...");
    }
}

// Admin implementation
class CoffeeAdmin implements Admin {
    public void orderCoffee() {
        System.out.println("Admin ordering test coffee...");
    }

    public void checkMachineStatus() {
        System.out.println("Machine is working fine.");
    }
}

// 5. DIP: High-level module depends on abstraction
class CoffeeMachine {
    private Coffee coffee;

    public CoffeeMachine(Coffee coffee) {
        this.coffee = coffee;
    }

    public void makeCoffee() {
        coffee.brew();
    }
}

// === Main Class to Run the App ===
public class Main {
    public static void main(String[] args) {
        // DIP: CoffeeMachine depends on abstraction (Coffee interface)
        Coffee coffee = new Espresso(); // Try Latte or Cappuccino
        CoffeeMachine machine = new CoffeeMachine(coffee);
        machine.makeCoffee();

        // ISP: User vs Admin roles
        User user = new Customer();
        user.orderCoffee();

        Admin admin = new CoffeeAdmin();
        admin.orderCoffee();
        admin.checkMachineStatus();
    }
}
