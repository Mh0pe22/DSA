public class MergeTwoStringAlternatively {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "pqrs";
        System.out.println(mergeTwoString(s1,s2));
    }

    public static String mergeTwoString(String word1 , String word2){
        StringBuilder merge = new StringBuilder();
        int i = 0;
        int j= 0;
        while(i < word1.length() && j < word2.length()){
            merge.append(word1.charAt(i));
            merge.append(word2.charAt(j));
            i++;
            j++;
        }

        if (i < word1.length()){
            merge.append(word1.substring(i));
        }

        if(j < word2.length()){
            merge.append(word2.substring(j));
        }

        return merge.toString();
    }
}
