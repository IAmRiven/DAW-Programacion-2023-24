import java.util.Scanner;

public class desafio4_4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Cual es el largo del rectangulo?");
        int largo = keyboard.nextInt();
        System.out.println("Cual es el ancho del rectanculo?");
        int ancho = keyboard.nextInt();

        if (largo < 0 || ancho < 0) {
            System.out.println("El valor introducido es negativo, entonce no es válido");   
        } else {
            System.out.println("El resultado es "+calcularRectangulo(largo, ancho));
        }

        keyboard.close();
    }

    public static int calcularRectangulo(int largo, int ancho) {
        int area = largo * ancho;
        return(area);
    }
}
