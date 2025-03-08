public class MinimumRecolorToGetKConsecutiveBlackBlocks {
    public static void main(String[] args) {
        String s = "BBWWBBWW";
        int k =3;
        System.out.println(minimumRecolors(s , k));
    }

    public static int minimumRecolors(String blocks , int k){
        int count = Integer.MAX_VALUE;

        for (int i = 0; i <= blocks.length() - k; i++) {
            int curr = 0;
            for (int j = i; j < i + k ; j++) {
                if(blocks.charAt(j) == 'W'){
                    curr++;
                }
            }
            count = Math.min(count , curr);
            if(count == 0){
                return count;
            }
        }
        return count;
    }
}
