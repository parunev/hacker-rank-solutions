package Introduction.Static_Initializer_Block;

import java.util.Scanner;

public class Solution {
    private static final int b;
    private static final int h;
    private static final boolean isValid;

    static {
        Scanner scanner = new Scanner(System.in);
        b = Integer.parseInt(scanner.nextLine());
        h = Integer.parseInt(scanner.nextLine());

        if (b <= 0 || h <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            isValid = false;
        } else {
            isValid = true;
        }
    }

    public static void main(String[] args) {
        if (isValid){
            int a = b * h;
            System.out.println(a);
        }
    }
}
