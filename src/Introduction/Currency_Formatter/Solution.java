package Introduction.Currency_Formatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine()); //12324.134

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + us.format(sum));

        NumberFormat india = NumberFormat.getCurrencyInstance(Locale.of("en", "IN"));
        System.out.println("India: " + india.format(sum));

        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + china.format(sum));

        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + france.format(sum));

        // WORKING SOLUTIONS BUT HACKERRANK WON'T LET YOU USE IT
    }
}
