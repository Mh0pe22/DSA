public class AlternatingGroup2 {
    public static void main(String[] args) {
        int[] colors = { 0 , 1, 0 , 0, 1};
        int k  = 3;
        System.out.println(numberOfAlternatingGroups(colors , k));
    }

    public static int numberOfAlternatingGroups(int[] colors , int k){
        int n = colors.length;

        int count = 0;
        int length = 1;
        int prev = colors[0];
        for (int i = 1; i < n; i++) {
            if(prev == colors[i]){
                length = 1;
                prev = colors[i];
                continue;
            }

            length++;
            prev = colors[i];
            if(length >= k){
                count++;
            }
        }

        for (int i = 0; i < k - 1; i++) {
            if(prev == colors[i]){
                break;
            }

            length++;
            prev = colors[i];
            if(length >= k){
                count++;
            }
        }

        return count;
    }
}
