class Solution {
    public int majorityElement(int[] nums) {
      int count=0;
      
      int maxe=0;
      for(int i=0;i<nums.length;i++)
      {
           if(count==0)
           {
            maxe=nums[i];
           }
           if(maxe==nums[i])
           {
            count++;
           }
           else{
            count--;
           }
    }
    return maxe;
}
}
