public class desafio5_6a {
    public static void main(String[] args) {
        int array[] = { 1, 5, 3, 4, 9 };
        int array2[] = new int[array.length];

        duplicar(array, array2);
        desafio5_3.Numeros(array2);
    }

    public static void duplicar(int array[], int array2[]) {
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
    }
}
