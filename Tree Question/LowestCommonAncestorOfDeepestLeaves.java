public class LowestCommonAncestorOfDeepestLeaves {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        TreeNode left1 = new TreeNode(5);
        TreeNode right1 = new TreeNode(1);

        root.left = left1;
        root.right = right1;

        TreeNode left2 = new TreeNode(6);
        TreeNode right2 = new TreeNode(2);

        left1.left = left2;
        left1.right = right2;

        TreeNode left3 = new TreeNode(5);
        TreeNode right3 = new TreeNode(1);

        right1.left = left3;
        right1.right = right3;

        TreeNode ans = lcaDeepestLeaves(root);
        System.out.println(ans.val);

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
    public static class  Pair{
        int depth ;
        TreeNode node ;
        Pair(int depth , TreeNode node) {
            this.node = node;
            this.depth = depth;
        }
    }

    public static Pair solve(TreeNode root){
        if(root == null){
            return new Pair(0 , null);
        }

        Pair l = solve(root.left);
        Pair r = solve(root.right);

        if(l.depth == r.depth){
            return new Pair(l.depth + 1, root);
        } else if (l.depth > r.depth) {
            return new Pair(l.depth + 1 , l.node);
        }else{
            return new Pair(r.depth , r.node);
        }
    }

    public static TreeNode lcaDeepestLeaves(TreeNode root){
            return solve(root).node;
    }
}
