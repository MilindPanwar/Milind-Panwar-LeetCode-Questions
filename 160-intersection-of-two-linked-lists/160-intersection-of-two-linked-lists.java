/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode l2 = headB;
        while (l2 != null) {
            ListNode l1 = headA; //l1 at head at every new iteration
            while (l1 != null) {
                if (l1 == l2) {
                    return l2;
                }
                l1 = l1.next;
            }
            l2 = l2.next;
        }
        return null;
    }
}
