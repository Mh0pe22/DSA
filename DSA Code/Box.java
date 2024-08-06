public class Box {
    double width;
    double height;
    double depth;    
}

class BoxDemo2{

    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width = 5;
        mybox1.height = 5;
        mybox1.depth = 5;

        mybox2.width = 6;
        mybox2.height = 6;
        mybox2.depth = 6;

        vol = mybox1.depth*mybox1.height*mybox1.width;
        System.out.println(vol);

        vol = mybox2.depth*mybox2.height*mybox2.width;
        System.out.println(vol);

    }
}
