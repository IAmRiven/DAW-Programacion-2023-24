import java.util.ArrayList;
import java.util.Scanner;

public class desafio5_11 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();

        String nombre;

        while (true) {

            System.out.println("Introduce tu nombre: ");
            nombre = keyboard.nextLine();

            if (nombre.isEmpty()) {
                break;
            } else {
                nombres.add(nombre);
            }

        }
        System.out.println(nombres);
        keyboard.close();
    }
}
