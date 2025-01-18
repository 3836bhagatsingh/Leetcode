class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        // Brute force
    //    int c=0;
    //    for(int i=0;i<items.size();i++){
    //     if((ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) ||
    //      (ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) ||
    //     (ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue))) c++;
    //    }
    //     return c;
    

    //After some optimization
    int ans =0;
    int key = 0;
    if(ruleKey.equals("color")) key = 1;
    if(ruleKey.equals("name")) key = 2;

    for(List<String> item : items ){
       if(ruleValue.equals(item.get(key))) ans++;
    }
    return ans;
        


    }
}