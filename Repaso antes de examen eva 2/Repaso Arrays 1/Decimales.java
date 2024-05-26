import java.util.Arrays;
import java.util.Scanner;

public class Decimales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lista_de_numeros[] = new double[5];

        for (int i = 0; i < lista_de_numeros.length; i++) {
            System.out.print("Introduzca un numero decimal: ");
            lista_de_numeros[i] = sc.nextDouble();
        }

        System.out.println(Arrays.toString(lista_de_numeros));
        sc.close();
    }
}

// Diseñar un programa que solicite al usuario que introduzca por teclado 5
// números decimales.
// A continuación mostrar los números en el orden que se han introducido.
