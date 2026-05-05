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
    public ListNode swapPairs(ListNode head) {
        ListNode p=new ListNode(0);
        ListNode temp=head,curr=head,join,join2=p;
        if(head==null || head.next==null){
            return head;
        }
        head=head.next;
        while(temp!=null && temp.next!=null ){
            curr=temp.next;
            temp.next=temp.next.next;
            curr.next=temp;
            join=temp; //join helps to connect 2nd & 3rd node
            join2.next=curr;
            temp=temp.next;
            if(temp!=null && temp.next!=null){
                curr=temp.next;
                temp.next=temp.next.next;
                curr.next=temp;
                join2=temp; //join 2 helps to connect 4th and 5th node
                temp=temp.next;
                join.next=curr;
            }
        }
        return head;
    }
}