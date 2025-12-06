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
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode head1=new ListNode();
        ListNode temp1=head1;
        while(temp!=null){
            ListNode current=new ListNode(temp.val);
            current.next=temp1;
            temp1=current;
            head1=current;
            temp=temp.next;
        }
        temp1=head1;
        while(temp1.next!=null){
            temp1=temp1.next;
            if(temp1.next.next==null){
                temp1.next=null;
            }
        }
        return head1;
    }
}