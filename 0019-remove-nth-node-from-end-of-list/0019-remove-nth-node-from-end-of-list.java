/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 
// Approach: Two-Pointer (Fast–Slow Gap Method)
// 1. Use two pointers: 'right' moves n steps ahead of 'left'.  
// 2. After creating this gap, move both pointers together until 'right' reaches the end.  
//    - This ensures 'left' stops exactly at the node *before* the one to be removed.  
// 3. Special case: If right becomes null after initial movement,
//    it means the node to remove is the head → return head.next.  
// 4. Otherwise, remove the nth node from end by skipping it:  
//         left.next = left.next.next  
// 5. Return the (possibly updated) head of the list.  
//
// Time complexity: O(n) — each pointer traverses the list once  
// Space complexity: O(1) — constant extra space used

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Edge case: list has only one node
        if (head.next == null) {
            return null;
        }
        
        ListNode left = head, right = head;

        // Move 'right' pointer n steps ahead
        for (int i = 0; i < n; i++) {
            right = right.next;
        }

        // If 'right' is null, the node to remove is the head
        if (right == null) {
            return head.next;
        }

        // Move both pointers until right reaches last node
        while (right.next != null) {
            left = left.next;
            right = right.next;
        }

        // Remove the nth node from the end
        left.next = left.next.next;

        return head;
    }
}
