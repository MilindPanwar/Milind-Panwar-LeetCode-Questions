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
        ListNode l1 = headA;
        ListNode l2 = headB;
        //STEP ONE : calculate the size of both LL
        int size1 = 0;
        int size2 = 0;
        while (l1 != null) {
            l1 = l1.next;
            size1++;
        }

        while (l2 != null) {
            l2 = l2.next;
            size2++;
        }

        //STEP TWO : find the difference between them
        int diff = 0;
        ListNode temp1;
        ListNode temp2;
        if (size1 >= size2) {
            diff = size1 - size2;
            temp1 = headB;
            temp2 = headA;

            //STEP THREE : assign temp at difference
            for (int i = 0; i < diff; i++) {
                temp2 = temp2.next;
            }

            //STEP FOUR : traverse for both
            //compare both node if found return at that moment
            while (temp1 != null && temp2 != null) {
                if (temp1 == temp2) {
                    return temp2;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        } else if (size2 > size1) {
            diff = size2 - size1;
            temp1 = headA;
            temp2 = headB;
            //STEP THREE : assign temp at difference

            for (int i = 0; i < diff; i++) {
                temp2 = temp2.next;
            }

            //STEP FOUR : traverse for both
            //compare both node if found return at that moment
            while (temp1 != null && temp2 != null) {
                if (temp1 == temp2) {
                    return temp2;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        //if both reaches null automatically return null
        return null;
    }
}
