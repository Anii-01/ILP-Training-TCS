import java.util.Scanner;

public class PrimeNo {

    public static boolean checkPrime(int n)
    {
        boolean flag = false;
        if((n == 0)||(n == 1))
        {
            flag = true;
            return flag;
        }
        else
        {
            for(int i = 2; i<=n/2;i++)
            {
                if(n % i == 0)
                {
                    flag = true;
                    return flag;
                }
            }
        }
        return flag;
    }

    public static void main(String  args[])
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        boolean res = checkPrime(input);

        if(res == true)
        {
            System.out.println("No is not prime!");

        }
        else{
            System.out.println("No is prime!");
        }


    }
    
}
