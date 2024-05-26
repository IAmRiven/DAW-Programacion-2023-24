public class desafio5_9 {
    public static void main(String[] args) {
        int numeros[] = { 1, 8, 5, 9, 4, 7, 2 }; // 9, 7, 2
        bulkiest(numeros);
    }

    public static void bulkiest(int numeros[]) {

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
                System.out.println(numeros[i] + " es un bulkiest.");
            }

        }
    }

}
