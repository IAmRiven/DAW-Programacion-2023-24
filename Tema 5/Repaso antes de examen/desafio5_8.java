import java.util.Arrays;

public class desafio5_8 {
    public static void main(String[] args) {
        int numeros[] = desafio5_3.rellenarArray(8);
        System.out.println("El array original es: " + Arrays.toString(numeros));
        comprobarDuplicados(numeros);
    }

    public static void comprobarDuplicados(int numeros[]) {
        boolean hay_duplicados = false;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    System.out.println("El numero " + numeros[j] + " está duplicado.");
                    hay_duplicados = true;
                }
            }
        }
        if (!hay_duplicados) {
            System.out.println("No se han encontrado duplicados.");
        }
    }
}
