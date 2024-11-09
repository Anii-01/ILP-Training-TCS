import java.util.Scanner;

public class String_Array2 {

    public static void makeLowerCase(String names[])
    {
        for(int i = 0; i< names.length; i++)
        {
            names[i] = names[i].toLowerCase();
        }
    }

    public static int maxSizeOfString(String names[])
    {
        int maxlength = 0;
        String count = null;
        for(String str : names)
        {
            if(str.length() > maxlength)
            {
                maxlength = str.length();
                count = str;
            }
        }
        System.out.println("The biggest string is : "+count);
        return maxlength;
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter how many names: ");
        int n = sc.nextInt();
        System.out.println("Enter names: ");
        sc.nextLine();
        String names[] = new String[n];
        for(int i = 0; i< names.length; i++)
        {
            names[i] = sc.nextLine();
        }

        System.out.println("before Names are: ");
        for(int j = 0; j< names.length; j++)
        {
            System.out.println(names[j]);
        }

        makeLowerCase(names);

        System.out.println("after Names are: ");
        for(int j = 0; j< names.length; j++)
        {
            System.out.println(names[j]);
        }

        int maxlenres = maxSizeOfString(names);
        System.out.println("The maximum length of a string is : "+maxlenres);
    }
}
