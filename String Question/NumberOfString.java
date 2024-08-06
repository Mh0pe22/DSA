public class NumberOfString {
    public static void main(String[] args) {
        String[] arr = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStrings(arr , word));
    }

    public static int numOfStrings(String[] patterns, String word){
//        int count = 0;
//        for (int i = 0; i < patterns.length; i++) {
//
//            for (int j = 0; j < word.length(); j++) {
//                String subStringWord = word.substring(j , patterns[i].length());
//                if(subStringWord.equals(patterns[i])){
//                    count++;
//                    i += patterns[i].length() - 1;
//                }
//            }
//        }

        int count = 0;
        for (String i : patterns){
            if(word.contains(i)){
                count++;
            }
        }
        return count;
    }
}
