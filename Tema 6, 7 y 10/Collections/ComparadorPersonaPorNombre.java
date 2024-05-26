package Collections;

import java.util.Comparator;

public class ComparadorPersonaPorNombre implements Comparator<Persona> {
    @Override
    public int compare(Persona persona1, Persona persona2) {
        return persona1.getNombre().compareTo(persona2.getNombre());
    }
}
