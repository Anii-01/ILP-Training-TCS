import java.util.*;

public class Count_Capital_from_string {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        char arr[] = name.toCharArray();

        int iCnt = 0;
        for(int i =0; i<arr.length;i++)
        {
            if((arr[i] >= 'A') && (arr[i] <= 'Z'))
            {
                iCnt ++;
                System.out.println(arr[i]);
            }
        }
        System.out.println(iCnt);
    }
}
