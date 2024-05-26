import java.util.Comparator;

public class OrdenarPorPuntuacion implements Comparator<Opositor> {

    @Override
    public int compare(Opositor o1, Opositor o2) {
        return Double.compare(o1.ObtenerPuntuacion(), o2.ObtenerPuntuacion());
    }

}
