class Solution {
    public String reverseWords(String s) {
         s= s.trim();
        int n = s.length();
        int i=n-1;
        StringBuilder ans = new StringBuilder();
        while(i>=0){
            if(i<0) break;
            int j = i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            ans.append(s.substring(i+1,j+1)).append(" ");
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            

        }
        return ans.toString().trim();
        
    }
}