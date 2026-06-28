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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        List<Integer> l=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            if(temp.next==null){
                int t=l.size();
                if(l.isEmpty() || temp.val!=l.get(t-1)){
                    l.add(temp.val);
                }
            }
            else if(temp.val!=temp.next.val){
                l.add(temp.val);
            }
            temp=temp.next;
        }
        int t=l.size();
        temp=head;
        for(int i=0;i<t-1;i++){
            temp.val=l.get(i);
            temp=temp.next;
        }
        temp.val=l.get(t-1);
        temp.next=null;
        return head;
    }
}