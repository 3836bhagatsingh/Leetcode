class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0, e = letters.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            
            if (letters[mid] > target) {
                e = mid - 1; // Move left to find a smaller valid letter
            } else {
                s = mid + 1; // Move right as current letter is not greater than target
            }
        }

        // If `s` is out of bounds, wrap around and return the smallest letter
        return letters[s % letters.length];
    }
}
