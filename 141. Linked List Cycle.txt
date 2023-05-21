/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode cur = head;
        ArrayList<ListNode> track = new ArrayList<ListNode>();
        if(cur == null){
            return false;
        }
        while(cur.next != null){
            if(track.contains(cur)){
                return true;
            }
            track.add(cur);
            cur = cur.next;
        }
        return false;
    }
}