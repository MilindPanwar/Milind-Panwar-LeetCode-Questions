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
        int size = 0;
        ListNode s1 = head;
        while (s1 != null) {
            size++;
            s1 = s1.next;
        }
        ListNode tmp = head;
        int ptr = 1;
        int itr = size - n;
        if (itr == 0) {
            return head.next;
        }
        while (ptr < itr) {
            tmp = tmp.next;
            ptr++;
        }

        tmp.next = tmp.next.next;

        return head;
    }
}
