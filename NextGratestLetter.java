public class NextGratestLetter {
    public static void main(String[] args) {

        char[] letters = {'e' , 'e' , 'g' , 'g'};
        char target = 'g';
        System.out.println(nextGreatestLetter(letters,target));
    }

    public static char nextGreatestLetter(char[] letters , char target){

        if(target == 'z'){
            return letters[0];
        }

        int s = 0;
        int e = letters.length - 1;
        char ans = 0;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(letters[mid] == target){
                if(mid == letters.length - 1 ){
                    return letters[0];
                } else if (letters[mid + 1] == target) {
                    s = mid + 1;
                }else {
                    return letters[mid + 1];
                }
            } else if (mid == letters.length - 1 && letters[mid] < target) {
                return letters[0];
            } else if (letters[mid] > target) {
                ans = letters[mid];
                e = mid - 1;
            }else {
                s = mid + 1;
            }
        }


        return ans;
    }
}
