// Basic ArrayList - non-generic

import java.util.*;
//import java.ArrayList;

public class ArrayList_Test1 {

    public static void main(String args[])
    {
        ArrayList <String> fruits = new ArrayList<>();

        System.out.println("Size is : ");
        System.out.println(fruits.size());

        fruits.add("banana");
        fruits.add("apple");
        fruits.add("cherry");

        System.out.println("Size is : ");
        System.out.println(fruits.size());

        System.out.println("at index 0 : "+ fruits.get(0));
        System.out.println("at index 1 : "+ fruits.get(1));
        System.out.println("at index 2 : "+ fruits.get(2));
        //System.out.println("at index 2 : "+ fruits.get(3));


        System.out.println("Using for each loop -");
        for(String str : fruits)
        {
            System.out.println(str);
        }

        System.out.println("Before Sorting : ");
        System.out.println("Using Iterator -");
        Iterator itr = fruits.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println();

        Collections.sort(fruits);
        System.out.println("After Sorting : ");
        Iterator itr1 = fruits.iterator();
        while(itr1.hasNext())
        {
            System.out.print(itr1.next()+" ");
        }

        
        System.out.println("\nNumbers arraylist is: ");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);




    }
}
