import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MVeZero {
    public static void main(String[] args) {
        int[] nums = {10 ,11 , 12, 20 , 0 ,1 , 0 , 2, 3, 0 , 3, 4, 0 , 5, 0};
        System.out.println(Arrays.toString(moveZero(nums)));
    }

    public static int[] moveZero(int[] nums){

        int j =0;
        int[] ans = new int[nums.length];
        for (int num : nums) {
            if (num == 0) {
                continue;
            } else {
                ans[j] = num;
                j++;
            }
        }

        while (j < nums.length){
            ans[j] = 0;
            j++;
        }

        return ans;
    }
}
