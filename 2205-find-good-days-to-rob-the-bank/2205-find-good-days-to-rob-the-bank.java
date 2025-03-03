class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int n = security.length;
        int[] pre = new int[n];
        int[] suf = new int[n];

        for(int i=1;i<n;i++){
            if(security[i]>security[i-1])   pre[i] = 0;  
            else pre[i] = pre[i-1] + 1;
        }

        for(int i=n-2;i>=0;i--){
            if(security[i] > security[i+1]) suf[i]=0;
            else suf[i]= suf[i+1]+1;
        }

        List<Integer> li = new ArrayList<>();
        for(int i=time;i<security.length-time;i++){
            if(pre[i]>=time && suf[i]>=time) li.add(i);
        }
        return li;

    }
}
