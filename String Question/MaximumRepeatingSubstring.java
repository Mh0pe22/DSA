public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
        String sequence = "ababc";
        String word ="ac";
        System.out.println(maximumRepeatingSubstring(sequence , word));
    }

    public static int maximumRepeatingSubstring(String sequence, String word){

//        int count= 0;
//        for (int i = 0; i < sequence.length() - word.length(); i++) {
//            String sub = sequence.substring(i , word.length() + 1);
//            if(sub.equals(word)){
//                count++;
//            }
//        }
//        return count;

        int count = 0;
        StringBuilder repeatedWord = new StringBuilder(word);

        // Continue appending 'word' until it's no longer a substring of 'sequence'
        while (sequence.contains(repeatedWord.toString())) {
            count++;
            repeatedWord.append(word);
        }

        return count;
    }
}
