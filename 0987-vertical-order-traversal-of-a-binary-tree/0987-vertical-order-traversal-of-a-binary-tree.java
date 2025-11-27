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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,List<Integer>>> map=new TreeMap<>();
        Queue<Object[]> q=new LinkedList<>();
        //Queue is an interface so use LL to implement it as we can't directly create object
        //Object[] can store data of any type and to return that value, it has to be typecasted
        q.offer(new Object[]{root,0,0}); //offer()-insert elements in queue
        while(!q.isEmpty()){
            Object[] curr = q.poll();
            TreeNode node = (TreeNode)curr[0];
            int row=(int)curr[1];
            int col=(int)curr[2];
            map.putIfAbsent(col,new TreeMap<>()); //To create only if column value is empty
            map.get(col).putIfAbsent(row,new ArrayList<>());
            map.get(col).get(row).add(node.val);
            if(node.left!=null) //check left part
            {
                q.offer(new Object[]{node.left,row+1,col-1});
            }
            if(node.right!=null) //check right part
            {
                q.offer(new Object[]{node.right,row+1,col+1});
            }
        }
        List<List<Integer>> res=new ArrayList<>();
        for(TreeMap<Integer,List<Integer>> m : map.values()){
            List<Integer> list=new ArrayList<>();
            for(List<Integer> vals : m.values()){
                Collections.sort(vals);  //Sorting all the values of a column
                list.addAll(vals); //Add all data in vals
            }
            res.add(list);
        }
        return res;
    }
}