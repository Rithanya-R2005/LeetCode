/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public void preorder(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append("null,");
            return;
        }
        sb.append(Integer.toString(root.val));
        sb.append(",");
        preorder(root.left,sb);
        preorder(root.right,sb);
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        preorder(root,sb);
        System.out.println(sb);
        return sb.toString();
    }

    public TreeNode HD(List<String> list){
        if(list.get(0).equals("null")){
            list.remove(0);
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(list.get(0)));
        list.remove(0);
        root.left=HD(list);
        root.right=HD(list);
        return root;
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr=data.split(",");
        List<String> list=new LinkedList<>(Arrays.asList(arr));
        //Why we are storing in linkedlist means it is easy to access like they have the functions such as remove(),get(),... 
        return HD(list);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));