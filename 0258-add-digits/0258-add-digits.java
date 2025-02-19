class Solution {
    public int add(int n){
        int ans = 0;
        while(n>0){
            ans += n%10;
            n = n/10;
        }
        return ans;
    }
    public int addDigits(int num) {
        if(num<10) return  num;
        int sum = add(num);
        return addDigits(sum);
    }
}