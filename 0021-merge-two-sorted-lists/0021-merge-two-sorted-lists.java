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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode head = null;
        while(list1 != null && list2 != null){
            ListNode node;
            if(list1.val < list2.val){
                node = new ListNode(list1.val, null);
                System.out.println("List1 " + node.val);
                list1 = list1.next;

            }else{
                node = new ListNode(list2.val,null);
                System.out.println("List2 "+node.val);
                list2 = list2.next;
            }

            if(head == null){
                head = node;
            }
            else {
                ListNode current = head;
                while (current.next != null)
                    current = current.next;
                current.next = node;
            }
        }

         if (list1 != null) {
            ListNode current = head;
            while (current.next != null) current = current.next;
            current.next = list1;
        } else if (list2 != null) {
            ListNode current = head;
            while (current.next != null) current = current.next;
            current.next = list2;
        }

        return head;
    }   
}