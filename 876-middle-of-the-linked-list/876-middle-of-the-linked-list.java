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
        int size=0;
        ListNode dummy= head;
        while(dummy!=null){
            size++;
            dummy=dummy.next;
        }
        int iter=size/2;
        ListNode dm=head;
        int i=0;
        while( i<iter){
            dm=dm.next;
            i++;
        }
        return dm;
        
    }
}