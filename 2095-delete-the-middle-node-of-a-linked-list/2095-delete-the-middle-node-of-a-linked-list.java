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
    public ListNode deleteMiddle(ListNode head) {
        ListNode h1=head;
        int sz=0;
        while(h1!=null){
            sz++;
            h1=h1.next;
        }
        if(sz==1){
            return null;
        }
        int mid=sz/2;
         h1=head;
        while(mid>1){
            mid--;
            h1=h1.next;
        }
        h1.next=h1.next.next;
        return head;
        
    }
}