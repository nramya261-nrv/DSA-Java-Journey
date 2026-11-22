class Solution {
    public int sumOfUnique(int[] nums) {
       int sum=0;
       int i,j;
       int count=0;
       for(i=0;i<nums.length;i++)
       {
        count =0;
        for(j=0;j<nums.length;j++)
        {
            if(nums[i]==nums[j])
            {
                count++;
            }
        }
        if(count==1)
        {
            sum=sum+nums[i];
        }
       }
       return sum;
    }
}
