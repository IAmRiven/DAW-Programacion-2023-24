import java.util.Arrays;
import java.util.Scanner;

public class RellenarArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿De cuantos numeros será el Array? ");
        int tamaño = teclado.nextInt();
        System.out.print("Número par máximo para la Array: ");
        int numero_par_maximo = teclado.nextInt();

        int[] array = rellenarPares(tamaño, numero_par_maximo);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        teclado.close();
    }

    public static int[] rellenarPares(int longitud, int numero_par_maximo) {
        int lista_de_numeros[] = new int[longitud];
        int numero_random;
        for (int i = 0; i < lista_de_numeros.length; i++) {
            numero_random = (int) ((Math.random() * numero_par_maximo) / 2) + 1;
            numero_random = numero_random * 2;
            lista_de_numeros[i] = numero_random;
        }
        return lista_de_numeros;
    }
}

// Escribir una función int[] rellenarPares(int longitud, int fin), que crea y
// devuelve una tabla ordenada de la longitud especificada que se encuentra
// rellena con números pares aleatorios comprendidos entre 2 hasta fin
// (inclusive).