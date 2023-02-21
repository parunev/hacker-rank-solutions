package Strings.Regex_Dublicate_Words;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// \b(\w+)(?:\W+\1\b)+
// \w ----> A word character: [a-zA-Z_0-9] <br/>
// \W ----> A non-word character: [^\w]<br/>
// \b ----> A word boundary  <br/>
// \1 ----> Matches whatever was matched in the 1st group of parentheses, which in this case is the (\w+)  <br/>
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        while (num-- > 0){
            String input = scanner.nextLine();
            Matcher matcher = p.matcher(input);

            while (matcher.find()){
                input = input.replaceAll(matcher.group(), matcher.group(1));
            }

            System.out.println(input);
        }

        scanner.close();
    }
}
