import java.util.Arrays;

public class desafio5_7 {
    public static void main(String[] args) {
        int numeros[] = desafio5_3.rellenarArray(5);
        int maximo = 0;
        int minimo = numeros[0];
        System.out.println(Arrays.toString(numeros));

        for (int devolver_valores : numeros) {
            if (devolver_valores > maximo) {
                maximo = devolver_valores;
            }
            if (devolver_valores < minimo) {
                minimo = devolver_valores;
            }
        }
        System.out.println("El maximo numero es: " + maximo);
        System.out.println("El minimo numero es: " + minimo);
    }
}
