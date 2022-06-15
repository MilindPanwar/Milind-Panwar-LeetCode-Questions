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
        if(head==null || head.next==null){
            return head;
        }
        ListNode len=head;
        int size=0;
        
        //calculating size to do k modulo size
        //to avoid multiple iterations which are of no use
        while(len!=null){
            size++;
            len=len.next;
        }
        for(int i=0;i<k%size;i++){
            ListNode temp=head;
            //placing temp and 2nd last Node
            while(temp.next.next!=null) temp=temp.next;
            
            //placing end on the Last Node
            ListNode end=temp.next;
            temp.next=null; //2nd last node points to null now
            end.next=head; //the last node point to head now
            head=end; //head points to new head whose name is end
        }
        return head;
    }
}