import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Opositor> opositores = new ArrayList<>();
        opositores.add(new OpositorA("Juan Pérez", 30, "12345678A", 5, 3, 8.5));
        opositores.add(new OpositorB("Maria García", 25, "23456789B", 4, 2, 7.0));
        opositores.add(new OpositorA("Ana López", 28, "34567890C", 6, 4, 9.0));
        opositores.add(new OpositorB("Carlos Ruiez", 35, "45678901D", 7, 1, 6.5));

        Collections.sort(opositores);
        System.out.println("*********** RESULTADO **********");
        for (Opositor listar_opositores : opositores) {
            listar_opositores.print();
        }
        System.out.println("*******************************");
        Collections.sort(opositores, new OrdenarPorPuntuacion());
        System.out.println();
        System.out.println("*********** RESULTADO **********");
        Collections.reverse(opositores);
        for (Opositor listar_opositores : opositores) {
            listar_opositores.print();
        }
        System.out.println("*******************************");
    }
}