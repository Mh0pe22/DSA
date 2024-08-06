public class Panagram {

    public static void main(String[] args) {

        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(pangram(s));
    }

    public static boolean pangram(String s){
        if(s.length() < 26){
            return false;
        }

        char[] a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        char[] ans = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            int j = 0;
            while(ans[j] != a[i]){
                j++;
                if(j > ans.length - 1){
                    return false;
                }
            }
        }

      return true;
    }
}
