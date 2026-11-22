class Solution {
    public String largestNumber(int[] nums) {
        int temp;
        String result="";
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                String a=String.valueOf(nums[i]);
                String b=String.valueOf(nums[j]);
        
                if((b+a).compareTo(a+b)>0)
                {
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }

            }

     
        }
        for(int i=0;i<nums.length;i++)
        {
            result+=nums[i];
        }
        if(result.charAt(0)=='0')
        {
            return "0";
        }
        return result;
            
        
    }
}
