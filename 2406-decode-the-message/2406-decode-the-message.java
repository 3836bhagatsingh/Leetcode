class Solution {
    public String decodeMessage(String s, String m) {
        int a = 97;
        Map<Character,Character> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(mp.containsKey(ch) || ch ==' ') continue;
            else{
                mp.put(ch,(char)a);
                a++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m.length();i++){
            if(m.charAt(i)==' ') sb.append(" ");
            else sb.append(mp.get(m.charAt(i)));
        }
        return sb.toString();
        
    }
}