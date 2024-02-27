package Q101_SymmetricTree;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right;}
}
public class Solution {
    public boolean isSymmetricHelper(TreeNode node1, TreeNode node2){
        if(node1 == null && node2==null) return true;
        if((node1==null && node2!=null)||(node1!=null && node2==null)) return false;
        if(node1.val != node2.val){
          return false;
        }
        return isSymmetricHelper(node1.left, node2.right) && isSymmetricHelper(node1.right, node2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        
        return isSymmetricHelper(root,root);
    }
}