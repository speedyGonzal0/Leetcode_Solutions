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
        
        ListNode reversed = new ListNode(head.val, null);
        ListNode curNode = head;

        while (curNode.next != null) {
            ListNode temp = reversed;
            reversed = new ListNode(curNode.next.val);
            reversed.next = temp;
            curNode = curNode.next;
        }

        while (head != null && reversed != null) {
            if (head.val != reversed.val) {
                return false;
            }
            head = head.next;
            reversed = reversed.next;
        }

        return true;
    }
}