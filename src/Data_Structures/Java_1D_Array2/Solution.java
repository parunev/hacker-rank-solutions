package Data_Structures.Java_1D_Array2;

import java.util.Scanner;

public class Solution {
    public static boolean canWin(int leap, int[] game, int i) {
        int N = game.length;

        if(i < 0 || game[i] == 1){ return false; }
        if(i == N - 1 || i + leap >= N){return true;}
        game[i] = 1;

        return canWin(leap, game, i+1) || canWin(leap, game, i-1) || canWin(leap, game, i+leap);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];

            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game, 0)) ? "YES" : "NO" );
        }
    }
}
