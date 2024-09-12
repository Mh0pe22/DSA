public class MountainArrayAtMinimumIndex extends MountainArrayInterFace {
    public static void main(String[] args) {

    }

    public static int findInMountainArray(int target , MountainArrayInterFace mountainArray){
        int peak = mountainIndex(mountainArray);
        int left = binarySearchLeft(target , mountainArray , 0, peak);
        if(left != - 1){
            return left;
        }

        return binarySearchRight(target , mountainArray , peak + 1, mountainArray.length() - 1);
    }

    public static int mountainIndex(MountainArrayInterFace mountain){
        int s = 0;
        int e = mountain.length() - 1;
        while(s < e){
            int mid = s + (e - s) / 2;
            if(mountain.get(mid) > mountain.get(mid  + 1)){
                e = mid;
            }else {
                s = mid + 1;
            }
        }

        return s;
    }

    public static int binarySearchLeft(int target , MountainArrayInterFace mountain , int s , int e){
        while(s < e){
            int mid = s + (e - s) / 2;
            int val = mountain.get(mid);
            if(val == target){
                return mid;
            }

            if(val > target){
                e = mid - 1;
            }else {
                s = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearchRight(int target , MountainArrayInterFace mountain , int s , int e){
        while(s < e){
            int mid = s + (e - s) / 2;
            int val = mountain.get(mid);
            if(val == target){
                return mid;
            }

            if(val > target){
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }
        return -1;
    }

}
