import java.nio.MappedByteBuffer;
import java.util.HashMap;

public class ConstructBinaryTreeFromPreOrderAndPostOrder {
    public  void main(String[] args) {
        int[] preOrder = {1,2,4,5,3,6,7};
        int[] postOrder = {4,5,2,6,7,3,1};

        TreeNode root = constructFromPrePost(preOrder , postOrder);
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

    public  TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n = preorder.length;
        HashMap<Integer ,Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(postorder[i] , i);
        }

        return solve(0 , 0 , n - 1, preorder , postorder , mp);
    }

    public  TreeNode solve(int preStart , int postStart , int preEnd , int[] preorder , int[] postorder , HashMap<Integer , Integer> mp){
        if(preStart > preEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        if(preStart == preEnd){
            return root;
        }

        int nextNode = preorder[preStart + 1];
        int j = mp.get(nextNode);

        int num = j - postStart + 1;

        root.left = solve(preStart + 1 , postStart , preEnd + num , preorder , postorder , mp);
        root.right = solve(preStart + num + 1 , j + 1 , preEnd , preorder , postorder , mp);

        return root;

    }
}
