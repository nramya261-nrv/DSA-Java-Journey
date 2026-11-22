class Solution {
    public boolean checkPerfectNumber(int num) {
        int i,sum=0;
        for(i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        if(num==sum)
        {
            return true;
        }
        return false;
    }
}
