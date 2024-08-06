public class ConvertdateIntoBinary {
    public static void main(String[] args) {
        String s ="2080-02-29";
        System.out.println(dateIntoBinary(s));
    }

    public static String dateIntoBinary(String s){
        String[] arr = s.split("-");
        int[] m = new int[arr.length];
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            int a = Integer.parseInt(arr[i]);
            String binary = Integer.toBinaryString(a);  // Convert to binary string
            ans.append(binary);

            if (i < arr.length - 1) {
                ans.append("-");
            }
        }

        return ans.toString();
    }
}
