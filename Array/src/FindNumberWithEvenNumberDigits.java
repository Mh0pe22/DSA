public class FindNumberWithEvenNumberDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumber(nums));
    }

    public static int findNumber(int[] nums){

        int count = 0;
        for(int i : nums){
            if(((int)Math.log10(i) + 1) % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
