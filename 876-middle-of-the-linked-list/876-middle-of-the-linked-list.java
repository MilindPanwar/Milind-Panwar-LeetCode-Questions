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

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        //fast!=null (agar boundary cross kargaya) 
        //fast.next!=null (agar just boundary pe hai)
        //then just terminate the while loop, slow stores the required node automatically
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
