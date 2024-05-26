public class desafio5_6b {
    public static void main(String[] args) {
        int array [] = {1, 5, 3, 4, 9};
        int array2 [] = new int [array.length];

        duplicar(array, array2);
        desafio5_3.mostrarforeach(array2);
    }

    public static int[] duplicar(int array[], int array2[]) {
        int longitud = array.length;
        for (int i = 0; i < array.length; i++) {
            array2[longitud-i] = array[i];
        }
        return(array2);
    }
}
