public class room {
    
    public static void main(String[] args) {
        
        room.Inroom first = new room().new Inroom();

        System.out.println(first.bed);
        first.people();
    }

    public class Inroom{

        int bed = 3;
        int table = 3;

        void people(){

            System.out.println("There are three people in the room");
        }

        void reletion(){

            System.out.println("All three are close to each other");
        }
    }
    
}

