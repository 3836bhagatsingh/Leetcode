class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        ans.add(temp);
        int i=1,num=0;
        while(i<numRows){
            List<Integer> li = new ArrayList<>();
            li.add(1);
            for(int j = 1;j<=num;j++){
                int a = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                li.add(a);
            }


            li.add(1);
            ans.add(li);
            i++;
            num++;
        }
        return ans;
        
    }
}