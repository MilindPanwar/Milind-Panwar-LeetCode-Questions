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
    
        ListNode tampu=head; //for determining the size of the LL
        int sizze=0;
        while(tampu!=null){
            tampu= tampu.next;
            sizze++;
        }
        ListNode temp = head;
        for (int i = 0; i <sizze/2 ; i++) { 
            //running loop till size/2
            temp = temp.next;
        }
        return temp;
    }
}
