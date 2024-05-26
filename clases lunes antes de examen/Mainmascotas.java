import java.util.ArrayList;
import java.util.Collections;

public class Mainmascotas {
    public static void main(String[] args) {
        ArrayList<Seresvivos> algo = new ArrayList<>();
        algo.add(new Perros("Hades", 5, "Perro", 3495823));
        algo.add(new Personas("Paco", 23, "Humano"));
        algo.add(new Perros("Manolo", 9, "Perro", 3224));

        System.out.println();
        Collections.sort(algo);
        Collections.reverse(algo);
        System.out.println(algo.toString());

    }
}
