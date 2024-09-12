import java.util.Arrays;

public class MinimumAbsoluteSum {

    public static void main(String[] args) {
        int[] n1 = {1,28,21};
        int[] n2 = {9,21,20};
        System.out.println(absoluteDiff(n1,n2));
    }

    public static int absoluteDiff(int[] n1 , int[] n2){

        int MOD = 1_000_000_007;
        int n= n1.length;
        long totalDiff = 0;
        long maxGain = 0;

        for (int i = 0; i <n; i++) {
            totalDiff += Math.abs((n1[i] - n2[i]));
        }

        if(totalDiff == 0){
            return 0;
        }

        int[] sortN1 = n1.clone();
        Arrays.sort(sortN1);

        for (int i = 0; i < n; i++) {
            int orgDiff = Math.abs(n1[i] - n2[i]);

            int closeDiff = binaryDiff(sortN1 , n2[i]);
            int newDiff = Math.abs(closeDiff - n2[i]);

            long gain = orgDiff - newDiff;
            maxGain = Math.max(maxGain , gain);
        }

        long ans = totalDiff - maxGain;
        return (int)(ans % MOD);
    }

    private static int binaryDiff(int[] sortN1, int target) {

        int s = 0;
        int e = sortN1.length - 1;

        if(target <= sortN1[s]){
            return sortN1[s];
        }

        if(target >= sortN1[e]){
            return sortN1[e];
        }

        while (s < e){
            int mid = s + (e - s) / 2;
            if(sortN1[mid] == target){
                return sortN1[mid];
            }else if(sortN1[mid] > target){
                e = mid;
            }else {
                s = mid  + 1;
            }
        }

        if(Math.abs(sortN1[s] - target) < Math.abs(sortN1[s - 1] - target)){
            return sortN1[s];
        }else {
            return sortN1[s - 1];
        }
    }
}
