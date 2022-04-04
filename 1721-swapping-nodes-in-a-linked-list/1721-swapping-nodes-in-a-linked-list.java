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

    public ListNode swapNodes(ListNode head, int k) {
        
        //k minus 1 so that k points on Kth position in list
        k = k - 1;
        
        ListNode firstN = head;
        while (k > 0) {
            //this will go from head to the kth value
            firstN = firstN.next;
            k--;
        }
        //secondN is k distance from firstN
        ListNode secondN = head;
        //f is at kth position and kth ahead of secondN
        ListNode f = firstN;
        
        while (f.next != null) {
            //if f is at end of LL then secondN must be at Kth position from the end
            secondN = secondN.next;
            f = f.next;
        }
        //swapping the firstN which contains kth node from start
        //and secondN which contains kth node from the end
        int temp = firstN.val;
        firstN.val = secondN.val;
        secondN.val = temp;
        
        //returning the ll
        return head;
    }
}
