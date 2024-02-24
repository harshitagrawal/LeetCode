package Q1302_DeepestLeavesSum;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right;}
}

public class Solution {
    int maxDepth = Integer.MIN_VALUE;
    int sum = 0;

    public int findMaxDepth(TreeNode root, int depth){
        if(root == null){
            maxDepth = Math.max(depth, maxDepth);
            return 0;
        }
        findMaxDepth(root.left, depth+1);
        findMaxDepth(root.right, depth+1);
        return 0;
    }

    public int deepestLeavesSumHelper(TreeNode root, int depth){
        if(root.left == null && root.right == null && depth == maxDepth){
            sum = sum + root.val;
            return 0;
        }
        if(root.left != null) deepestLeavesSumHelper(root.left, depth+1);
        if(root.right!=null) deepestLeavesSumHelper(root.right, depth+1);
        return 0;
    }
    public int deepestLeavesSum(TreeNode root) {
        findMaxDepth(root, 0);
        deepestLeavesSumHelper(root, 1);
        return sum;
    }
}