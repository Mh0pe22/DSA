package Medium.src;

public class MaximumNumberOfRemovableCharacters {
    public static void main(String[] args) {
        String s = "abcacb";
        String p= "ab";
        int[] removable = {3, 1, 0};
        System.out.println(maximumRemovals(s , p , removable));
    }

    public static int maximumRemovals(String s , String p , int[] removable){
        int start  = 0;
        int end  = removable.length;
        int result = 0;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(isSubSeq(s , p , removable , mid)){
                result = mid;
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        return result;
    }

    public static boolean isSubSeq(String s , String p , int[] removable , int mid){
        int i1 = 0 , i2 = 0;

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < mid; i++) {
            if (removable[i] < s.length()) {
                sb.setCharAt(removable[i], '?');
            }
        }

        s = sb.toString();

        while (i1 < s.length() && i2 < p.length()){
           if(s.charAt(i1) == p.charAt(i2)){
               i2++;
           }
           i1++;
        }

        return i2 == p.length();
    }
}
