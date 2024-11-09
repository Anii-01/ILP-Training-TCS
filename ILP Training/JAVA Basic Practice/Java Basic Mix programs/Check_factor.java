//Display Factor

import java.util.*;

public class Check_factor{

    static void DisplayFact(int n)
    {
        System.out.println("The Factors are: ");
        int iCnt = 0;
        for(iCnt=1; iCnt<=n; iCnt++)
        {
            if(n % iCnt == 0)
            {
                System.out.println(iCnt);
            }

        }
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DisplayFact(n);
    }

}