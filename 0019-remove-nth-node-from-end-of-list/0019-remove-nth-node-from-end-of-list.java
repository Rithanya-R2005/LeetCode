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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        else if(head.next==null && n==1){
            return null;
        }
        else if(head.next.next==null && n==1){
            head.next=null;
            return head;
        }
        else if(head.next.next==null && n==2){
            head=head.next;
            return head;
        }
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len==n){
            return head.next;
        }
        int count=len-n,c=1;
        temp=head;
        while(temp!=null){
            if(c==count){
                temp.next=temp.next.next;
                break;
            }
            c++;
            temp=temp.next;
        }
        return head;
        
    }
}