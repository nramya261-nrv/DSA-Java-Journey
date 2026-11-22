class Solution {
    public int countDigits(int num) {
        int d;
        int org=num;
        int count=0;
        while(num>0)
        {
            d=num%10;
            if(org%d==0)
            {
                count++;
            }
            num/=10;
        }
        return count;
    }
}
