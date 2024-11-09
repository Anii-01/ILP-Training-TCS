//pract pra

import java.util.*;

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

    public int getId()
    {
        return this.id;
    }
}


public class ChairMain
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        HashMap <Integer,Chair> chairs = new HashMap<>();

        for(int i=0; i<4; i++)
        {
            int id = sc.nextInt();
            int height = sc.nextInt();
            int base = sc.nextInt();
            sc.nextLine();
            String material = sc.nextLine();

            Chair ch = new Chair(id,height,base,material);
            chairs.put(id,ch);
        }

        Integer res = findMaxKeyMaterial(chairs);
        Chair val = chairs.get(res);
        System.out.println(val.material);
    }

    public static Integer findMaxKeyMaterial(HashMap<Integer,Chair> chairs)
    {
        // //method 1 
        // Integer maxKey = null;
        // //Integer maxKey = Integer.MIN_VALUE;
        // for(Integer key : chairs.keySet())
        // {
        //     if(maxKey == null || key > maxKey)
        //     {
        //         maxKey = key;
        //     }
        // }
        // return maxKey;


        //method 2
        //chairs.sort(Comparator.comparing(Chair::getId));

        ArrayList <Integer> sortedkeys = new ArrayList<>();
        for(Integer key : chairs.keySet())
        {
            sortedkeys.add(key);
        }
        //sortedkeys.sort(Comparator.comparing(Chair::getId));
        Collections.sort(sortedkeys);
        return(sortedkeys.size());
    }
}