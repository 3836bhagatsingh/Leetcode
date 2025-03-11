class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Map<Integer,String> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int k=0;
        for(int i=n-1;i>=0;i--){
            names[k++] = mp.get(heights[i]);
        }
        return names;
        
    }
}