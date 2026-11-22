class Solution {
    public int thirdMax(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]<nums[j])
                {
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
       int count=0;
       int ans=nums[0];
       for(int i=0;i<nums.length;i++)
       {
        if(i==0 || nums[i]!=nums[i-1]){
            count++;
        }
            if(count==3)
            {
                return nums[i];
            }
            
        
       }
       return nums[0];
    }
}
