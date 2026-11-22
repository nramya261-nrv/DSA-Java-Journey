class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
       int[] ans=new int[nums.length];
        for(int i=0;i<index.length;i++)
        {
            int a=index[i];
             for(int j=i; j>a; j--)
            {
                ans[j] = ans[j-1];
            }

            ans[a]=nums[i];
        }
        return ans;
    }
}
