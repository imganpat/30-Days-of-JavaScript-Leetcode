/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// Approach: Floyd’s Cycle Detection Algorithm (Tortoise and Hare)
// 1. Use two pointers — 'slow' moves one step at a time, 'fast' moves two steps at a time.
// 2. If there is a cycle, slow and fast will eventually meet inside the cycle.
// 3. Once a meeting point is found, move one pointer to the head of the list, and keep the other at the meeting point.
// 4. Move both pointers one step at a time. The node where they meet again is the start of the cycle.
// 5. If fast reaches null, the list has no cycle; return null.
//
// Time complexity: O(n) – both detection and finding cycle start take linear time
// Space complexity: O(1) – constant extra space, no additional data structures used

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;

        // Step 1: Detect if a cycle exists using fast/slow pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;         // slow moves 1 step
            fast = fast.next.next;    // fast moves 2 steps

            // Cycle detected
            if (slow == fast) {
                fast = head;          // move fast to head

                // Step 2: Find the start of the cycle
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return fast; // or slow, both are now at cycle start
            }
        }

        // No cycle found
        return null;
    }
}