package Data_Structures.Java_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int row = 0; row < n; row++) {
            String[]input = scan.nextLine().split("\\s+");
            ArrayList<Integer> list = new ArrayList<>();

            for (String s : input) {
                list.add(Integer.valueOf(s));
            }

            lists.add(list);
        }

        int q = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < q; i++) {
            String[] input2 = scan.nextLine().split("\\s+");
            int x = Integer.parseInt(input2[0]);
            int y = Integer.parseInt(input2[1]);

            ArrayList<Integer> list = lists.get(x-1);
            if (y <= list.size()) {
                System.out.println(list.get(y-1));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
