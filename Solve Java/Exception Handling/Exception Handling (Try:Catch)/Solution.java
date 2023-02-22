package Exception_Handling_Try_Catch;

// Exception handling is the process of responding to the occurrence, during computation, of exceptions
// – anomalous or exceptional conditions requiring special processing
// – often changing the normal flow of program execution. (Wikipedia)

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x/y);

        }catch (InputMismatchException e){
            System.out.println(e.getClass().getName());

        }catch (ArithmeticException e){
            System.out.println(e.getClass().getName() + ": / by zero");
        }
    }
}
