package Q1469_FindAllTheLonelyNodes;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right;}
}

public class Solution {
    List<Integer> arr = new ArrayList<>();
    public List<Integer> getLonelyNodes(TreeNode root) {
      if(root.left == null && root.right!=null){
          arr.add(root.right.val);
      } else if(root.right == null && root.left!=null){
          arr.add(root.left.val);
      }
      if(root.left!=null)getLonelyNodes(root.left);
      if(root.right!=null)getLonelyNodes(root.right);
      return arr;
    }
}
