//import java.util.*;

//HashSet , HashMap == Hashing - hashTable

//best Data Structure
//HashSet **(constant time)      // Array    // BST
//Insert add = o(1)               o(1)       o(h)
//Search contains = o(1)          o(n)       o(h)
//Delete Remove = o(1)            o(n)       o(n)


import java.util.HashSet;
import java.util.Iterator;

public class HashSet1
{
    public static void main(String args[])
    {
        //creation
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //Search
        if(set.contains(1))
        {
            System.out.println("Set contains 1");
        }

        if(!set.contains(6))
        {
            System.out.println("does not contain");
        }


        //Delete
        set.remove(1);
        if(!set.contains(1))
        {
            System.out.println("Set does not contains 1");
        }

        //Size
        System.out.println("Size is : "+set.size());

        //Print all elements
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();
        //hasNext()
        //next()

        System.out.println("Using iterator..");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}