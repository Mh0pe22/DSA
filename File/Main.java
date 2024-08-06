package File;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("Meassage.txt");
    // File file = new File("\"M:\\Java\\Mesaage.txt\"");

    if(file.exists()){
        System.out.println("The file exists O!");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.isFile());
        file.delete();
    }
    else{
        System.out.println("File not exists (!");
    }
    }
}
