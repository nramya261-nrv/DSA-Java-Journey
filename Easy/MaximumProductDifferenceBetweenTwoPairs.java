class Solution {
    public int maxProductDifference(int[] nums) {
        int temp;
        int ans;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                {
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        int len=nums.length;
        int a=nums[0]*nums[1];
        int b=nums[len-1]*nums[len-2];
        if(a>b){
         ans=a-b;
        }
        else{
            ans=b-a;
        }
        return ans;
    }
}
