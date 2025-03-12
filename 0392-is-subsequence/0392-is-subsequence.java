import java.util.Stack;

class Solution {
    public boolean isSubsequence(String s, String t) {
        Stack<Character> st = new Stack<>(); // Fixed 'Charater' typo
        
        // Push characters of 's' onto the stack
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        
        // Traverse 't' from right to left
        for (int i = t.length() - 1; i >= 0 && !st.isEmpty(); i--) {
            if (st.peek() == t.charAt(i)) { // Fixed 'if(if(...))' syntax
                st.pop(); // Remove matched character from stack
            }
        }
        
        // If the stack is empty, all characters were matched in order
        return st.isEmpty();
    }
}
