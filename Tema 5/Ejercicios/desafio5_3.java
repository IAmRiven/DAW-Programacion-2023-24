public class desafio5_3 {
    public static void main(String[] args) {
        int numeros[] = { 1, 3, 6, 5, 29, 6 };
        mostrarforeach(numeros);
    }

    public static void mostrarforeach(int numeros[]) {
        for (int i : numeros) {
            System.out.println(i);
        }
    }

    public static void mostrarfor(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }

}
