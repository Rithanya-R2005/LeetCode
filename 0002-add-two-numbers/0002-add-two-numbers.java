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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list=new ArrayList<>();
        ListNode t1=l1,t2=l2;
        int sum=0,n,rem=0;
        while(t1!=null && t2!=null){
            sum=sum+t1.val+t2.val;
            if(sum<=9){
                list.add(sum);
                sum=0;
            }
            else{
                n=sum;
                list.add(sum%10);
                while(n>0){
                    rem=n%10;
                    n=n/10;
                }
                sum=rem;
            }
            t1=t1.next;
            t2=t2.next;
        }
        while(t1!=null){
            sum=t1.val+sum;
            if(sum<=9){
                list.add(sum);
                sum=0;
            }
            else{
                n=sum;
                list.add(sum%10);
                while(n>0){
                    rem=n%10;
                    n=n/10;
                }
                sum=rem;
            }
            t1=t1.next;
        }
        while(t2!=null){
            sum=t2.val+sum;
            if(sum<=9){
                list.add(sum);
                sum=0;
            }
            else{
                n=sum;
                list.add(sum%10);
                while(n>0){
                    rem=n%10;
                    n=n/10;
                }
                sum=rem;
            }
            t2=t2.next;
        }
        if(sum!=0){
            list.add(sum);
        }
        ListNode head=new ListNode(list.get(0));
        ListNode temp=head;
        for(int i=1;i<list.size();i++){
            temp.next=new ListNode(list.get(i));
            temp=temp.next;
        }
        return head;
    }
}