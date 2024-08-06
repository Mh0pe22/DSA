public class ConvertToTitle {
    public static void main(String[] args) {
        int col = 28;
        System.out.println(convertToTitle(col));
    }

    public static String convertToTitle(int columnNumber){
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0){
            columnNumber--;
            int rem = columnNumber % 26;
            char ch = (char)(rem + 'A');
            result.append(ch);
            columnNumber /= 26;
        }
        result.reverse();
        return result.toString();
    }
}
