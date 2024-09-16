import java.util.ArrayList;
import java.util.List;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int a = 2;

        List<Integer> ans = stableMountains(arr , a);
        for(Integer i : ans){
            System.out.println(i);
        }
    }

    public static List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i < height.length; i++) {
            if(height[i - 1] > threshold){
                ans.add(i - 1);
            }
        }

        return ans;
    }
}
