package Medium;

public class CountAndSay {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countSay(n));
    }

    public static String countSay(int n){
        if(n == 1){
            return "1";
        }

        String say = countSay(n - 1);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < say.length(); i++) {
            char ch = say.charAt(i);
            int count = 1;

            while (i < say.length() - 1 && ch == say.charAt(i + 1)){
                count++;
                i++;
            }

            result.append(Integer.toString(count));
            result.append(Character.toString(ch));
        }

        return result.toString();
    }
}
