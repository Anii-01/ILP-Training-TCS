import java.util.*;

public class Exception_Handling1{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 0;

        try
        {
            result = number / 0;
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex);
            ex.printStackTrace();
        }
        finally
        {
            System.out.println("Program ended code..");
        }
    }
}
