package Q1038_BST_to_GST;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right;}
}

public class Solution {
    int prevSum = 0;

    public TreeNode bstToGstHelper(TreeNode root){
        if(root.left == null && root.right==null){
            root.val = prevSum + root.val;
            prevSum = root.val;
            return root;
        }
        if(root.right!=null) bstToGstHelper(root.right);
        root.val = prevSum + root.val;
        prevSum = root.val;
        if(root.left!=null) bstToGstHelper(root.left);
        return root;
    }
    public TreeNode bstToGst(TreeNode root) {
        bstToGstHelper(root);
        return root;

    }
}