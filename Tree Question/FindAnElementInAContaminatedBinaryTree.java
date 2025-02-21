import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FindAnElementInAContaminatedBinaryTree {
    private Stack<Integer> st;

    public static void main(String[] args) {
        // Properly initialize the tree
        TreeNode root = new TreeNode();
        root.left = new TreeNode();
        root.right = new TreeNode();

        root.left.left = new TreeNode();
        root.left.right = new TreeNode();
        root.right.left = new TreeNode();
        root.right.right = new TreeNode();
        FindAnElementInAContaminatedBinaryTree tree = new FindAnElementInAContaminatedBinaryTree(root);

        System.out.println(tree.find(1)); // Expected Output: true or false
    }

    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private void bfs(TreeNode root, int x) {
        if (root == null) return;

        Queue<TreeNode> que = new LinkedList<>();
        root.val = x;
        que.add(root);

        while (!que.isEmpty()) {
            TreeNode temp = que.poll();
            st.push(temp.val);

            if (temp.left != null) {
                temp.left.val = 2 * temp.val + 1;
                que.add(temp.left);
            }

            if (temp.right != null) {
                temp.right.val = 2 * temp.val + 2;
                que.add(temp.right);
            }
        }
    }

    public FindAnElementInAContaminatedBinaryTree(TreeNode root) {
        st = new Stack<>();
        bfs(root, 0);
    }

    public boolean find(int target) {
        return st.contains(target);
    }
}
