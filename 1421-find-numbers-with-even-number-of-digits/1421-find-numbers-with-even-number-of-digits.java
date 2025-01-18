class Solution {
    public int findNumbers(int[] nums) {
        // int c=0;
        // for(int i :nums){
        //     int len = String.valueOf(i).length();
        //     if((len&1)==0) c++;
        // }
        // return c;

         int evenDigitCount = 0;

        for (int num : nums) {
            if ((num >= 10 && num <= 99) || (num >= 1000 && num <= 9999) || num == 100000)
                evenDigitCount++;
        }

        return evenDigitCount;



    }
}