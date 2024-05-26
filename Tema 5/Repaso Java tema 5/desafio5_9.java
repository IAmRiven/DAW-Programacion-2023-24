public class desafio5_9 {
    public static void main(String[] args) {
        int numeros[] = { 1, 8, 5, 9, 4, 7, 2 };
        verBulkiest(numeros);
    }

    public static void verBulkiest(int numeros[]) {

        boolean bulkiest;

        for (int i = 0; i < numeros.length; i++) {
            bulkiest = true;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] > numeros[i]) {
                    bulkiest = false;
                    break;
                }
            }
            if (bulkiest) {
                System.out.println("El numero " + numeros[i] + " es un bulkiest.");
            }
        }

    }

}

// Challenge 5_9. [ADVANCED] Look for the BULKIESTs.
// Create an array with some elements.
// Look for the BULKIEST elements in the array. An element should be considered
// a
// BULKIEST if it is bigger than all the elements at his right.
// For example, if the array is:
// 1, 8, 5, 9, 4, 7, 2
// The program should say:
// 9 is a BULKIEST.
// 7 is a BULKIEST.
// 2 is a BULKIEST.