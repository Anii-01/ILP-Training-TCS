import java.util.*;

public class SetPract1 {
    
    public static void main(String args[])
    {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"ANiket");
        map.put(2,"Neelam");
        map.put(3,"Adi");

        for(Integer key : map.keySet())
        {
            System.out.println(map.get(key));;
        }

        for(Map.Entry m : map.entrySet())
        {
            System.out.println(m.getKey() + " "+ m.getValue());
        }
    }
}
