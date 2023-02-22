package Java_Inheritance2;

class Arithmetic {
    int add(int a, int b){
        return a + b;
    }
}

class Adder extends Arithmetic{}

public class Solution {
    public static void main(String[] args) {
        Adder adder = new Adder(); // object

        // print the name of the superclass by problem description
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getSimpleName());

        // print the wanted result
        System.out.printf("%d %d %d%n"
                , adder.add(10,32)
                , adder.add(10,3)
                , adder.add(10,10));
    }
}
