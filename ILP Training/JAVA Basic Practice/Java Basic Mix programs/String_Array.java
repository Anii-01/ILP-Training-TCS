import java.util.*;

public class String_Array {
    Sacnner sc = new Scanner(System.in);
    
    //System.out.println("How many names : ");
    int n = sc.nextInt();
    //sc.nextLine();
    String names[] = new String[n];

    for(int i=0; i<names.length; i++)
    {
        names[i] = sc.nextLine();
    }

}
