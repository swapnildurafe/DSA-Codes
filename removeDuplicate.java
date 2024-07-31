public class removeDuplicate {
    public static void main(String[] args)
    {
int nums[]={0,0,1,1,1,2,2,3,3,3};
System.out.print(removeD(nums));
    }
    public static int removeD(int[] nums)
    {
        int i=0;
        for(int n:nums)
        {
            if(i<2 || n!=nums[i-2])
            {
                nums[i++]=n;
            }
        }
        return i;
    }
}
