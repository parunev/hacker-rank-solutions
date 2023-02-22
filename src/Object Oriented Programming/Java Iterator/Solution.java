package Java_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Solution {

    static Iterator func(ArrayList myList){

        Iterator it = myList.iterator();
        while(it.hasNext()){
            Object element = it.next();
            if(element.equals("###"))
                break;
        }
        return it;
    }

    @SuppressWarnings({ "unchecked" })
    public static void main(String []args){
        ArrayList myList = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        for(int i = 0;i<n;i++){
            myList.add(scanner.nextInt());
        }

        myList.add("###");
        for(int i=0;i<m;i++){
            myList.add(scanner.next());
        }

        Iterator it = func(myList);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}
