class Solution {
    public String reversePrefix(String s, char ch) {
        StringBuilder sb = new StringBuilder("");
        int idx = -1,n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==ch){
                idx = i;
                break;
            }
        }
        if(idx ==-1) return s;
        for(int i=idx;i>=0;i--){
            sb.append(s.charAt(i));
        }
        for(int i=idx+1;i<n;i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}