package Data_Structures.Java_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());


        HashMap<String, Integer> map = new HashMap<>();

        while (N-- > 0) {
            String name = scanner.nextLine();
            int phone = Integer.parseInt(scanner.nextLine());
            map.put(name, phone);
        }


        String s;
        while((s = scanner.nextLine()) != null) {
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
