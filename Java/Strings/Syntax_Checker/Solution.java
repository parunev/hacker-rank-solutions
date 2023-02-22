package Strings.Syntax_Checker;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = Integer.parseInt(scanner.nextLine());

        while (testCases-- > 0) {
            String pattern = scanner.nextLine();

            // If a PatternSyntaxException is not thrown by Pattern.compile, the regular expression is valid
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException exception) {
                System.out.println("Invalid");
            }
        }
    }
}
