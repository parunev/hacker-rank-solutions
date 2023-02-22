package Introduction.Loops2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < N; i++) {
            String[] nums = scanner.nextLine().split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            int n = Integer.parseInt(nums[2]);

            for (int j = 0; j < n; j++) {
                a += b * Math.pow(2, j);
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
