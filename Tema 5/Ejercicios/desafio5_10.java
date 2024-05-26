import java.util.Arrays;

public class desafio5_10 {
    public static void main(String[] args) {
        int numeros[] = { 1, 4, 3, 7, 2, 9 };
        int numeros2[] = { 1, 4, 3, 7, 2, 9 };

        int arraycompara[] = { 3, 4, 5, 6, 2, 9 };
        int arraycomparacopia[] = { 3, 1, 5, 6, 2, 9 };

        // Apartado A
        System.out.println("Lista disponible en la Array es " + Arrays.toString(numeros));

        // Apartado B
        if (Arrays.equals(numeros, numeros2)) {
            System.out.println("Son iguales las arrays.");
        } else {
            System.out.println("No son iguales.");
        }

        // Apartado C
        Arrays.sort(numeros);

        System.out.println("La Array ordenada: " + Arrays.toString(numeros));

        // Apartado D
        for (int i = 0; i < arraycomparacopia.length; i++) {

            if (arraycompara[i] != arraycomparacopia[i]) {
                System.out.println("La posición " + arraycomparacopia[i] + " no es igual.");
            }
        }

        // Apartado E
        int vacio[] = new int[5];

        Arrays.fill(vacio, 32);

        System.out.println(Arrays.toString(vacio));

    }
}
