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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        //start as a dummy node
        ListNode start = new ListNode();
        start.next = head; //its a prev node of head
        ListNode prev = start;
        ListNode ahead = start;
        for (int i =0; i <n; i++) {
            ahead = ahead.next; //stores the value to move prev pointer
        }
        if(ahead.next==null){
            return head.next; //edge condition (if 1st node should be removed)
            //return head.next as head will be deleted
        }
        while (ahead.next != null) {
            ahead = ahead.next;
            prev = prev.next;
        }
        prev.next = prev.next.next; //suppose prev is 1 and prev..next.next is on 3 so the 2 is deleted here
        return head;
    }
}
