class Solution {
    public int searchInsert(int[] nums, int target) {
        int found=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target )
            {
                found=i;
                break;

            }
            if(nums[i]>target)
            {
                found=i;
                break;
            }
            if(i==nums.length-1)
            {
                found=i+1;
                

            }
        }
        return found;
        
    }
}
