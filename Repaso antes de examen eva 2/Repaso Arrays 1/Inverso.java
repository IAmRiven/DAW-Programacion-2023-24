import java.util.Arrays;
import java.util.Scanner;

public class Inverso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuantos numeros quieres introducir? ");
        int tamaño_array = teclado.nextInt();
        int lista_de_numeros[] = new int[tamaño_array];

        for (int i = 0; i < lista_de_numeros.length; i++) {
            System.out.print("Introduce el numero de la posición " + (i + 1) + ": ");
            int numero = teclado.nextInt();
            lista_de_numeros[i] = numero;
        }
        int array_copia[] = new int[lista_de_numeros.length];
        for (int i = 0; i < lista_de_numeros.length; i++) {
            array_copia[tamaño_array - 1 - i] = lista_de_numeros[i];
        }

        System.out.print("La copia de la Array es: " + Arrays.toString(array_copia));

        teclado.close();
    }

}
// Escribir un programa que solicite al usuario cuántos números desea
// introducir.
// A continuación, introducir por teclado esa cantidad de números enteros, y por
// último, mostrar en el orden inverso al introducido.