import java.util.Scanner;

public class ejercicioformula {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Dime letra a: ");
        double a = keyboard.nextDouble();
        System.out.print("Dime letra b: ");
        double b = keyboard.nextDouble();
        System.out.print("Dime letra c: ");
        double c = keyboard.nextDouble();

        CalculoEcuacionesSegundoGrado(a, b, c);

        keyboard.close();

    } // 1 4 2

    public static void CalculoEcuacionesSegundoGrado(double a, double b, double c) {
        double discriminante = b * b - 4 * a * c;
        if (discriminante > 0) {

            double solucion1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double solucion2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.print("la solucion es: "+solucion1+" y "+solucion2);

        } else if (discriminante == 0) {

            double solucion3 = -b / (2 * a);
            System.out.println("Solo una solución que es: "+solucion3);
        } else {
            System.out.println("No tiene solucion");

        }
    }
}
