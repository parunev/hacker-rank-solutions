package Java_Interface;

import java.util.Scanner;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class Calculator implements AdvancedArithmetic{

    @Override
    public int divisor_sum(int n) {
        int sum  = 0;
        int sqrt = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) { // if "i" is a divisor
                sum += i + n/i; // add both divisors
            }
        }

        // If sqrt is a divisor, we should only count it once
        if (sqrt * sqrt == n) {
            sum -= sqrt;
        }
        return sum;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();
        System.out.print("I implemented: " + AdvancedArithmetic.class.getSimpleName() + "\n");

        int n = Integer.parseInt(scanner.nextLine());
        System.out.print(calculator.divisor_sum(n) + "\n");
    }
}