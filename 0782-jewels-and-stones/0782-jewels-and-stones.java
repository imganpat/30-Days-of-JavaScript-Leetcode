// Approacg: Brute Force
// Time complexity: O(n1 * n2)
// Space complexity: O(1)

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0, jewelsLength = jewels.length(), stonesLength = stones.length();
        for(int i = 0; i < jewelsLength; i++){
            for(int j = 0; j < stonesLength; j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
}