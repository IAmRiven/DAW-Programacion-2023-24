import java.util.Arrays;

public class repaso_array4 {
    public static void main(String[] args) {
        int longitud = pedirLongitud();
        int numeros[] = añadirNumeros(longitud);

        System.out.println(Arrays.toString(numeros));
        System.out.println("El numero mínimo del Array es: " + comprobarMinimo(numeros));
    }

    public static int pedirLongitud() {
        System.out.println("¿De qué tamaño quieres el Array?");
        int longitud = Teclado.teclado.nextInt();
        return longitud;
    }

    public static int[] añadirNumeros(int longitud) {
        int numeros_generados[] = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            System.out.println("¿Que numero quieres añadir al array?");
            int numero = Teclado.teclado.nextInt();
            numeros_generados[i] = numero;
        }
        return numeros_generados;
    }

    public static int comprobarMinimo(int numeros[]) {
        int minimo = numeros[0];
        for (int recorrer_numeros : numeros) {
            if (recorrer_numeros < minimo) {
                minimo = recorrer_numeros;
            }
        }
        return minimo;
    }
}
// 4. Diseñar una función intmminimo(int t[]),
// que devuelva el minimo valor contenido en una tabla.