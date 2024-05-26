public class desafio5_20b {
    public static void main(String[] args) {
        int divisor_comun = 0;
        System.out.print("Dime el numerador: ");
        int numerador = Teclado.teclado.nextInt();

        System.out.print("Dime el denominador: ");
        int denominador = Teclado.teclado.nextInt();

        for (int i = 1; i < denominador; i++) {
            if (numerador % i == 0 && denominador % i == 0) {
                divisor_comun = i;
            }
        }
        System.out.println("El divisor común es: " + divisor_comun);
    }
}

// b. Simplifying fractions.
// We are going to create a program working with fractions 3/8.
// A fraction has numerator (3) and denominator (8).
// The program should ask for the numerator and denominator.
// We are going to create a function to calculate the greatest
// common divisor (máximo común divisor) of numerator and denominator.
// This is the maximum number which divides both numerator and
// denominator with zero remainder (exact division).7
// We are going to create another function to simplify the fraction
// which divides numerator and denominator by greatest common divisor.
//
// b. Simplificando fracciones.
// Vamos a crear un programa que trabaje con fracciones 3/8.
// Una fracción tiene numerador (3) y denominador (8).
// El programa debería pedir el numerador y el denominador.
// Vamos a crear una función para calcular el máximo común divisor
// del numerador y denominador. Este es el número máximo que divide
// tanto al numerador como al denominador con resto cero (división exacta).
// Vamos a crear otra función para simplificar la fracción que divide
// numerador y denominador por el máximo común divisor.