import java.util.ArrayList;
import java.util.Collections;

public class desafio5_13 {
    public static void main(String[] args) {
        ArrayList<String> programas = new ArrayList<>();
        programas.add("Java");
        programas.add("PHP");
        programas.add("C++");
        programas.add("C#");
        programas.add("Kotlin");

        // Show the elements contained in the ArrayList.
        System.out.println("La lista de programa son: " + programas);

        // Order the elements in the ArrayList.
        Collections.sort(programas);

        // Show the elements contained in the ArrayList.
        System.out.println("La lista ordenada de programas es: " + programas);

        // Make Java to be the first one.
        programas.remove("Java");
        programas.add(0, "Java");

        // Show the elements contained in the ArrayList.
        System.out.println("Cambiando Java a la primera posición: " + programas);

        // Tell what is the position of Kotlin.
        System.out.println("La posición de Kotlin es: " + programas.indexOf("Kotlin"));

        // Display the languages containing the letter “o”
        for (String recorrer_arraylist : programas) {
            if (recorrer_arraylist.contains("o") || recorrer_arraylist.contains("O")) {
                System.out.println("El programa " + recorrer_arraylist + " contiene en su nombre la letra O");
            }
        }
    }
}
// d)
// Display the languages containing the letter “o”.
