class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        List<Integer> li = new ArrayList<>();
        int i = nums.length-1;
        int temp =k;
     
        while( i>=0 || temp>0){
            if(i>=0){
                temp += nums[i];
                i--;
            }
            li.add(temp%10);
            temp = temp/10;
        }
        Collections.reverse(li);
        return li;

        
    }
}