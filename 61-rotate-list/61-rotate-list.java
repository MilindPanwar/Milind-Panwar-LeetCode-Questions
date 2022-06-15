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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        
        //calculating the size of the LL
        int size=1;
        ListNode temp=head;
        while(temp.next!=null){
            size++;
            temp=temp.next;
        }
        //doing k modulo size to avoid multiple useless iterations
        k=k%size;
        int nk=size-k; //value of kth node from the back
        temp.next=head; //assigning it to head for new iteration
        while(nk>0){
            temp=temp.next;
            nk--;
        }
        head=temp.next; //moving head to node which is right after kth node
        temp.next=null; //breaking the node by assigning the kth node null
        return head; 
    }
}