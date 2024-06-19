import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfArray {
    public static void main(String[] args) {

        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(arr1,arr2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2){

        boolean[] set=new boolean[1001];
        List<Integer> list=new ArrayList<>();
        for(int i:nums1) set[i]=true;
        for(int i:nums2){
            if(set[i]){
                list.add(i);
                set[i]=false;
            }
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
