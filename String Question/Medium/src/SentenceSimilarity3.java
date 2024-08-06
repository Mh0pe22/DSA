package Medium.src;

public class SentenceSimilarity3 {
    public static void main(String[] args) {
        String s1 =  "Eating right now";
        String s2 = "Eating";
        System.out.println(areSentencesSimilar(s1 , s2));
    }

    public static boolean areSentencesSimilar(String sentence1, String sentence2){

        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        
        int i = 0, j = 0;
        int len1 = s1.length, len2 = s2.length;

        while (i < len1 && i < len2 && s1[i].equals(s2[i])) {
            i++;
        }

        while (j < len1 - i && j < len2 - i && s1[len1 - 1 - j].equals(s2[len2 - 1 - j])) {
            j++;
        }

        return i + j == len1 || i + j == len2;
    }
}
