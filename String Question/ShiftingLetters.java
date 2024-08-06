public class ShiftingLetters {
    public static void main(String[] args) {
        String s = "mkgfzkkuxownxvfvxasy";
        int[] arr = {505870226,437526072,266740649,224336793,532917782,311122363,567754492,595798950,81520022,684110326,137742843,275267355,856903962,148291585,919054234,467541837,622939912,116899933,983296461,536563513};
        System.out.println(shiftingLetters(s, arr));
    }

    public static String shiftingLetters(String s, int[] shifts){

        for (int i = 0; i < shifts.length; i++) {
            shifts[i] = shifts[i] % 26;
        }

        int totalShifts = 0;
        for (int i : shifts) {
            totalShifts += i;
            totalShifts = totalShifts % 26;
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = (char) ('a' + (s.charAt(i) - 'a' + totalShifts) % 26);
            ans.append(ch);
            totalShifts -= shifts[i];
            totalShifts = (totalShifts + 26) % 26; // Ensure no negative shifts
        }

        return ans.toString();

    /*
        char[] ans = s.toCharArray();

        long sum = 0;

        for (int i = shifts.length - 1; i > - 1; i--) {
            sum += shifts[i];
           ans[i] = (char)(((ans[i] - 'a' + sum ) % 26) + 'a');
        }

        return String.valueOf(ans);
     */
    }

}
