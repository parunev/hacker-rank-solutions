package Strings.Regex_Username_Checker;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        while (testCases > 0) {
            String username = scanner.nextLine();
            String pattern = "^[a-zA-Z]\\w{7,29}$";

            Pattern p = Pattern.compile(pattern);
            Matcher matcher = p.matcher(username);

            if (matcher.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

            testCases--;
        }
    }
}
