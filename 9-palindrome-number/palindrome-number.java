class Solution {
    public boolean isPalindrome(int x) {
        int dup=x;
        int rev=0;
        boolean res=false;
        if(x<0) return res;
        while(x>0)
        {
            int ld=x%10;
            x=x/10;
            rev=(rev*10)+ld;
        }
        if(rev==dup)
        {
            res=true;
        }
        
    return res;
    }
}