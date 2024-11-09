import java.util.*;

public class HashMapTest1 {

    public static void main(String args[])
    {
        Map<String,Integer> students = new HashMap<String,Integer>();

        //HashMap<String,Integer> students = new HashMap<>();


        //clear()
        students.put("Ram",1100);
        students.put("shyam",1200);
        System.out.println("Before clear: "+students);
        students.clear();
        System.out.println("After clear: "+students);


        //put();
        students.put("Aniket",100);
        students.put("Sahil",200);
        students.put("nilam",300);
        students.put("swara",400);

        //size()
        System.out.println("Size is: "+students.size());

        //get()
        System.out.println(students.get("Aniket"));

        //remove()
        students.remove("Aniket");

        //containsKey()  = boolean value
        students.containsKey("Aniket");

        System.out.println("Elements of HashMap are : ");
        System.out.println(students);

        if(students.containsKey("Aniket"))
        {
            Integer a = students.get("Aniket");

            System.out.println(a);
        }
        else
        {
            System.out.println("Key not found");
        }

        //iterate through the hashMap
        System.out.println("Using for loop: ");
        for(String key : students.keySet())
        {
            System.out.println(key + ": "+ students.get(key));
        }

        //keySet()
        System.out.println("Keys are: " +students.keySet());

        //values()
        System.out.println("Values are: "+students.values());


//=============================================================================

        Scanner sc = new Scanner(System.in);
        HashMap <Integer,String> employees = new HashMap<>();

        System.out.println("How many employees you have to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter employee id: ");
            int key = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter employee Name: ");
            String value = sc.nextLine();

            employees.put(key,value);
        }

        System.out.println("iterate over employees HashMap");
        for(Integer emp : employees.keySet())
        {
            System.out.print(employees.get(emp)+" ");
        }
    }
}
