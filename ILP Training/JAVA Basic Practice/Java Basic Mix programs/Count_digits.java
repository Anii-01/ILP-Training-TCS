import java.util.*;


public class Count_digits {

    public static void main(String args[])
    {
        int no = 12345;
        System.out.println("original no: "+no);
        int iDigit = 0;
        int rev = 0;
        while(no != 0)
        {
            iDigit = no % 10;
            System.out.print(iDigit);
            rev = iDigit + rev*10;
            no = no/10;
        }
        System.out.println("rev no: "+rev);
    }
    
}
