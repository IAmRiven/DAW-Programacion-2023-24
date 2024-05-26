public class desafio5_7 {
    public static void main(String[] args) {
        int numeros[] = { -1230, 1, 5, 3, 4, 9, 10, 11, 20 };

        calcularMaximo(numeros); //Llamamos a la funcion
        calcularMinimo(numeros);
    }

    public static void calcularMaximo(int numeros[]) {
        int maximo = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        System.out.println("El número máximo de la array es: " + maximo);
    }

    public static void calcularMinimo(int numeros[]) {
        int minimo = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        System.out.println("El número mínimo de la array es: " + minimo);
    }
}
