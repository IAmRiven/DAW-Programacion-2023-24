public class desafio5_6b {
    public static void main(String[] args) {
        int numeros_random[] = { 1, 5, 3, 4, 9 };
        int numeros_copiados[] = new int[numeros_random.length];

        duplicar(numeros_random, numeros_copiados);
        reverse(numeros_random, numeros_copiados);

    }

    public static void duplicar(int numeros_random[], int numeros_copiados[]) {

        for (int i = 0; i < numeros_random.length; i++) {
            numeros_copiados[i] = numeros_random[i];
        }

        System.out.print("La array original es: ");
        desafio5_3.mostrarElementos(numeros_random);
        System.out.print("La array duplicada es: ");
        desafio5_3.mostrarElementos(numeros_copiados);
    }

    public static void reverse(int numeros_random[], int numeros_copiados[]) {
        int numeros_reverse[] = new int[numeros_random.length];
        int tamaño_array = numeros_random.length;
        for (int i = 0; i < numeros_random.length; i++) {
            numeros_reverse[tamaño_array - 1 - i] = numeros_random[i];
        }

        System.out.print("La array al reves es: ");
        desafio5_3.mostrarElementos(numeros_reverse);
    }
}
// b)
// // Instead of duplicating the array, reverse the elements in the array.
// // For example, if our first array has the following elements:
// // 1, 5, 3, 4, 9
// // The second array should have the same elements but in the reverse order:
// // 9, 4, 3, 5, 1