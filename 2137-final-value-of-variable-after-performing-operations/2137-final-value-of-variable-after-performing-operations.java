// Appraoch: Brute Force
// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String op: operations){
            // switch(op) {
            //     case "++X":
            //     case "X++":
            //         x++;
            //         break;
            //     default:
            //         x--;
            // }
            x = (op.indexOf("+") >= 0) ? x+1 : x-1;
        }
        return x;
    }
}