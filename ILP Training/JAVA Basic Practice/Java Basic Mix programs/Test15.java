 //leetcode plus one
import java.util.*;

public class Test15{

    public static void main(String args[])
    {
        //int digits[] = {1,2,3};
        //int digits[] = {9};
        int digits[] = {9,8,7,6,5,4,3,2,1,0};
        String str = "";
        for(int i=0; i<digits.length; i++)
        {
         str = str + digits[i];
        }
        System.out.println(str);  
        Integer no = Integer.valueOf(str); 
        no = no +1;
        System.out.println("no = "+no);

        String no2 = no.toString();
        int size = no2.length();
        int arr[] = new int[size];

        int i = arr.length-1;
        while(no!=0)
        {
            int idigit = no % 10;
            no = no /10;
            arr[i] = idigit;
            System.out.println(arr[i]);
            i--;
        }

        // String res = no.toString();
        // System.out.println("res = "+res);

        // for(int j=0; j<res.length(); j++)
        // {
        //     digits[j] = res.charAt(j);
        //     System.out.println(digits[j]);
        // }
    }
}
