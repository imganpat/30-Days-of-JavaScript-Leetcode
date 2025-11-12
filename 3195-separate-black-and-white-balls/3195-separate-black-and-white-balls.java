class Solution {
    public long minimumSteps(String s) {
        long steps = 0, ones = 0;
        for(char e: s.toCharArray()){
            if(e == '1'){
                ones++;
            }else{
                steps += ones;
            }
        }
        return steps;
    }
}