import java.util.ArrayList;
import java.util.Scanner;

public class desafio5_20d {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int numero = teclado.nextInt();
        ArrayList<Integer> divisores = new ArrayList<>();
        divisores(numero, divisores);

        for (Integer multiplo : divisores) {
            for (int i = multiplo; i > 0; i--) {
                desafio5_20c.rellenarCaracteres(numero/multiplo,' ');
                desafio5_20c.rellenarCaracteres(numero/multiplo,'*');
            }
            System.out.println("");
        }
    }

    public static void divisores(int numero, ArrayList<Integer> divisores) {
        for (int i = 1; i <= numero; i++) {
            if(numero%i == 0) {
                divisores.add(i);
            }
        }
    }

}
