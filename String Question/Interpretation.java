public class Interpretation {
    public static void main(String[] args) {
        String s = "G()(al)";
        System.out.println(interpret(s));
    }

    public static String interpret(String command){
        char[] ch = command.toCharArray();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == 'G'){
                ans.append('G');
            }else if(ch[i] == '(' && ch[i + 1] == ')'){
                ans.append('o');
                i = i+1;
            } else if(ch[i] == '(' && ch[i + 1] == 'a'){
                ans.append('a');
                ans.append('l');
                i = i + 3;
            }
        }

        return ans.toString();
    }
}
