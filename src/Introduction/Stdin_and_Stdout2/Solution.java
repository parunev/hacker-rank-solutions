package Introduction.Stdin_and_Stdout2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        double second = scanner.nextDouble();
        scanner.nextLine();
        String third = scanner.nextLine();
        scanner.close();

        System.out.println("String: " + third);
        System.out.println("Double: " + second);
        System.out.println("Int: " + first);
    }
}
