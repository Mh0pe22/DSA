public class lowestCommonAncestorOfBinaryTree {
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

        TreeNode p = left1;
        TreeNode q = right1;
        TreeNode lca = lowestCommonAncestor(root , p , q);
        System.out.println(lca.val);

    }

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return null;
        }

        if(root == p || root == q){
            return root;
        }

        TreeNode leftN = lowestCommonAncestor(root.left , p , q);
        TreeNode rightN = lowestCommonAncestor(root.right , p , q);

        if(leftN != null && rightN != null){
            return root;
        }

        if(leftN != null){
            return leftN;
        }

        return rightN;
    }
}
