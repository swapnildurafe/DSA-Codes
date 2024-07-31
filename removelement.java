public class removelement {
    public static void main(String[] args) {
         int []nums={1,1,1,2,3,3,4,4,3,6};
         int val=3;
         System.out.println(removeElement(nums,val));
    }
    static int removeElement( int nums[] , int val){

        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[count]=nums[i];
                count++;
                continue;
            }
        }
        return count;

    }
}
