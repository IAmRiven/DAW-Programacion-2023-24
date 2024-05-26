import java.util.Scanner;

public class desafio4_5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Dime numero 1: ");
        int numero1 = keyboard.nextInt();
        System.out.println("Dime numero 2: ");
        int numero2 = keyboard.nextInt();

        minimo(numero1, numero2); // Llamamos a la función.
        keyboard.close();
    }

    public static void minimo(int numero1, int numero2) {
        if (numero1 > numero2) {
            System.out.println("Numero 1 es mayor que numero 2");
        } else {
            System.out.println("Numero 2 es mayor que numero 1");
        }
    }
}

// Utilice la función creada en el desafío anterior para solicitar 
// 2 números al usuario y pasar estos 2 números a la función para calcular el mínimo.