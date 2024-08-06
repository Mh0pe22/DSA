public class ArrayObject {
    
    public static void main(String[] args) {
        
        ArrayObject.Food food1 = new ArrayObject().new Food("Pizza");
        ArrayObject.Food food2 = new ArrayObject().new Food("Ladu");
        ArrayObject.Food food3 = new ArrayObject().new Food("Dosa");

        ArrayObject.Food[] refrigFood = {food1, food2, food3};

        System.out.println(refrigFood[0].name);
        System.out.println(refrigFood[1].name);
        System.out.println(refrigFood[2].name);
    }

    public class Food {

        String name;

        Food(String name) {
            this.name = name;
        }
    }
}
