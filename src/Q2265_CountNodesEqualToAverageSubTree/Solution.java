package Q2265_CountNodesEqualToAverageSubTree;
import javafx.util.Pair;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right;}
}

@SuppressWarnings("unchecked")
public class Solution {
    int result = 0;

    @SuppressWarnings("rawtypes")
    public Pair<Integer, Integer> averageHelper(TreeNode root){
       if( root == null ){
           return new Pair(0,0);
       } 
       Pair<Integer, Integer> left = averageHelper(root.left);
       Pair<Integer, Integer> right = averageHelper(root.right);

        int sumOfNodes = left.getKey() + right.getKey() + root.val;
        int countOfNodes = left.getValue() + right.getValue() + 1;

        if(root.val == sumOfNodes/countOfNodes){
            result++;
        }

        return new Pair(sumOfNodes, countOfNodes);
    }



    public int averageOfSubtree(TreeNode root) {
        averageHelper(root);
        return result;
    }
}