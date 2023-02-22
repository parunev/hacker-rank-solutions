package BigNumber.BigDecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String [] s = new String[n+2];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.next();
        }

        Comparator<String> customComparator = (s1, s2) -> {
            BigDecimal a = new BigDecimal(s1);
            BigDecimal b = new BigDecimal(s2);
            return b.compareTo(a);
        };

        Arrays.sort(s, 0, n, customComparator);

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
