/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode curr=node; 
        curr.val=curr.next.val; //copying the value of node to curr
        curr.next=curr.next.next; //linking curr to the curr.next's of next
        
    }
}