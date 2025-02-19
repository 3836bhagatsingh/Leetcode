class Solution {
    public  int add(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    } 
    public int addDigits(int num) {
        if(num<10) return num;
        int ans = 0;
        while(num>=10){
            num = add(num);
        }
        return num;
        
    }
}