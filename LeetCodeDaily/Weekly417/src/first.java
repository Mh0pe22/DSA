public class first {
    public static void main(String[] args) {
        int n= 10;
        System.out.println(findKthChar(n));
    }

    public static char findKthChar(int n){
        StringBuilder a = new StringBuilder();
        a.append("a");

        while(a.length() < n){
            StringBuilder ans = new StringBuilder();
            ans = a;
            for (char c : a.toString().toCharArray()){
                int val = c - 'a' + 1;
                if(val == 26){
                    ans.append('a');
                }else {
                    ans.append((char) (c + 1));
                }
            }
            a = ans;
        }

        return a.charAt(n - 1);
    }
}
