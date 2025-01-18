class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        for(int i=1;i<gain.length;i++){
            gain[i] = gain[i]+gain[i-1];
            if(ans<=gain[i]) ans = gain[i];
        }
        return Math.max(ans,gain[0]);
        
    }
}