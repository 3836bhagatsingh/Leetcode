class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer,Integer> map  = new HashMap<>();
        for(int[] num : nums1){
            map.put(num[0],num[1]);
        }
        for(int[] num :nums2){
            if(map.containsKey(num[0])){
                map.put(num[0],map.get(num[0])+num[1]);
            }
            else{
                map.put(num[0],num[1]);
            }

        }
        int[][] ans = new int[map.size()][2];
        int k =0;
        for(int key :map.keySet()){
            ans[k++] = new int[]{key,map.get(key)};
        }
        Arrays.sort(ans,(a,b)->Integer.compare(a[0],b[0]));
        return ans;

    }

} 