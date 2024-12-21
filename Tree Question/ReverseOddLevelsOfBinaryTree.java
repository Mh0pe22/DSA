import com.sun.source.tree.Tree;

public class ReverseOddLevelsOfBinaryTree {
    public static void main(String[] args) {

    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public TreeNode reverseOddLevels(TreeNode root){

        solve(root.left , root.right , 1);
        return root;
    }

    public static void solve(TreeNode left , TreeNode right , int level){
        if(left == null){
            return;
        }

        if(right ==null){
            return;
        }

        if(level % 2 == 1){
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }

        solve(left.left , right.right , level + 1);
        solve(left.right , right.left , level + 1);
    }

}
