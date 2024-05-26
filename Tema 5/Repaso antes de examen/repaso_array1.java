import java.util.Arrays;

public class repaso_array1 {
    public static void main(String[] args) {
        double numeros[] = new double[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Dime un numero para añadirlo a la lista: ");
            double numero = Teclado.teclado.nextDouble();
            numeros[i] = numero;
        }
        System.out.println(Arrays.toString(numeros));
    }
}

// 1. Diseñar un programa que solicite al usuario que introduzca
// por teclado 5 números decimales. A continuación mostrar los números
// en el orden que se han introducido.