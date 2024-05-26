import java.util.Arrays;

public class repaso_array6 {
    public static void main(String[] args) {
        int longitud = 5;
        int numeros_ganadores[] = rellenarGanadores(longitud);
        int numeros_apuesta[] = pedirApuesta(numeros_ganadores);
        System.out.println(Arrays.toString(numeros_apuesta));
        System.out.println(Arrays.toString(numeros_ganadores));
        System.out.println("Has tenido " + comprobarAciertos(numeros_ganadores, numeros_apuesta) + " aciertos.");
        System.out
                .println("Los numeros que has acertado son: : " + numerosAcertados(numeros_ganadores, numeros_apuesta));
    }

    public static int[] rellenarGanadores(int longitud) {
        int numeros[] = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            boolean numero_valido = false;
            while (!numero_valido) {
                int numero = (int) (Math.random() * 10) + 1;
                numeros[i] = numero;
                numero_valido = true;
            }
        }
        return numeros;
    }

    public static int[] pedirApuesta(int numeros_ganadores[]) {
        int numeros_apuesta[] = new int[numeros_ganadores.length];

        for (int i = 0; i < numeros_apuesta.length; i++) {
            boolean numero_valido = false;
            while (!numero_valido) {
                System.out.println("¿A que numero quieres apostar? (1-10)");
                int numero = Teclado.teclado.nextInt();
                if (numero > 10 || numero < 1) {
                    System.out.println("Número invalido, escribe otro");
                } else {
                    numeros_apuesta[i] = numero;
                    numero_valido = true;
                }
            }
        }

        return numeros_apuesta;

    }

    public static int comprobarAciertos(int numeros_ganadores[], int numeros_apuesta[]) {
        int aciertos = 0;
        for (int i = 0; i < numeros_apuesta.length; i++) {
            for (int j = 0; j < numeros_apuesta.length; j++) {
                if (numeros_apuesta[i] == numeros_ganadores[j]) {
                    aciertos++;
                }
            }
        }
        return aciertos;
    }

    public static int numerosAcertados(int numeros_ganadores[], int numeros_apuesta[]) {
        int numero_acertado = 0;
        for (int i = 0; i < numeros_apuesta.length; i++) {
            for (int j = 0; j < numeros_apuesta.length; j++) {
                if (numeros_apuesta[i] == numeros_ganadores[j]) {
                    numero_acertado = numeros_apuesta[i];
                }
            }
        }
        return numero_acertado;
    }
}
// 6. Definir una función que tome como parámetros dos tablas,
// la primera con los 6 números de una apuesta de la primitiva,
// y la segunda (ordenada) con los 6 números de la combinación
// ganadora. La función devolverá el número de aciertos.