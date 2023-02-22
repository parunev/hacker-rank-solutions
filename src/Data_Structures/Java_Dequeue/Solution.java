package Data_Structures.Java_Dequeue;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            // Remove old value (if necessary)
            if (i >= m) {
                int old = deque.removeFirst();
                if (map.get(old) == 1) {
                    map.remove(old);
                } else {
                    map.merge(old, -1, Integer::sum);
                }
            }

            // Add new value
            int num = scan.nextInt();
            deque.addLast(num);
            map.merge(num, 1, Integer::sum);

            max = Math.max(max, map.size());

            // If all integers are unique, we have found our largest
            // possible answer, so we can break out of loop
            if (max == m) {
                break;
            }
        }

        System.out.println(max);
    }
}
