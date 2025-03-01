class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Brute force approach
        // ArrayList<Integer> l = new ArrayList<>();
        // int i=0,j=0;
        // while(i<m && j<n){
        //     if(nums1[i]<=nums2[j]){
        //         l.add(nums1[i]);
        //         i++;
        //     }
        //     else if(nums2[j]<nums1[i]){
        //          l.add(nums2[j]);
        //          j++;
        //     }
        // }
        // while(i<m){
        //     l.add(nums1[i]);
        //     i++;
        // }
        // while(j<n){
        //     l.add(nums2[j]);
        //     j++;
        // }
        // for(int k = 0;k<l.size();k++){
        //     nums1[k] = l.get(k);
        // }

        // Optimized Approach
        int i=m-1,
            j = n-1,
            k = m+n-1;
        while(j>=0){
            if( i>=0 && nums1[i]>=nums2[j] ){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }

        
    }
}