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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode n = head;
        
        while(n.next != null){
            int common_div = gcd(n.val, n.next.val);
            
            ListNode newNode = new ListNode(common_div, n.next);
            n.next = newNode;
            n = newNode.next;
        }
        return head;
        
    }
    
    public int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
}