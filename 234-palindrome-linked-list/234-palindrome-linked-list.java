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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
       slow.next=rev(slow.next);
        slow=slow.next;
        ListNode dummy=head;
        while(slow!=null){
            if(slow.val!=dummy.val){
                return false;
            }
            slow=slow.next;
            dummy=dummy.next;
        }
        return true;
        
        
    }
    public ListNode rev(ListNode ptr){
        ListNode prev=null;
        ListNode next=null;
        while(ptr!=null){
            next=ptr.next;
            ptr.next=prev;
            prev=ptr;
            ptr=next;
        }
        return prev;
    }
}