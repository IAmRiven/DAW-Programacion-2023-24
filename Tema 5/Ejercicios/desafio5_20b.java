import java.util.Scanner;

public class desafio5_20b {
    public static void main(String[] args) {
        calculo();
    }

    public static void calculo() {
        Scanner numeros = new Scanner(System.in);
        System.out.print("Dime el numerador: ");
        int numerador = numeros.nextInt();
        System.out.print("Dime el denominador: ");
        int denominador = numeros.nextInt();

        int divisor = 0;
        for (int i = 1; i <= numerador; i++) {
            if (numerador % i == 0 && denominador % i == 0) {
                    divisor = i;
                }
            
    }
    numeros.close();
    System.out.println("El numero para dividir es: "+divisor);
 }
}

