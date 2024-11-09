import java.util.*;

public class TestHashSet1
{
    public static void main(String args[])
    {
        //LinkedHashSet
        Set<String> dataSet = new LinkedHashSet<String>();

        dataSet.add("Nilam");
        dataSet.add("Aniket");
        dataSet.add("Swara");
        dataSet.add("Kavita");
        dataSet.add("Aniket1");

        System.out.println("Elements of LinkedHashSet are : ");
        System.out.println(dataSet);

        System.out.println("Using for each loop: ");
        for(String str : dataSet)
        {
            System.out.println(str);
        }

        //TreeSet
        Set<String> dataSet2 = new TreeSet<String>();

        dataSet2.add("Nilam");
        dataSet2.add("Aniket");
        dataSet2.add("Swara");
        dataSet2.add("Kavita");

        System.out.println("Elements of TreeSet are : ");
        System.out.println(dataSet2);


        //HashSet
        HashSet <String> h = new HashSet<String>();
        h.add("Aniket");
        h.add("Nilam");
        h.add("Swara");
        System.out.println("Elements of HashSet are : ");
        System.out.println(h);

    }
}