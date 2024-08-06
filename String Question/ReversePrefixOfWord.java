public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String s = "abcdefd";
        char ch = 'z';
        System.out.println(reversePrefix(s , ch));
    }

    public static String reversePrefix(String word , char ch){
        int index = -1;

        for (int j = 0; j < word.length(); j++) {
            if(word.charAt(j) == ch){
                index = j;
                break;
            }
        }

        if(index != -1 && index != 0){
            StringBuilder ans = new StringBuilder(word.substring(0 , index + 1));
            ans.reverse();
            ans.append(word.substring(index + 1 ));
            word = ans.toString();
        }
        return word;
    }
}
