/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    //HF -- Helper Function
    public void HF(TreeNode root,List<Integer> sum,int p){
        p=p*10+root.val;
        if(root.left==null && root.right==null){
            sum.add(p);
            return;
        }
        if(root.left==null && root.right!=null){
            HF(root.right,sum,p);
        }
        else if(root.right==null && root.left!=null){
            HF(root.left,sum,p);
        }
        else{
            HF(root.left,sum,p);
            HF(root.right,sum,p);
        }
    }
    public int sumNumbers(TreeNode root) {
        List<Integer> sum=new ArrayList<>();
        HF(root,sum,0);
        int ans=0;
        for(int a:sum){
            ans+=a;
        }
        return ans;
    }
}