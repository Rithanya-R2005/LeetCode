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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return new int[]{-1,-1};
        }
        ListNode ptr=head,temp=head.next;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int cp_count=0;
        List<Integer> list=new ArrayList<>();
        list.add(-1);
        while(temp.next!=null){
            if(ptr.val<temp.val && temp.val>temp.next.val){
                cp_count++;
                list.add(1);
            }
            else if(ptr.val>temp.val && temp.val<temp.next.val){
                cp_count++;
                list.add(1);
            }
            else{
                list.add(-1);
            }
            ptr=ptr.next;
            temp=temp.next;
        }
        list.add(-1);
        int start=0,end=list.size()-1;
        while(start<end){
            while(list.get(start)==-1 && start<end){
                start++;
            }
            while(list.get(end)==-1 && start<end){
                end--;
            }
            int val=end-start;
            max=Math.max(max,val);
            min=Math.min(min,val);
            break;
        }
        int prev=0,found=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==1 && found==0){
                found=1;
                prev=i;
            }
            else if(list.get(i)==1){
                int val=i-prev;
                min=Math.min(min,val);
                prev=i;
            }
        }
        if(cp_count<2){
            return new int[]{-1,-1};
        }
        else{
            return new int[]{min,max};
        }
    }
}