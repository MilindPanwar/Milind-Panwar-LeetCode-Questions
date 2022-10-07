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

    public boolean hasCycle(ListNode head) {
        ListNode h = head;
        HashSet<ListNode> hs = new HashSet<ListNode>();
        while (h != null) {
            if (hs.contains(h)) {
                return true;
            } else {
                hs.add(h);
            }
            h = h.next;
        }
        return false;
    }
}
