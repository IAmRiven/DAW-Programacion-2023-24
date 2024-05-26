import java.util.ArrayList;

public class desafio5_11 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        boolean salir = true;
        do {
            System.out.print("Que nombre quieres añadir al arraylist?: ");
            String texto = Teclado.teclado.nextLine();
            if (texto.isEmpty()) {
                System.out.println("Has terminado de introducir nombres.");
                salir = false;
            } else {
                nombres.add(texto);
                System.out.println("Has añadido: " + texto + " al arraylist");
            }
        } while (salir);
        System.out.println("Hay un total de " + nombres.size() + " en el arraylist:");
        System.out.println("Nombres: " + nombres);
    }
}

// Create an ArrayList of Strings. By using the keyboard,
// the user should introduce person names until he introduce
// an empty word. Store this person names in the ArrayList.
// At the end, show the names contained in the ArrayList.
