package BigNumber.BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger n1 = new BigInteger(scanner.nextLine());
        BigInteger n2 = new BigInteger(scanner.nextLine());

        BigInteger add = n1.add(n2);
        BigInteger multiply = n1.multiply(n2);

        System.out.println(add);
        System.out.println(multiply);
    }
}
