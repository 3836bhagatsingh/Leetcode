class Solution {
    public String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
    
    public String reverseWords(String s) {
       StringBuilder sb = new StringBuilder();
       int i=0;
       while(i<s.length()){
        int j = i;
        while(i<s.length() && s.charAt(i)!=' ') i++;
        sb.append(reverse(s.substring(j,i))).append(' ');
        i++;
       }
       return sb.toString().trim();

        
    }
}