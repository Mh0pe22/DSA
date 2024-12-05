public class CheckIfWordIsPrefixInSentence {
    public static void main(String[] args) {
        String s= "My name is mohit";
        String search = "mohit";
        System.out.println(isPrefixOfWord(s , search));
    }

    public static int isPrefixOfWord(String sentence, String searchWord){
        String[] word = sentence.split(" ");

        for (int i = 0; i < word.length; i++) {
            if(word[i].length() < searchWord.length()){
                continue;
            }

            String temp = word[i].substring(0 , searchWord.length());
            if(searchWord.equals(temp)){
                return i + 1;
            }
        }

        return -1;
    }
}
