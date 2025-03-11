class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans =0;
        Map<Character,Integer> mp = new HashMap<>();
        for(char ch : chars.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(String word:words){
            Map<Character,Integer> w_mp = new HashMap<>();
            for(char ch : word.toCharArray()){
                w_mp.put(ch,w_mp.getOrDefault(ch,0)+1);
            }
            boolean flag = true;
            for(char ch: word.toCharArray()){
                if(w_mp.get(ch) > mp.getOrDefault(ch,0)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                ans += word.length();
            }

        }
        return ans;
        
    }
}