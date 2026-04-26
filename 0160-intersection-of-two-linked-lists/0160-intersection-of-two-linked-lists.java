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
        ListNode temp=headA;
        ListNode curr=headB;
        while(temp!=null){
            curr=headB;
            while(curr!=null){
                if(curr.val==temp.val && curr==temp){ //Check the address aldo
                    return curr;
                }
                curr=curr.next;
            }
            temp=temp.next;
        }
        return null;
    }
}