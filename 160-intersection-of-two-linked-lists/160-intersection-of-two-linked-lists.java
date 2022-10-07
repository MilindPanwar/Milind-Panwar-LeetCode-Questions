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
        ListNode h1 = headA;
        ListNode h2 = headB;

        int s1 = 0;
        int s2 = 0;
        while (h1 != null) {
            s1++;
            h1 = h1.next;
        } 
        
        while (h2 != null) {
            s2++;
            h2 = h2.next;
        }
        
        int n = s1 - s2;
        h1 = headA;
        h2 = headB;
        if (n > 0) {
            while (n>0) {
                h1 = h1.next;
                n--;
            }
        } else {
            while (n<0) {
                h2 = h2.next;
                n++;
            }
        }
        while (h1 != null) {
            if (h1 == h2) return h1;
            h1 = h1.next;
            h2 = h2.next;
        }
        return h1;
    }
}
