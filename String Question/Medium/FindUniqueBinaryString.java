package Medium;

public class FindUniqueBinaryString {
    public static void main(String[] args) {
        String[] nums = {"10" ,"01"};
        System.out.println(findDifferentBinaryString(nums));
    }

    public static String findDifferentBinaryString(String[] nums){
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            char ch = nums[i].charAt(i);
            ans.append(ch == '0' ? '1' : '0');
        }

        return ans.toString();
    }
}
