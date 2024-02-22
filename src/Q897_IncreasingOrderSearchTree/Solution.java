package Q897_IncreasingOrderSearchTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right;}
}

public class Solution {
    TreeNode newTree = new TreeNode();
    TreeNode head = newTree;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null) return root;
        increasingBST(root.left);
        newTree.right = new TreeNode();
        newTree = newTree.right;
        newTree.val = root.val;      
        newTree.left = null;        
        increasingBST(root.right);
        return head.right;
    }
}

