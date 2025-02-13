class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<index.length;i++){
            li.add(index[i],nums[i]);
        }
        for(int i=0;i<li.size();i++){
            index[i] = li.get(i);
        }
        return index;
    }
}