// import java.io.FileNotFoundException;
import java.io.FileReader;

public class fileRead {
 
    public static void main(String[] args) {
        
        try {
            FileReader reader = new FileReader("luffy.txt");
            int data = reader.read();

            while (data != -1) {
                
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();

        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
