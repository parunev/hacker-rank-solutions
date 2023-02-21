package BigNumber.Primality_Test;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger n = scanner.nextBigInteger();

        System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
    }
}
