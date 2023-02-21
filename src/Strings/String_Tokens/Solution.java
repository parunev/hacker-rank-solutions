package Strings.String_Tokens;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // This works but not exactly like HackerRank wants

        /*
        String[] input = scanner.nextLine().split("[!,?._'@ ]+");

        int count = input.length;
        System.out.println(count);

        for (String i : input) {
            System.out.println(i);
        }
        */

        String input = scanner.nextLine();
        input = removeLeadingNonLetters(input);

        // Special cases
        if (input.length() == 0) {
            System.out.println(0);
            return;
        }

        // Split on all non-alphabetic characters
        String[] words = input.split("[^a-zA-Z]+");

        // Output
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static String removeLeadingNonLetters(String input) {
        int i;
        for (i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                break;
            }
        }
        return input.substring(i);
    }
}
