public class UniqueNumber {
    public static void main(String[] args) {

        int[] arr= {1,2,1,2,3};
        System.out.println(unique(arr));
    }

    static int unique(int[] arr){

        int uni = 0;
        for(int ans : arr){
            uni ^= ans;
        }
        return uni;
    }
}
