class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            if(first>nums1[i]) first = nums1[i];
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])) return nums2[i];
            if(second>nums2[i]) second = nums2[i];
            set.add(nums2[i]);
        }
        return Math.min(first, second) * 10 + Math.max(first, second);
        
        
    }
}