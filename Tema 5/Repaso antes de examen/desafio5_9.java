public class desafio5_9 {
    public static void main(String[] args) {
        int numeros[] = { 1, 8, 5, 9, 4, 7, 2 };
        boolean esBulkiest;
        for (int i = 0; i < numeros.length; i++) {
            esBulkiest = true;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    esBulkiest = false;
                    break;
                }
            }
            if (esBulkiest) {
                System.out.println("El numero " + numeros[i] + " es bulkiest");
            }
        }
    }
}