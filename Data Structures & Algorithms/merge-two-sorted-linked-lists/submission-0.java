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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode();
        ListNode newCurr = null;
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        
        while(curr1!=null && curr2!=null){
            if(curr1.val<curr2.val){
                if(newCurr==null){
                    newCurr = curr1;
                    newList= newCurr;
                }
                else{
                    newCurr.next= curr1;
                    newCurr = newCurr.next;
                }
                curr1 = curr1.next;
            }
            else{
                if(newCurr==null){
                    newCurr = curr2;
                    newList= newCurr;
                }
                else{
                    newCurr.next= curr2;
                    newCurr=newCurr.next;
                }
                curr2=curr2.next;
            }
        }

        if(curr1==null){
            if(newCurr==null)
                return curr2;
            newCurr.next=curr2;
        }
        if(curr2==null){
             if(newCurr==null)
                return curr1;
            newCurr.next=curr1;
        }
        
        return newList;
    }
}