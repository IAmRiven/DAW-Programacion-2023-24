import java.util.Arrays;

public class desafio5_10 {
    public static void main(String[] args) {
        int numeros[] = { 1, 4, 3, 7, 2, 9 };
        int numeros_copia[] = { 1, 4, 3, 7, 2, 9 };
        int numeros_original_comparar[] = { 1, 3, 5, 7, 9 };
        int numeros_copia_comparar[] = { 1, 3, 4, 7, 9 };
        int empty_array[] = new int[5];
        screenElements(numeros);
        containsElements(numeros, numeros_copia);
        sortElements(numeros_copia);
        checkPosition(numeros_copia_comparar, numeros_original_comparar);
        fillArray(empty_array);
    }

    public static void screenElements(int numeros[]) {
        System.out.println("La array es: " + Arrays.toString(numeros));
    }

    public static void containsElements(int numeros[], int numeros_copia[]) {
        if (Arrays.equals(numeros, numeros_copia)) {
            System.out.println("Las arrays son iguales");
        } else {
            System.out.println("Las arrays son distintas.");
        }
    }

    public static void sortElements(int numeros[]) {
        Arrays.sort(numeros);
        System.out.println("La array ordenada es: " + Arrays.toString(numeros));
    }

    public static void checkPosition(int numeros_copia[], int numeros_copia_comparar[]) {
        boolean copia = false;
        for (int i = 0; i < numeros_copia.length; i++) {
            if (numeros_copia[i] != numeros_copia_comparar[i]) {
                System.out.println("El numero " + numeros_copia[i] + " no está en la misma posición en la array.");
                copia = true;
            }
        }
        if (!copia) {
            System.out.println("No se han encontrado cambios.");
        }
    }

    public static void fillArray(int empty_array[]) {
        Arrays.fill(empty_array, 32);
        System.out.println("La array vacia: " + Arrays.toString(empty_array));
    }

}

// Challenge5_10. Java Arrays predefined functions.
// Create an array with some elements.

// Investigate the Java Arrays predefined functions to solve these exercises. To
// do that, write in Net Beans “Arrays.” and the list of functions will appear
// with a little documentation about how to use them.
// a)Write on screen all the elements of an array.
// b)See if two arrays has the same elements.
// c)Order the elements of an array.
// For example, if the array is:
// 1, 4, 3, 7, 2, 9
// The result should be:
// 1, 2, 3, 4, 7, 9
// d)Create two arrays with the same number of elements. Look for the element
// which is not equal in the same position of the other array.
// For example if the arrays are:
// Array1: 1, 3, 5, 7, 9
// Array2: 1, 3, 4, 7, 9
// The program should say:
// The element in position 2 is not equal
// e)Create an empty array of integers. Fill the array with the number 32.