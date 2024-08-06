package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {3,2,4,5,1};
        mergeSortIndex(arr , 0 , arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr){

        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr , 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr , mid , arr.length));

        return mix(left , right);
    }

    private static int[] mix(int[] left, int[] right) {

        int[] ans = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){

            if(left[i] < right[j]){
                ans[k] = left[i];
                i++;
            }else{
                ans[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            ans[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length){
            ans[k] = right[j];
            j++;
            k++;
        }

        return ans;
    }

    static void mergeSortIndex(int[] arr , int s , int e){

        if(e -s  == 1){
            return ;
        }

        int mid = (s + e) / 2;

         mergeSortIndex(arr , 0, mid);
         mergeSortIndex(arr , mid , e);

        mergeInPlace(arr, s , mid , e);
    }

    private static void mergeInPlace(int[] arr , int s, int mid, int e) {

        int[] mix = new int[e - s];

        int i = s;
        int j = mid;
        int k = 0;

        while(i < mid && j < e){

            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix [l];
        }
    }
}
