public class desafio5_5 {
    public static void main(String[] args) {
        int numerorandom = 9;
        int array[] = { 1, 8, 5, 5, 3, 6, 9 };
        int posicion = checkNumber(numerorandom, array);

        if (posicion != -1) {
            System.out.println("El numero "+numerorandom+" está en la posicion: "+posicion);
        } else {
            System.out.println("El numero "+numerorandom+" no está en la array.");
        }
    }

    public static int checkNumber(int numerorandom, int array[]) {
        int posicion = -1;
        for (int i = 0; i < array.length && posicion == -1; i++) {
            if (array[i] == numerorandom) {
                posicion = i;
                // break;
            }
        }
        return (posicion);
    }
}
