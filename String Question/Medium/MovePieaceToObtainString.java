package Medium;

public class MovePieaceToObtainString {
    public static void main(String[] args) {

    }

    public static boolean cnaChange(String start , String target){

        int i = 0;
        int j = 0;

        while(i <start.length() || j < target.length()){

            while(i < start.length() && start.charAt(i) == '_'){
                i++;
            }

            while(j < target.length() && target.charAt(j) == '_'){
                j++;
            }

            if(i == start.length() || j == target.length()){
                return i == start.length() && j == target.length();
            }

            if(start.charAt(i) != target.charAt(j)){
                return false;
            }

            if(start.charAt(i) == 'L' && i < j){
                return false;
            }

            if(start.charAt(i) == 'R' && i > j){
                return false;
            }

            i++;
            j++;
        }

        return true;
    }
}
