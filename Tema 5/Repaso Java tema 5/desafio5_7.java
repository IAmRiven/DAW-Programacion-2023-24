public class desafio5_7 {
    public static void main(String[] args) {
        int numeros[] = { 1, -7, 3, 9, 15 };
        maximo(numeros);
        minimo(numeros);
    }

    public static void maximo(int numeros[]) {
        int maximo = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        System.out.println("El máximo de la array es: " + maximo);
    }

    public static void minimo(int numeros[]) {
        int minimo = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        System.out.println("El minimo de la array es: " + minimo);
    }
}
