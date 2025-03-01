class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // creating Hashmap and an arraylist
        Set<Integer> set = new HashSet<>();
        Set<Integer> li = new HashSet<>();

        // traversal in nums1
        for(int i=0;i<nums1.length;i++){
           set.add(nums1[i]);
        }

        //traversal in nums2
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                li.add(nums2[i]);
            }
        }
        int[] res = new int[li.size()];
        int k=0;
        for(int i : li){
            res[k++] = i;
        }
        return res;



        
    }
}