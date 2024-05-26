import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class desafio5_14 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        boolean salida = false;
        double sumar = 0;
        double media = 0;

        do {
            System.out.println("Dime la nota del alumno: ");
            double añadirnota = keyboard.nextDouble();

            if (añadirnota >= 0 && añadirnota <= 10) {
                notas.add(añadirnota);
            } else if (añadirnota == -1) {
                salida = true;
            } else {
                System.out.println("Nota inválida.");
            }
        } while (!salida == true);

        double maxima = Collections.max(notas);
        double minima = Collections.min(notas);

        for (double notamedia : notas) {
            sumar = sumar + notamedia;
            media = sumar / notas.size();
        }

        System.out.println(notas);
        System.out.println("La nota máxima es: " + maxima);
        System.out.println("La nota máxima es: " + minima);
        System.out.println("La media es: " + media);

        keyboard.close();

    }
}
