import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationPrec {
    public static void main(String[] args) {
        Person desr = null;

        try{
            FileInputStream fis = new FileInputStream("m.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            desr = (Person) ois.readObject();
            System.out.println("Person object deserialized successfully.");
            System.out.println(desr);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
