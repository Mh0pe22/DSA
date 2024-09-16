public class ExcelSheetColumNumber {
    public static void main(String[] args) {

        String title = "ZY";
        System.out.println(titleNumber(title));
    }

    public static int titleNumber(String columnTitle){

        int sum = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            sum = sum * 26 + (columnTitle.charAt(i) - 'A' + 1);

        }

        return sum;
    }
}
