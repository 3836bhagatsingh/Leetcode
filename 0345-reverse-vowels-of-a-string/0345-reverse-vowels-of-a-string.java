class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList(
            'a','e','i','o','u',
            'A','E','I','O','U'
        )
        );

        char[] sb = s.toCharArray();
        int i=0,j=sb.length-1;
        while(i<j){
            while(i<j && !set.contains(sb[i])) i++;
            while(i<j && !set.contains(sb[j])) j--;
            
                char ch = sb[i];
                sb[i] = sb[j];
                sb[j] = ch; 
                i++;
                j--;
            
        }
        return new  String(sb);
    }
}