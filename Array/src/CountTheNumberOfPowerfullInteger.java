public class CountTheNumberOfPowerfullInteger {
    public static void main(String[] args) {
        long start = 1;
        long end = 6000;
        int limit = 4;
        String prefix = "23";
        System.out.println(numberOfPowerfulInt(start , end , limit , prefix));
    }

    public static long numberOfPowerfulInt(long start , long finish , int limit , String s){
        String startStr = String.valueOf(start - 1);
        String finishStr = String.valueOf(finish);

        return solve(finishStr , s , limit) - solve(startStr , s, limit);
    }

    public static long solve(String str , String suffix , int limit){
        if(str.length() < suffix.length()){
            return 0;
        }

        long count = 0;
        String trailing = str.substring(str.length() - suffix.length());
        int prefixLength = str.length() - suffix.length();

        for (int i = 0; i < prefixLength; i++) {
            int digit = str.charAt(i) - '0';

            if(digit <= limit){
                count += (long) (digit * Math.pow(limit + 1 , prefixLength - i - 1));
            }else {
                count += (long) Math.pow(limit + 1 , prefixLength - i);
                return count;
            }
        }

        if(trailing.compareTo(suffix) >= 0){
            count++;
        }
        return count;
    }
}
