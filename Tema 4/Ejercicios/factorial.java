import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n;
        double factorial = 1;
        Scanner keyboard = new Scanner(System.in);
		
        do {
            System.out.print("Introduce un numero entero >= 0: ");
            n = keyboard.nextInt();
        } while (n < 0);

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
		
        System.out.printf("%d! = %.0f %n", n, factorial);                                                         
    }
}
