class Solution {
    public int missingNumber(int[] nums) {
        int a=0;
        int b=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
             a=n*(n+1)/2;
             b=b+nums[i];
            
        }
        int ans=a-b;
        return ans;

    }
}
