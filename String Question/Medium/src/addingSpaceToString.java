package Medium.src;

public class addingSpaceToString {
    public static void main(String[] args) {

        int[] arr= {1,5,7,9};
        String s = "icodeinpython";
        System.out.println(addSpace(s ,arr));

    }

    public static String addSpace(String s , int[] spaces){
        StringBuilder sb = new StringBuilder();

        int prevInd = 0;
        for (int space : spaces) {
            sb.append(s, prevInd, space);
            sb.append(" ");
            prevInd = space;
        }

        sb.append(s.substring(prevInd));

        return sb.toString();
    }
}
