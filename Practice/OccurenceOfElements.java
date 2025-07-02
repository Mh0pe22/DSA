import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import  java.util.Map;

public class OccurenceOfElements {
    public static void main(String[] args) {
        String[] words = {"Docker", "Kubernetes", "AWS"};
        String statement = "Docker is a platform for managing Kubernetes services, AWS is scalable. Docker, cloud infrastructure; microservices with AWS; Kubernetes.";

        List<String> word = new ArrayList<>();
        Map<String, Integer> mp = new HashMap<>();

        for (String w : words) {
            mp.putIfAbsent(w, 0);
        }

        for (int i = 0; i < statement.length(); i++) {
            StringBuilder sb = new StringBuilder();
            while (i < statement.length() && (statement.charAt(i) != ' ' && statement.charAt(i) != ',' && statement.charAt(i) != '.' && statement.charAt(i) != ';')) {
                sb.append(statement.charAt(i));
                i++;
            }
            if (!sb.isEmpty())
                word.add(sb.toString());
        }

        for (int i = 0; i < word.size(); i++) {
            if (mp.containsKey(word.get(i))) {
                mp.put(word.get(i), mp.getOrDefault(word.get(i), 0) + 1);
            }
        }

        for (String w : words) {
            System.out.println(w + " : " + mp.get(w));
        }

    }

}
