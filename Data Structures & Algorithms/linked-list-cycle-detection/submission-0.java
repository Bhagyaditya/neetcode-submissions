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
    public boolean hasCycle(ListNode head) {
        int index = -1;
        ListNode curr = head;
        while(curr!=null){
            if(curr.val == 9999){
                return true;
            }
            index++;
            curr.val = 9999; // Val to 9999 means the node is visited
            curr = curr.next;
        }
        return false;
    }
}
