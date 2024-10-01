public class StringGame2 {
    public static void main(String[] args) {
        int[] operation = {0,1,1,0,1,0,0,1,0,0,0,1,1,0,1,0,0,1,1,0,0,0,0,1,0};
        int k = 4685106;
        System.out.println(findKthChar(k , operation));
    }

    public static char findKthChar(int n , int[] operation){
        StringBuilder a = new StringBuilder();
        a.append("a");

        for (int i = 0; i < operation.length; i++) {
            StringBuilder ans = new StringBuilder();
            ans = a;
            if(operation[i] == 0){
                ans.append(a);
            }else {
                for (char c : a.toString().toCharArray()) {
                    int val = c - 'a' + 1;
                    if (val == 26) {
                        ans.append('a');
                    } else {
                        ans.append((char) (c + 1));
                    }
                }
            }
            a = ans;
        }
        return a.charAt(n - 1);
    }
}
