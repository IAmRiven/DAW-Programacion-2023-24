import java.util.Arrays;
import java.util.HashSet;

public class quitarRepes {
    public static void main(String[] args) {
        int numeros_repetidos[] = { 1, 2, 2, 3, 4, 4, 8, 8, 9, 10 };
        System.out.println("El array original es: " + Arrays.toString(numeros_repetidos));
        System.out.println("El array sin repetidos es: " + Arrays.toString(sinRepetidos(numeros_repetidos)));
    }

    public static Integer[] sinRepetidos(int numeros_repetidos[]) {
        HashSet<Integer> guardiar_sin_repetidos = new HashSet<>();
        Integer[] numeros_sin_repetidos = new Integer[guardiar_sin_repetidos.size()];
        for (Integer recorrer_numeros : numeros_repetidos) {
            guardiar_sin_repetidos.add(recorrer_numeros);
        }
        return guardiar_sin_repetidos.toArray(numeros_sin_repetidos);
    }
}

// Implementa la función int[] sinRepetidos(int t[]), que construye y devuelve
// una
// tabla de la longitud apropiada, con los elementos de t, donde se han
// eliminado los
// datos repetidos.
