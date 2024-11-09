public class Factorial_Recursion {

    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        //int fnm1 = fact(n-1);
        int fn = n*fact(n-1);
        System.out.println(fn);
        return fn;
    }

    public static void main(String[] args) {
        int res = fact(5);
        System.out.println(res);
    }   
}
