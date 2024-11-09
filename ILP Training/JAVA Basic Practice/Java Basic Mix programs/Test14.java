//leetcode - 

public class Test14 {
    
    public static void main(String args[])
    {
        int nums[] = {2,2,1};

        for(int i=0;i<nums.length;i++)
        {
            boolean flag = true;
            for(int j=0;j<nums.length;j++)
            {
                if((i!=j) && (nums[i]==nums[j]))
                {
                    flag = false;
                    break;
                }
            }

            if(flag == true)
            {
                System.out.println(nums[i]);
                return;
            }
        }
        System.out.println("-1");
    }
}
