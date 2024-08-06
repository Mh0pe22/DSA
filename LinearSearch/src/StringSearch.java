public class StringSearch {

    public static void main(String[] args) {
        String name = "mohit";
        char target = 'h';
        System.out.println(Search(name, target));

    }

    static int Search(String name , char target){
        if (name.isEmpty()) {
            return -1;
        }

        for (int index = 0; index < name.length(); index++) {

            if (target == name.charAt(index)) {
                    return index;
            }
        }
        return -1;
    }
}
