package Strings.String_Introduction;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        // Sum the lengths of A and B.
        System.out.println(A.length() + B.length());

        //Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        // Capitalize the first letter in A and B and print them on a single line, separated by a space.
        A = A.substring(0,1).toUpperCase() + A.substring(1);
        B = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
    }
}
