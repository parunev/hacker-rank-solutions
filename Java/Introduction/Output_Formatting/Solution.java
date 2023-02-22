package Introduction.Output_Formatting;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String[] input = scanner.nextLine().split(" ");
            String s = input[0];
            int x = Integer.parseInt(input[1]);

            System.out.format("%-15s%03d%n", s, x);
        }
        System.out.println("================================");
    }
}
