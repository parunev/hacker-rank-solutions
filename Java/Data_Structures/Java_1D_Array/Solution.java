package Data_Structures.Java_1D_Array;


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] a = new int[n];

        for (int i = 0 ; i < n; i++) {
            a[i] = scanner.nextInt();
        }


        for (int j : a) {
            System.out.println(j);
        }
    }
}
