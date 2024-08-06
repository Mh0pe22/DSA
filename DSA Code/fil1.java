// import java.io.File;
import java.io.FileWriter;

public class fil1 {
    
    public static void main(String[] args) {
        
        // File file = new File("poem.txt");
        try{
            FileWriter write = new FileWriter("poem.txt");
            write.write("My name is Monkey.D.Luffy \nOne day i am gone become the king of pirates\n");
            write.append("By Oda");
            write.close();
        }
         catch (Exception e) {
    
            e.printStackTrace();
        }
    }
}
