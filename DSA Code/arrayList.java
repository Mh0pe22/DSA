import java.util.ArrayList;

public class arrayList {
    
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<String>();

        names.add("Mohit");
        names.add("Hemanshu");
        names.add("Kemil");

        names.set(1, "Achyut");
        names.remove(2);
        names.clear();

        for(int i = 0; i< names.size(); i++){

            System.out.println(names.get(i));
        }
    }
}
