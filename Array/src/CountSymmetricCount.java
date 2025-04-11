public class CountSymmetricCount {
    public static void main(String[] args) {
        int low = 1200;
        int high = 1230;

        System.out.println(countSymmetricCount(low , high));
    }

    public static int countSymmetricCount(int low , int high){
        int count = 0;
        for (int i = low; i <= high ; i++) {

            if(i >= 10 && i <= 99 && i % 11 == 0){
                count++;
            } else if (i >= 1000 && i <= 99999) {
                int first = i / 1000;
                int second = (i / 100) % 10;
                int third = (i / 10) % 10;
                int fourth = i % 10;

                if(first + second == third + fourth){
                    count++;
                }
            }
        }

        return count;
    }
}
