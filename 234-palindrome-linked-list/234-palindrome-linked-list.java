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
        ListNode h = head;
        int size = 0;
        while (h != null) {
            size++;
            h = h.next;
        }
        int[] arr = new int[size];
        h = head;
        int i = 0;
        while (h != null) {
            arr[i] = h.val;
            i++;
            h = h.next;
        }
        int st = 0;
        int en = arr.length - 1;
        while (st < en) {
            if (arr[st] == arr[en]) {
                st++;
                en--;
            } else {
                return false;
            }
        }
        return true;
    }
}
