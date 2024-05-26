public class desafio5_8 {
    public static void main(String[] args) {
        int numeros[] = { 1, 4, 3, 5, 7, 3, 9, 4 };
        verDuplicados(numeros);
    }

    public static void verDuplicados(int numeros[]) {

        boolean hayduplicado = false;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    System.out.println("El numero " + numeros[i] + " está duplicado.");
                    hayduplicado = true;
                }
            }
        }

        if (!hayduplicado) {
            System.out.println("No se han encontrado duplicados.");
        }
    }
}

// Challenge 5_8. Look for duplicates of an array.
// Create an array with some elements.
// Look for the elements that are duplicated in the array.
// For example, if the array has the following values:
// 1,4,3,5,7,3,9,4
// The program should say:
// The number 4 is duplicated.
// The number 3 is duplicated.
