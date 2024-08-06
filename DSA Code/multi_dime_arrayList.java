import java.util.ArrayList;

public class multi_dime_arrayList {
    
    public static void main(String[] args) {
        
        ArrayList<ArrayList<String>> Universe = new ArrayList<ArrayList<String>>();

        ArrayList<String> planet = new ArrayList<String>();
        planet.add("Earth");
        planet.add("Mars");
        planet.add("Venus");
        planet.add("Jupiter");

        ArrayList<String> star = new ArrayList<String>();
        star.add("Sun");
        star.add("Dhruv");

        ArrayList<String> galaxy = new ArrayList<String>();
        galaxy.add("Milkway");

        Universe.add(planet);
        Universe.add(star);
        Universe.add(galaxy);

        System.out.println(Universe);
        System.out.println(Universe.get(0).get(1));
    }
}
