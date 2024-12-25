import javax.swing.tree.TreeNode;
import java.util.*;

public class MinimumUmberOfOperationToSortBinaryTree {

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
    public static int minimumNumberOfOperation(TreeNode root){
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        int result = 0;

        while(!que.isEmpty()){
            int n = que.size();
            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                TreeNode temp = que.poll();
                arr.add(temp.val);

                if(temp.left != null){
                    que.add(temp.left);
                }

                if(temp.right != null){
                    que.add(temp.right);
                }
            }

            result += countMinSwapsToSort(arr);
        }

        return result;
    }

    public static int countMinSwapsToSort(List<Integer> arr){
        int swaps  = 0;
        List<Integer> sortedArr = new ArrayList<>(arr);
        Collections.sort(sortedArr);

        Map<Integer , Integer> mp = new HashMap<>();
        for(int i = 0; i < arr.size(); i++){
            mp.put(arr.get(i) , i);
        }

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).equals(sortedArr.get(i))){
                continue;
            }

            int currentIndex = mp.get(sortedArr.get(i));
            mp.put(arr.get(i) , currentIndex);
            mp.put(arr.get(currentIndex) , i);
            Collections.swap(arr , currentIndex , i);
            swaps++;
        }

        return swaps;
    }
}
