// Approach: Two-Pointer + Reverse Second Half
// 1. Use the slow and fast pointer approach to find the middle of the linked list.
//    - 'slow' moves one step at a time, 'fast' moves two steps at a time.
//    - When 'fast' reaches the end, 'slow' will be at the midpoint.
// 2. Reverse the second half of the linked list starting from the midpoint.
//    - This allows easy pairing of corresponding nodes from both halves.
// 3. Use two pointers — one from the start (left) and one from the reversed second half (right).
//    - For each pair, calculate the twin sum: left.val + right.val.
//    - Keep track of the maximum twin sum encountered.
// 4. Return the maximum twin sum after traversing both halves.
//
// Time complexity: O(n) – one pass to find the middle, one to reverse, and one to compute sums
// Space complexity: O(1) – in-place reversal, no extra data structures used

class Solution {
    public int pairSum(ListNode head) {
        
        // Step 1: Find the middle of the linked list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        ListNode prev = null, curr = slow;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compute twin sums using two pointers
        int maxSum = 0;
        ListNode left = head, right = prev;
        while (right != null) {
            maxSum = Math.max(maxSum, left.val + right.val);
            left = left.next;
            right = right.next;
        }

        // Step 4: Return the maximum twin sum
        return maxSum;
    }
}
