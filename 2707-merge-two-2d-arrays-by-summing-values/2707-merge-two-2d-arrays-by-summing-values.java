class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> li = new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i][0]==nums2[j][0]){
                li.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }
            else if(nums1[i][0]<nums2[j][0]){
                 li.add(new int[]{nums1[i][0],nums1[i][1]});
                 i++;
            }
            else{
                 li.add(new int[]{nums2[j][0],nums2[j][1]});
                 j++;
            }
        }
        while(i<nums1.length){
             li.add(new int[]{nums1[i][0], nums1[i][1]});
            i++;
        }
        while(j<nums2.length){
            li.add(new int[]{nums2[j][0], nums2[j][1]});
            j++;
        }
        
        int[][] arr = new int[li.size()][2];
        for(int k =0;k<li.size();k++){
            arr[k] = li.get(k);
        }
        return arr;
        
    }
}