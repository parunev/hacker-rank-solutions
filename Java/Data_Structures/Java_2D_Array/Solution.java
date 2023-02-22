package Data_Structures.Java_2D_Array;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];

        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 6; col++) {
                arr[row][col] = Integer.parseInt(scanner.nextLine());
            }
        }

        System.out.println(maxHourglass(arr));
    }

    public static int maxHourglass(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                int sum = findSum(arr, row, col);
                max = Math.max(max, sum);
            }
        }

        return max;
    }

    private static int findSum(int [][] arr, int r, int c) {
        return arr[r][c] + arr[r][c+1] + arr[r][c+2]
                + arr[r+1][c+1] +
                arr[r+2][c] + arr[r+2][c+1] + arr[r+2][c+2];
    }
}
