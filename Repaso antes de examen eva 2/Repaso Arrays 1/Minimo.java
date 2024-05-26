import java.util.Scanner;

public class Minimo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lista_de_numeros[] = new int[5];

        for (int i = 0; i < lista_de_numeros.length; i++) {
            System.out.print("Dime el numero de la posición " + (i + 1) + ": ");
            lista_de_numeros[i] = teclado.nextInt();
        }

        System.out.println("El valor minimo de la array es " + minimo(lista_de_numeros));
        teclado.close();
    }

    public static int minimo(int[] lista_de_numeros) {
        int minimo = lista_de_numeros[0];

        for (int i = 1; i < lista_de_numeros.length; i++) {
            if (minimo > lista_de_numeros[i]) {
                minimo = lista_de_numeros[i];
            }
        }

        return minimo;
    }
}

// Diseñar una función: int minimo (intt[]), que devuelva el minimo valor
// contenido en una tabla.
