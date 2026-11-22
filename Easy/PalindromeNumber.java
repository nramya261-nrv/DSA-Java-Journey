class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int rev=0;
        int d;
        int temp=x;
        while(x!=0)
        {
            d=x%10;
            rev=rev*10+d;
            x/=10;
        }
        if(rev==temp)
        {
            
            return true;
        }
       
         return false;
 
    }
    
}
