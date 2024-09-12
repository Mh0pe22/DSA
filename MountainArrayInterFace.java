public class MountainArrayInterFace {

    int[] arr = {1,2,3,4,5};
    protected int length() {

        return arr.length;
    }

    protected int get(int index) {
        return arr[index];
    }

    public interface MountainArray{
        public int get(int index);
        public int length();
    }
}
