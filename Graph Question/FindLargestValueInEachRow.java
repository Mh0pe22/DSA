import javax.swing.tree.TreeNode;
import java.util.*;

public class FindLargestValueInEachRow {
    public static void main(String[] args) {

    }

    public class TreeNode {
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
    public static List<Integer> largeValues(TreeNode root){

        List<Integer> ans  =new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();

        if(root == null){
            return ans;
        }

        que.add(root);

        while(!que.isEmpty()){
            int n = que.size();
            int maxVal = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                TreeNode temp = que.poll();
                maxVal = Math.max(temp.val , maxVal);

                if(temp.left != null){
                    que.add(temp.left);
                }

                if(temp.right != null){
                    que.add(temp.right);
                }
            }

            ans.add(maxVal);
        }

        return ans;
    }

}
