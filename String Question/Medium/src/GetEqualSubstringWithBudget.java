package Medium.src;

public class GetEqualSubstringWithBudget {
    public static void main(String[] args) {
            String s = "abcd";
            String t = "bcdf";
            int maxCost = 3;
        System.out.println(equalSubstring(s , t, maxCost));
    }

    public static int equalSubstring(String s, String t, int maxCost){
        int left = 0;
        int maxLen = 0;
        int totalCost = 0;

        for (int right = 0; right < s.length(); right++) {
            totalCost += Math.abs(s.charAt(right) - t.charAt(right));

            while (totalCost > maxCost){
                totalCost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            maxLen = Math.max(maxLen , right - left + 1);
        }

        return maxLen;
    }
}
