class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> mp = new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
           if(!mp.containsKey(ch)) return false;
           else{
            mp.put(ch,mp.get(ch)-1);
           }
        }
        for(char key:mp.keySet()){
            if(mp.get(key)!= 0) return false;
        }
        return true;


        
    }
}