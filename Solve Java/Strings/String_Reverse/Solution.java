package Strings.String_Reverse;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        StringBuilder reversed = new StringBuilder();
        reversed.append(A);
        reversed.reverse();

        System.out.println(A.equals(reversed.toString()) ? "Yes" : "No");
    }
}
