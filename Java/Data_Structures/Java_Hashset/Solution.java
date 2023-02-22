package Data_Structures.Java_Hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        String[] pair_left = new String[input];
        String[] pair_right = new String[input];

        for (int i = 0; i < input; i++) {
            pair_left[i] = scanner.next();
            pair_right[i] = scanner.next();
        }

        HashSet<String> set = new HashSet<>(input);
        for (int i = 0; i < input; i++) {
            set.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(set.size());
        }
    }
}
