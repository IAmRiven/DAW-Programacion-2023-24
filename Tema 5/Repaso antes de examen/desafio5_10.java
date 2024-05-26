import java.util.Arrays;

public class desafio5_10 {
    public static void main(String[] args) {
        int numeros[] = { 1, 4, 3, 7, 2, 9 };
        int numeros_copia[] = { 1, 4, 3, 7, 2, 9 };

        int numeros_posicion[] = { 1, 3, 5, 7, 9 };
        int numeros_posicion_copia[] = { 1, 3, 4, 7, 9 };

        int numeros_rellenar[] = new int[5];

        // Apartado A
        System.out.println(Arrays.toString(numeros));

        // Apartado B
        if (Arrays.equals(numeros, numeros_copia)) {
            System.out.println("Las arrays son iguales.");
        } else {
            System.out.println("Las arrays NO son iguales.");
        }

        // Apartado C
        Arrays.sort(numeros);
        System.out.println("El array ordenado: " + Arrays.toString(numeros));

        // Apartado D
        for (int i = 0; i < numeros_posicion.length; i++) {
            if (numeros_posicion[i] != numeros_posicion_copia[i]) {
                System.out.println("El elemento en la posición " + i + " no es igual.");
            }
        }

        // Apartado E
        Arrays.fill(numeros_rellenar, 32);
        System.out.println("El array rellenada es: " + Arrays.toString(numeros_rellenar));
    }
}
