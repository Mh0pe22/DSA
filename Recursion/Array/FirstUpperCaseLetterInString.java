package Array;

public class FirstUpperCaseLetterInString {

    public static void main(String[] args) {

        String a = "Maaa";
        UpperFirst(a);
    }

    static void UpperFirst (String up){

        if(up.isEmpty()){
            System.out.println();
        }

        if(Character.isUpperCase(up.charAt(0))){
            System.out.println(up.charAt(0));
        }else{
            UpperFirst(up.substring(1));
        }
    }
}
