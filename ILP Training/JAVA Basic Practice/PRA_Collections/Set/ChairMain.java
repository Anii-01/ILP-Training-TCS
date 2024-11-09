//practice pra set
import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

class Chair{
    int id;
    int height ;
    int base;
    String material;

    public Chair(int id, int height, int base, String material)
    {
        this.id = id;
        this.height = height;
        this.base = base;
        this.material = material;
    }

    public int getHeight()
    {
        return this.height;
    }
}

public class ChairMain
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Chair> chairs = new ArrayList<>();

        for(int i=0; i<4; i++)
        {
            int id = sc.nextInt();
            int height = sc.nextInt();
            int base = sc.nextInt();
            sc.nextLine();
            String material = sc.nextLine();

            Chair ch = new Chair(id,height,base,material);
            chairs.add(ch);
        }

        TreeSet<String> str = getUniqueMaterials(chairs);
        
        for(String st : str)
        {
            System.out.println(st);
        }

        arrangeByHeight(chairs);
    }

    public static TreeSet<String> getUniqueMaterials(ArrayList<Chair>chairs)
    {
        TreeSet<String> umaterials = new TreeSet<>();
        for(Chair ch : chairs)
        {
            umaterials.add(ch.material);
        }

        return umaterials;
    }

    public static void arrangeByHeight(ArrayList<Chair>chairs)
    {
        System.out.println("Before Comparator :-");
        for(Chair ch : chairs)
        {
            
            System.out.println(ch.getHeight() + " ");
        }

        chairs.sort(Comparator.comparing(Chair :: getHeight));

        System.out.println("After Comparator :-");
        for(Chair ch : chairs)
        {
            
            System.out.println(ch.getHeight() + " ");

        }
    }
}