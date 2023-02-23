package Java_Varags_Simple_Addition;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

class Add{
    void add(int n1, int n2){
        System.out.printf("%d+%d=%d%n", n1, n2, n1+n2);
    }
    void add(int n1, int n2, int n3){
        System.out.printf("%d+%d+%d=%d%n", n1, n2,n3, n1+n2+n3);
    }

    void add(int n1, int n2, int n3, int n4, int n5){
        System.out.printf("%d+%d+%d+%d+%d=%d%n", n1, n2,n3,n4,n5, n1+n2+n3+n4+n5);
    }

    void add(int n1, int n2, int n3, int n4, int n5, int n6){
        System.out.printf("%d+%d+%d+%d+%d+%d=%d%n", n1, n2,n3,n4,n5,n6, n1+n2+n3+n4+n5+n6);
    }
}


public class Solution {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());
            Add ob=new Add();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5);
            ob.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=Add.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for (Method method : methods) {
                if (set.contains(method.getName())) {
                    overload = true;
                    break;
                }
                set.add(method.getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
