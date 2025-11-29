class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        
        while (true) {
            int sum = 0;
            
            while (n != 0) {
                int d = n % 10;
                sum += Math.pow(d, 2);
                n /= 10;
            }
            
            n = sum;
            
            if (sum == 1) {
                return true;
            }
            
            // if (set.contains(sum)) {
            //     return false;
            // }
            // set.add(sum);
            
            if(!set.add(sum)){
                return false;
            }
        }
    }
}