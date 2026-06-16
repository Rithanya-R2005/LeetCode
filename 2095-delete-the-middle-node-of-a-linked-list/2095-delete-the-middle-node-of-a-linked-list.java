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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null){
            return head;
        }
        else if(head.next==null){
            head=null;
            return head;
        }
        int n=-1;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        if(n%2!=0){
            n=n/2;
            n+=1;
        }
        else{
            n=n/2;
        }
        int i=0;
        temp=head;
        while(temp!=null){
            if((i+1)==n){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
            i++;
        }
        return head;
    }
}