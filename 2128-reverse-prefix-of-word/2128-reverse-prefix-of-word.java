class Solution {
    public String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public String reversePrefix(String word, char ch) {
        int c=-1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                c=i;
                break;
            }
        }
        if(c==-1) return word;
        String s = word.substring(0,c+1);
        return reverse(s) + word.substring(c+1);
        
    }
}