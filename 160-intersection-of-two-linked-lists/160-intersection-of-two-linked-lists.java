/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        if(headA==null || headB==null){
            return null;
        }
        while (temp1 != temp2) { //stop if both node are same
            if (temp1 == null) { //if it reaches null
                temp1 = headB; //point it to other LL's head
            } else {
                temp1 = temp1.next; //else just increment
            }
            if (temp2 == null) {
                temp2 = headA;
            } else {
                temp2 = temp2.next;
            }
        }
        return temp1; //return any of the dummy node
    }
}
