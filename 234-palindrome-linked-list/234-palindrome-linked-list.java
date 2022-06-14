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
        ListNode slow = head;
        ListNode fast = head;
        
        //Part One : Find Middle
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //Part Two : Reverse right half
        slow.next= rLL(slow.next);
        
        //Part Three : Move slow to rigth half
        slow=slow.next;
        
        //Part Four : comparing the values
        while (slow!=null) {
            if (head.val != slow.val) {
                return false;
            }
            slow = slow.next;
            head = head.next;
        }
        return true;
    }
    
    //Additional Part : Reverse the LL
    ListNode rLL(ListNode head){
        ListNode temp=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=temp;
            temp=head;
            head=next;
        }
        //Returning the as temp stores the starting index or the head of right half
        return temp;
    }
   
}
