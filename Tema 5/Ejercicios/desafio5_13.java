import java.util.ArrayList;
import java.util.Collections;

public class desafio5_13 {
    public static void main(String[] args) {
        ArrayList<String> programacion = new ArrayList<>();
        programacion.add("Java");
        programacion.add("PHP");
        programacion.add("Python");
        programacion.add("C++");
        programacion.add("C#");
        programacion.add("Kotlin");

        System.out.println("Elementos del Array: " + programacion);

        Collections.sort(programacion);

        System.out.println("Elementos del Array Ordenado: " + programacion);

        programacion.remove("Java");
        programacion.set(0, "Java");

        System.out.println("Java primero: " + programacion);

        int posición = programacion.indexOf("Kotlin");

        System.out.println("Pocisión de Kotlin: " + posición);

        for (String elemento : programacion) {
            if (elemento.contains("o") || elemento.contains("O")) {
                System.out.println("Contiene una O: " + elemento);

            }

        }

    }
}
