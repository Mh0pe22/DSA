package Medium.src;

public class RepeatedStringMatch {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdabcdab";
        System.out.println(repeatedStringMatch(a, b));
    }

    public static int repeatedStringMatch(String a, String b) {

        if(a.equals(b)){
            return 1;
        }
        StringBuilder temp = new StringBuilder(a);
        int count = 1;

        while (temp.length() < b.length()) {
            temp.append(a);
            count++;
        }

        if (temp.toString().contains(b)) {
            return count;
        }

        temp.append(a);
        if (temp.toString().contains(b)) {
            return count + 1;
        }

        return -1;
    }
}
