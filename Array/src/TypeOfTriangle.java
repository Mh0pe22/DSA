public class TypeOfTriangle {
    public static void main(String[] args) {
        int[] nums = {3 , 4, 5};
        System.out.println(triangleType(nums));
    }

    public static String triangleType(int[] nums) {
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        }

        int side01 = nums[0] + nums[1];
        int side12 = nums[1] + nums[2];
        int side02 = nums[0] + nums[2];

        if ((side01 > nums[2] && side02 > nums[1] && side12 > nums[0]) && (nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2])) {
            return "isosceles";
        }



        if (side01 > nums[2] && side02 > nums[1] && side12 > nums[0]) {
            return "scalene";
        }

        return "none";
    }
}
