public class Basics1 {

    public static void main(String args[])
    {
        int nums[] = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] =4;
        
        //int element = 0;
        for(int element : nums)
        {
            System.out.println(element);
        }
    }
}
