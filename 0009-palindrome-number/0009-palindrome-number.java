class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x>=0 && x<=9) return true;
        int temp = x;
        int rev = 0;
        while(x!=0){
            int rem = x%10;
            rev = rev*10 + rem;
            x = x/10;
        }
        return temp == rev;
        
    }
}