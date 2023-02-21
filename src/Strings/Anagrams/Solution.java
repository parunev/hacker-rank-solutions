package Strings.Anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        int n1 = a.length();
        int n2 = b.length();

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2){
            return false;
        }

        char[] str1 = a.toCharArray();
        char[] str2 = b.toCharArray();

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++) {
            if (str1[i] != str2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a.toLowerCase(), b.toLowerCase());
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
