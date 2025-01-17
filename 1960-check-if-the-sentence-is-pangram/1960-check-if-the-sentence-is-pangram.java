class Solution {
    public boolean checkIfPangram(String s) {
       int[] arr = new int[26];
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        arr[ch-'a']++;
       }
       for(int i=0;i<26;i++){
        if(arr[i]==0) return false;
       }
       return true;
    }
}