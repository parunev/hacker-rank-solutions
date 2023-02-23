package Java_Factory_Pattern;

import java.io.Serial;
import java.security.Permission;
import java.util.Scanner;

// Security Manager is deprecated in newer versions of Java.
interface Food {
    String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        return switch (order.toLowerCase()) {
            case "pizza" -> new Pizza();
            case "cake" -> new Cake();
            default -> null;
        };
    }
}

public class Solution {
    public static void main(String[] args) {
        Do_Not_Terminate.forbidExit();
        try {
            Scanner sc = new Scanner(System.in);

            FoodFactory foodFactory = new FoodFactory();

            Food food = foodFactory.getFood(sc.nextLine());

            System.out.println("The factory returned " + food.getClass());
            System.out.println(food.getType());
        } catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

class Do_Not_Terminate {
    public static class ExitTrappedException extends SecurityException {
        @Serial
        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
