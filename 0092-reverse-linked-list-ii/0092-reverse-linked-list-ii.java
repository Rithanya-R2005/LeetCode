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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null || left==right){
            return head;
        }
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        int count=1;
        while(temp!=null){
            if(count==left){
                while(count!=right){
                    list.add(temp.val);
                    temp=temp.next;
                    count++;
                }
                list.add(temp.val);
                break;
            }
            temp=temp.next;
            count++;
        }
        Collections.reverse(list);
        temp=head;
        int i=0;
        count=1;
        while(temp!=null){
            if(count==left){
                while(count!=right){
                    temp.val=list.get(i++);
                    temp=temp.next;
                    count++;
                }
                temp.val=list.get(i++);
                break;
            }
            temp=temp.next;
            count++;
        }
        return head;
    }
}