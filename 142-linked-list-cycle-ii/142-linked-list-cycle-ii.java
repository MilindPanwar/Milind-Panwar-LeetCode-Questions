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
        ListNode h = head;
        HashSet<ListNode> hs = new HashSet<ListNode>();
        while (h != null) {
            if (hs.contains(h)) {
                return h;
            } else {
                hs.add(h);
            }
            h=h.next;
        }
        return null;
    }
}
