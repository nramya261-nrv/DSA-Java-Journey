class Solution {
    public int subtractProductAndSum(int n) {
        int pro=1;
        int sum=0;
        while(n!=0)
        {
            int d=n%10;
            pro=pro*d;
            sum=sum+d;
            n/=10;
        }
        int ans=pro-sum;
        return ans;
    }
}
