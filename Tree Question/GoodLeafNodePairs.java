import java.util.ArrayList;
import java.util.List;

public class GoodLeafNodePairs {
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

    public List<Integer> solve(TreeNode head , int distance , int[] goodLeafPairs){
        if(head == null){
            List<Integer> emptyList = new ArrayList<>();
            emptyList.add(0);
            return emptyList;
        }

        if(head.left == null && head.right == null){
            List<Integer> leftList = new ArrayList<>();
            leftList.add(1);
            return leftList;
        }

        List<Integer> leftDistance = solve(head.left , distance , goodLeafPairs);
        List<Integer> rightDistance = solve(head.right , distance , goodLeafPairs);

        for (int l : leftDistance){
            for(int r : rightDistance){
                if(l != 0 && r != 0 && l + r <= distance){
                    goodLeafPairs[0]++;
                }
            }
        }

        List<Integer> currentDistances = new ArrayList<>();
        for (int ld : leftDistance){
            if(ld != 0 && ld + 1 <= distance){
                currentDistances.add(ld + 1);
            }
        }

        for (int rd : rightDistance){
            if(rd != 0 && rd + 1 <= distance){
                currentDistances.add(rd + 1);
            }
        }

        return currentDistances;
    }

    public int countPairs(TreeNode head , int distance){
        int[] goodLeafPairs = new int[1];
        solve(head , distance , goodLeafPairs);

        return goodLeafPairs[0];
    }
}
