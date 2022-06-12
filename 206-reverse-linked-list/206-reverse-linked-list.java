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
    public ListNode reverseList(ListNode head) {
        ListNode newHead=null;
        while(head!=null){
            //new ListNode "Next" points at what is storedat head.next of previous node
            ListNode next= head.next; //pointed next to immediate next of head
            head.next=newHead; //broke the next pointer of head & pnted it to dummy node  
            newHead=head; //moving dummy node to head
            head=next; //moving head to next
        }
        return newHead;
    }
}