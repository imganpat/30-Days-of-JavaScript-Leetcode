// Approach: Stack + Count Imbalance
// 1. Traverse the string and use a stack to track unmatched '[' brackets.
// 2. For each character:
//    - If it's '[', push it onto the stack.
//    - If it's ']', then:
//        • If stack is not empty, pop one '[' (it matches).
//        • If stack is empty, it means this ']' is unmatched → increment swaps counter.
// 3. At the end, each unmatched ']' requires one swap with a future '[',
//    and two unmatched ']' cover one swap operation → return (swaps + 1) / 2.
// 4. Return the minimum number of swaps needed to balance the bracket string.
//
// Time complexity: O(n) – single traversal of the string
// Space complexity: O(n) – stack may store up to n characters in worst case

class Solution {
    public int minSwaps(String s) {
        int swaps = 0;
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    swaps++; // found unmatched ']'
                } else {
                    stack.pop(); // match found
                }
            }
        }

        // Each swap fixes two unmatched brackets
        return (swaps + 1) / 2;
    }
}
