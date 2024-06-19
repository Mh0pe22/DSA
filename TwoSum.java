import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr= {12,83,104,129,140,184,199,300,306,312,321,325,341,344,349,356,370,405,423,444,446,465,471,491,500,506,508,530,539,543,569,591,606,607,612,614,623,627,645,662,670,685,689,726,731,737,744,747,764,773,778,787,802,805,811,819,829,841,879,905,918,918,929,955,997};
        int target = 789;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    public static int[] twoSum(int[] arr, int target){

        if(arr.length == 2){
            if(arr[0] + arr[1] == target){
                return new int[]{1,2};
            } else if (arr[0] == target) {
                return new int[]{1,1};
            }else {
                return new int[]{2,2};
            }
        }
        int s =0;
        int e = arr.length - 1;
        while (s <= e){
            int mid = s + (e-s) / 2;
            if(arr[s] + arr[mid] == target){
                return new int[]{s+1 , mid + 1};
            } else if ((arr[s] + arr[e]) == target) {
                return new int[]{s +1 , e + 1};
            } else if ((arr[mid] + arr[e]) == target) {
                return new int[]{mid + 1, e + 1};
            } else if ((arr[mid] + arr[e]) > target && (arr[s] + arr[e]) > target) {
                e = e  - 1;
            }else {
                s = s + 1;
            }
        }

        return new int[]{-1,-1};
    }
}
