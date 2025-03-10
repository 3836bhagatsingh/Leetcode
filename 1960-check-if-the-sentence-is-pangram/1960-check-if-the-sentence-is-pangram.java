class Solution {
    public boolean checkIfPangram(String s) {
        Map<Character,Integer> mp = new HashMap<>();

        for(int i=97;i<=122;i++){
           char ch =(char)i;
           mp.put(ch,0);
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            mp.put(ch,mp.get(ch)+1);
        }

        for(Character key:mp.keySet()){
            if(mp.get(key)==0) return false;
        }
        return true;
        
    }
}