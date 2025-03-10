class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            mp.put(ch,i);
        }  
        int ans =0;
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            ans += Math.abs(i-mp.get(ch));
        } 
        return ans;
    }
}