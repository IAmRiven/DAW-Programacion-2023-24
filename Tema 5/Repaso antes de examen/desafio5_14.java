import java.util.ArrayList;
import java.util.Collections;

public class desafio5_14 {
    public static void main(String[] args) {
        ArrayList<Double> calificaciones = new ArrayList<>();
        boolean salir = true;
        double sumar_notas = 0;
        do {
            System.out.print("¿Qué nota quieres añadir? ");
            double nota = Teclado.teclado.nextDouble();
            if (nota <= -2) {
                System.out.println("No se pueden añadir notas negativas.");
            } else if (nota == -1) {
                System.out.println("Has terminado de añadir las notas");
                break;
            } else {
                System.out.println("Se ha añadido la nota a la lista.");
                calificaciones.add(nota);
                sumar_notas = sumar_notas + nota;
            }
        } while (salir);
        System.out.println("La nota media es: " + sumar_notas / 2);
        System.out.println("La nota máxima es: " + Collections.max(calificaciones));
        System.out.println("La nota mínima es: " + Collections.min(calificaciones));
    }
}