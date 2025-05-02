public class PushDominoes {
    public static void main(String[] args) {
        String dominoes = "RR.L";
        System.out.println(pushDominoes(dominoes));
    }

    public static String pushDominoes(String dominoes){

        int n = dominoes.length();
        int[] rightClosestL = new int[n];
        int[] leftClosestR = new int[n];

        for (int i = 0; i < n; i++) {
            if(dominoes.charAt(i) == 'R'){
                leftClosestR[i] = i;
            }else if (dominoes.charAt(i) == '.'){
                leftClosestR[i] = i > 0 ? leftClosestR[i - 1] : -1;
            }else {
                leftClosestR[i] = -1;
            }
        }

        for (int i = n - 1; i >= 0 ; i--) {
            if (dominoes.charAt(i) == 'L'){
                rightClosestL[i] = i;
            } else if (dominoes.charAt(i) == '.') {
                rightClosestL[i] = i < n - 1 ? rightClosestL[i + 1] : -1;
            }else {
                rightClosestL[i] = -1;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int distRightL = rightClosestL[i] == -1 ? Integer.MAX_VALUE : Math.abs(i - rightClosestL[i]);
            int distLeftR = leftClosestR[i] == -1 ? Integer.MAX_VALUE : Math.abs(i - leftClosestR[i]);
            
            if(leftClosestR[i] == rightClosestL[i]){
                ans.append('.');
            } else if (leftClosestR[i] == -1) {
                ans.append('L');
            } else if (rightClosestL[i] == -1) {
                ans.append('R');
            } else if (distLeftR == distRightL) {
                ans.append('.');
            }else {
                ans.append(distLeftR < distRightL ? 'R' : 'L');
            }
        }

        return ans.toString();
    }
}
