public class IsStringEqual {
    public static void main(String[] args) {
        String[] arr1 =  {"ab", "c"};
        String[] arr2 = {"a", "bc"};
        System.out.println(isStringEqual(arr1, arr2));

        String m = "MOhit";
        System.out.println(m.toLowerCase());
    }

    public static boolean isStringEqual(String[] word1, String[] word2){
        String first = String.join("",word1);
        String second = String.join("",word2);

        return first.equals(second);
    }
}
