class Solution {
    public boolean judgeCircle(String moves) {
        int v = 0,h=0;
        for(int i =0;i<moves.length();i++){
            if(moves.charAt(i)=='U') h++;
            if(moves.charAt(i)=='D') h--;
            if(moves.charAt(i)=='L') v++;
            if(moves.charAt(i)=='R') v--;

        }
        return h == 0 && v==0;
        
    }
}