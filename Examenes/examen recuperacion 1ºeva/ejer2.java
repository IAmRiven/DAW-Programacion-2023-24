import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean salir = false;

        do {
        int numero1 = (int)(Math.random() * 200-1);
        int numero2 = (int)(Math.random() * 200-1);
        int resultado = numero1 + numero2;
        System.out.println("¿Cuánto es "+numero1+" + "+numero2+"? "+resultado);
        int introducido = input.nextInt();
        int total_intentos = 1;

        if (introducido != resultado) {
            System.out.println("Respuesta incorrecta. Fin de juego");
            System.out.println("Has tenido "+total_intentos+" de aciertos");
            salir = true;
        } else {
            System.out.println("¡Correcto! ¡Sigue así!");
            total_intentos++;
        }
            
            
        } while (!salir);



    }
}
