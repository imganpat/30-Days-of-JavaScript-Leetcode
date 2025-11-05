// Approach: Count Imbalance Using Greedy
// 1. Use a counter `count` to track imbalance between '[' and ']' while scanning the string.
//    - Increment `count` for ']' (unmatched closing).
//    - Decrement `count` for '[' (a potential match to close imbalance).
// 2. Track the maximum imbalance `maxCount` encountered.
//    - Peak imbalance tells how many swaps are required because each swap fixes 2 misplaced brackets.
// 3. Final swaps needed = (maxCount + 1) / 2.
//
// Time complexity: O(n) – one pass through the string
// Space complexity: O(1) – only integer variables used

class Solution {
    public int minSwaps(String s) {
        int maxCount = 0, count = 0;

        for (char c : s.toCharArray()) {
            if (c == '[') {
                count--; // A '[' can potentially cancel a ']'
            } else {
                count++; // A ']' increases imbalance
            }

            maxCount = Math.max(maxCount, count); // Track highest imbalance
        }

        return (maxCount + 1) / 2; // Each swap fixes 2 imbalance
    }
}
