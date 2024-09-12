public class ShipWithDays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        System.out.println(shipWithDays(arr , days));
    }

    public static int shipWithDays(int [] arr ,int days){

        int s = 0;
        int e = 0;

        for(int i : arr){
            e += i;
            s = Math.max(s ,i);
        }

        while (s < e){
            int mid = s + (e - s) / 2;
            int minShip = 1;
            int currentLoad = 0;

            for (int i : arr) {
                if (currentLoad + i > mid) {
                    minShip++;
                    currentLoad = 0;
                }
                currentLoad += i;
            }

            if (minShip <= days) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }

        return s;
    }
}
