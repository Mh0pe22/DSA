public class MaximumDifferenceByRemappingADigit {
    public static void main(String[] args) {
        int digit = 11891;
        System.out.println(minMaxDifference(digit));
    }

    public static int minMaxDifference(int num){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        boolean[] isContain = new boolean[10];
        String s = Integer.toString(num);

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            StringBuilder sbMax = new StringBuilder(s);
            StringBuilder sbMin = new StringBuilder(s);
            if(!isContain[digit]){
                isContain[digit] = true;
                for (int j = 0; j < s.length(); j++) {
                    if(sbMax.charAt(j) == (char)(digit + '0')){
                        sbMax.setCharAt(j , '9');
                        sbMin.setCharAt(j , '0');
                    }
                }
                max = Math.max(max , Integer.parseInt(sbMax.toString()));
                min  = Math.min(min , Integer.parseInt(sbMin.toString()));
            }
        }

        return max - min;
    }
}
