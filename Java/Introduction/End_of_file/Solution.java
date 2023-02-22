package Introduction.End_of_file;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;

        while (scanner.hasNextLine()){
            System.out.println(counter + " " + scanner.nextLine());
            counter++;
        }

        scanner.close();
    }
}
