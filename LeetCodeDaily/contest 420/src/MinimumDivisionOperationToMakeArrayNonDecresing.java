import java.util.Arrays;

public class MinimumDivisionOperationToMakeArrayNonDecresing {
    public static void main(String[] args) {

        int[] arr = {1,1,1,1,1};
        System.out.println(minOperation(arr));
    }

    static int MAX_NUM = 1000000;
    static int[] greatestDivisor;
    public static int minOperation(int[] nums){
        preprocessDivisors();
        int operations = 0;
        int n = nums.length;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                int count = 0;
                while (nums[i] > nums[i + 1]) {
                    int divisor = greatestDivisor[nums[i]];

                    if (divisor == 0) {
                        return -1;
                    }

                    nums[i] /= divisor;
                    count++;

                    if (nums[i] <= nums[i + 1]) {
                        break;
                    }
                }

                if (nums[i] > nums[i + 1]) {
                    return -1;
                }

                operations += count;
            }
        }

        return operations;
    }

    public static void preprocessDivisors() {
        greatestDivisor = new int[MAX_NUM + 1];
        for (int i = 2; i <= MAX_NUM; i++) {
            for (int j = i + i; j <= MAX_NUM; j += i) {
                greatestDivisor[j] = i;
            }
        }
    }

}
