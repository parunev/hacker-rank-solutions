package Strings.Regex_Ip;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()){
            String ip = scanner.nextLine();
            System.out.println(ip.matches(new MyRegex().pattern));
        }

    }

    static class MyRegex{
        String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
        String pattern = num + "." + num + "." + num + "." + num;
    }
}
