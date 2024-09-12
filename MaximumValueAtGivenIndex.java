public class MaximumValueAtGivenIndex {
    public static void main(String[] args) {

        System.out.println(maxValueAtGivenIndex(6 , 1 , 10));
    }

    public static int maxValueAtGivenIndex(int n , int index , int maxSum){

        long left = index;
        long right = n - index - 1;

        long s = 1;
        long e = maxSum;

        long ans = 0;

        while (s <= e) {
            long mid = s + (e - s) / 2;

            long sum = mid;
            long leftSum = 0;
            long rightSum = 0;
            long m = mid - 1;

            if (left <= m) {
                leftSum = m * (m + 1) / 2 - (m - left) * (m - left + 1) / 2;
            } else {
                leftSum = m * (m + 1) / 2 + (left - m);
            }

            if (right <= m) {
                rightSum = m * (m + 1) / 2 - (m - right) * (m - right + 1) / 2;
            } else {
                rightSum = m * (m + 1) / 2 + (right - m);
            }

            sum = sum + leftSum + rightSum;

            if (sum <= maxSum) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return (int) ans;

    }
}
