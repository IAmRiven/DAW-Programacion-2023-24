package Collections;

import java.util.Comparator;

public class ComparadorPersonaPorAltura implements Comparator<Persona> {

    @Override
    public int compare(Persona persona1, Persona persona2) {
        return persona1.getAltura() - persona2.getAltura();
    }

}
