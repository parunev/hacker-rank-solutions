package Java_InstanceOf;

import java.util.ArrayList;
import java.util.Scanner;

class Student{}
class Rockstar{}
class Hacker{}

// The Java instanceof operator is used to test if the object or instance is an instanceof the specified type.
public class Solution {

    static String count(ArrayList<Object> myList){
        int a = 0, b = 0, c = 0;

        for (Object element : myList) {
            if (element instanceof Student)
                a++;
            if (element instanceof Rockstar)
                b++;
            if (element instanceof Hacker)
                c++;
        }

        return a +" "+ b +" "+ c;
    }

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            String s=sc.next();
            if(s.equals("Student"))myList.add(new Student());
            if(s.equals("Rockstar"))myList.add(new Rockstar());
            if(s.equals("Hacker"))myList.add(new Hacker());
        }

        System.out.println(count(myList));
    }
}