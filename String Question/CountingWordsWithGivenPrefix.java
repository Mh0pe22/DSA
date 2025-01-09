public class CountingWordsWithGivenPrefix {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String prefix = "at";
        System.out.println(prefixCount(words , prefix));
    }

    public static int prefixCount(String[] words , String prefix){
        int count = 0;
        for (String word : words) {
            if (word.startsWith(prefix)) {
                count++;
            }
        }

        return count;
    }
}
