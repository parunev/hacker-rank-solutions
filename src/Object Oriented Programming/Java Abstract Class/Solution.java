package Java_Abstract_Class;

import java.util.Scanner;

// A Java abstract class is a class that can't be instantiated.
// That means you cannot create new instances of an abstract class. It works as a base for subclasses
abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}

class MyBook extends Book {

    @Override
    void setTitle(String s) {
        title = s;
    }
}


public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();

        // Book is abstract class and cannot be instantiated
        MyBook newBook = new MyBook();
        newBook.setTitle(bookName);

        System.out.println("The title is: " + newBook.getTitle());
    }
}
