import java.util.Arrays;

public class repaso_array5 {
    public static void main(String[] args) {
        int longitud = pedirLongitud();
        int numero_par_maximo = pedirNumeroParMaximo();
        int numeros_pares[] = rellenarPares(longitud, numero_par_maximo);

        Arrays.sort(numeros_pares);
        System.out.println(Arrays.toString(numeros_pares));
    }

    public static int pedirLongitud() {
        System.out.println("¿De qué longitud quieres el Array?");
        int longitud = Teclado.teclado.nextInt();
        return longitud;
    }

    public static int pedirNumeroParMaximo() {
        System.out.println("¿Hasta que numero par quieres generar?");
        int numero_par = Teclado.teclado.nextInt();
        return numero_par;
    }

    public static int[] rellenarPares(int longitud, int numero_par_maximo) {
        int numeros_pares[] = new int[longitud];
        int numero_random = 0;
        for (int i = 0; i < longitud; i++) {
            numero_random = (int) ((Math.random() * numero_par_maximo) / 2) + 1;
            numero_random = numero_random * 2;
            numeros_pares[i] = numero_random;
        }
        return numeros_pares;
    }
}
// 5. Escribir una función int[] rellenarPares(int longitud, int fin),
// que crea y devuelve una tabla ordenada de la longitud especificada
// que se encuentra rellena con números pares aleatorios comprendidos
// entre 2 hasta fin (inclusive).
