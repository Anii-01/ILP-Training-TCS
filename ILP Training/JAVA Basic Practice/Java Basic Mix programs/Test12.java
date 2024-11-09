import java.util.Scanner;

public class Test12 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev = 0;
        int rem = 0;

        System.out.println("Number before reverse: "+n);
        while(n!=0)
        {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println("Number after reverse: "+rev);
    }   
}
