class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int sum2=0;
        int d=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];

        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<10)
            {
                sum2=sum2+nums[i];
            }
            else{
                d=0;
                while(nums[i]!=0)
                {
                    d=nums[i]%10;
                    sum2=sum2+d;
                    nums[i]/=10;
                }
            }
        }
        int ans=sum-sum2;
        return ans;
    }
}
