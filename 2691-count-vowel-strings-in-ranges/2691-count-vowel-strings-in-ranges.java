class Solution {

    public boolean check(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') return true;
        return false;
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] temp = new int[words.length];
        int k=0;
        int c=0;
        for(int i=0;i<words.length;i++){
            int len = words[i].length();
            char ch1 = words[i].charAt(0);
            char ch2 = words[i].charAt(len-1);
            if(check(ch1) && check(ch2)){
                c = c+1;
            }
            temp[i] = c;
        }
        int[] arr = new int[queries.length];
        for(int[] a : queries){
            int l = a[0];
            int r = a[1];
             arr[k++] = (l == 0) ? temp[r] : temp[r] - temp[l - 1]; 
        }
        return arr;


    }
}