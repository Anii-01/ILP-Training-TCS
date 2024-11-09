// Check Perfect

import java.util.*;

public class CheckPerfect{

    static boolean Check_Perfect(int n)
    {
        int i=0;
        int sum = 0;

        for(i=1; i<=n/2; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }

        if(sum == n)
        {
            return true;
        }
        else
        {
            return false;

        }


    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = Check_Perfect(n);
        if(res == true)
        {
            System.out.println(n + " is perfect number.");
        }
        else
        {
            System.out.println(n + " is not perfect number.");
        }
        
    }
}

