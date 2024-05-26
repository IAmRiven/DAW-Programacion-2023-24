import java.util.Scanner;

public class desafio5_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] = { 1, 8, 5, 3, 6, 9 };
        System.out.print("Dime un numero: ");
        int numero_random = teclado.nextInt();
        int posicion = checkNumber(numeros, numero_random);

        System.out.println("La posición del numero " + numero_random + " es la " + posicion);
        teclado.close();

    }

    public static int checkNumber(int numeros[], int numero_random) {
        int posicion = -1;
        for (int i = 0; i < numeros.length && posicion == -1; i++) {
            if (numero_random == numeros[i]) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }
}

// Create a function that check if a number exists in an array and tells the
// position of
// the element or -1 if the element doesn’t exists in the array.
// For example, if we have an array composed by the elements 1, 8, 5, 3, 6, 9
// If we look for the number 5 it should say:
// The number 5 is in the position 2.
// If we look for the number 7 it should say:
// The number 7 is in the position -1.
