class Solution {
    public int strStr(String haystack, String needle) {
        for(int i =0;i<=haystack.length()-needle.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int j =i,k=0;
                while(k<needle.length()){
                    if(haystack.charAt(j)!=needle.charAt(k)){
                        break;
                    }
                    k++;
                    j++;
                }
                if(k == needle.length())  return i;

            }
        }
        return -1;
        
    }
}
