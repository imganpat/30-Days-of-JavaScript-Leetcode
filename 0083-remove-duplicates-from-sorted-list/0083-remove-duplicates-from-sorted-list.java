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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;

        ListNode currentNode = head;
        while(currentNode != null) {
            ListNode nextNode = currentNode.next;
            while(nextNode != null) {
                if(currentNode.val == nextNode.val)
                    currentNode.next = nextNode.next;
                nextNode = nextNode.next;
            }
            currentNode = currentNode.next;
        }
        
        return head;
    }
}