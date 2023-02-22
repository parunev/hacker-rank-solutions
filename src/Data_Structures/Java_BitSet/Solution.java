package Data_Structures.Java_BitSet;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        while (M-- > 0) {
            String str = scan.next();
            int a = scan.nextInt();
            int b = scan.nextInt();

            switch (str) {
                case "AND": // https://en.wikipedia.org/wiki/Logical_conjunction
                    if (a == 1) {
                        B1.and(B2);
                    } else {
                        B2.and(B1);
                    }
                    break;
                case "OR": // https://en.wikipedia.org/wiki/Logical_disjunction
                    if (a == 1) {
                        B1.or(B2);
                    } else {
                        B2.or(B1);
                    }
                    break;
                case "XOR": // https://en.wikipedia.org/wiki/Exclusive_or
                    if (a == 1) {
                        B1.xor(B2);
                    } else {
                        B2.xor(B1);
                    }
                    break;
                case "FLIP": // https://en.wikipedia.org/wiki/Bitwise_operation#NOT
                    if (a == 1) {
                        B1.flip(b);
                    } else {
                        B2.flip(b);
                    }
                    break;
                case "SET": // https://docs.oracle.com/javase/7/docs/api/java/util/BitSet.html#set%28int%29
                    if (a == 1) {
                        B1.set(b);
                    } else {
                        B2.set(b);
                    }
                    break;
                default:
                    break;
            }

            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }
    }
}
