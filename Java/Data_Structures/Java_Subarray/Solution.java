package Data_Structures.Java_Subarray;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(negativeSubarrays(array));
    }

    private static int negativeSubarrays(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;

            for (int j = i; j < array.length; j++) {
                sum += array[j];

                if (sum < 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
