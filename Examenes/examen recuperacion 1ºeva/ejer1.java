import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int numero = teclado.nextInt();
        int aproximado = CalcularAproximado(numero)-1;
        int resto = numero - 0;

        System.out.println("La raíz cuadrada de "+numero+" es aproximadamente de "+aproximado+" con un resto de "+resto);

        teclado.close();
    }


    public static Integer CalcularAproximado(int numero) {
        int aproximado = 0;

        for (int i = 0; aproximado * aproximado <= numero; i++) {
            aproximado++;
        }
         return aproximado;
    }

}
