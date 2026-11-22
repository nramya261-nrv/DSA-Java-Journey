class Solution {
    public int mySqrt(int x) {
        int i,ans=0;
    for(i=1;i<=x;i++)
    {
        if((long)i*i<=x)
        ans=i;
        else
        break;
        
    }
    return ans;

    }
}
