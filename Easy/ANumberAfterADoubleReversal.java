class Solution {
    public boolean isSameAfterReversals(int num) {
        int original=num;
        int d;
        int rev=0;
        while(num!=0)
        {
            d=num%10;
            rev=rev*10+d;
            num/=10;
        }
        int rev2=0;
          while(rev!=0)
        {
            d=rev%10;
            rev2=rev2*10+d;
            rev/=10;
        }
        if(original==rev2)
        {
            return true;
        }
        else{
           return false;
        }
    }
}
