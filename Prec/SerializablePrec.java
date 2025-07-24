import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializablePrec {
    public static void main(String[] args) {
        Person person = new Person("mohit", 21, "hope22");

        try {
            FileOutputStream fio = new FileOutputStream("m.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fio);
            oos.writeObject(person);
            oos.close();
            System.out.println("Serialization of person is completed");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
