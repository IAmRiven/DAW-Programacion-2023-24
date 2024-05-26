import java.util.Scanner;

public class Maximo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lista_de_numeros[] = new int[5];

        for (int i = 0; i < lista_de_numeros.length; i++) {
            System.out.print("Dime el numero de la posición " + (i + 1) + ": ");
            lista_de_numeros[i] = teclado.nextInt();
        }

        System.out.println("El valor máximo de la array es " + maximo(lista_de_numeros));
        teclado.close();
    }

    public static int maximo(int[] lista_de_numeros) {
        int maximo = 0;

        for (int i = 0; i < lista_de_numeros.length; i++) {
            if (lista_de_numeros[i] > maximo) {
                maximo = lista_de_numeros[i];
            }
        }

        return maximo;
    }
}

// Diseñar una función: int máximo (intt[]), que devuelva el máximo valor
// contenido en una tabla.
