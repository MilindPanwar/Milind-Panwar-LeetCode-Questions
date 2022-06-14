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
public class Solution {

    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode entry = head;
        
        while (fast.next != null && fast.next.next != null) {
            //waiting for slow and fast to collide
            slow = slow.next;
            fast = fast.next.next;
            
            //if slow & fast collids
            //entry comes in from head
            //entry and slow starts moving 1 step at a time
            //waiting slow and entry to collide
            if (slow == fast) {
                while (entry != slow) {
                    slow = slow.next;
                    entry = entry.next;
                }
                //if slow and entry collids that means this is the starting of cycle
                return slow;
            }
        }
        //if there is no cycle null is returned
        return null;
    }
}
