import java.util.ArrayList;

public class desafio5_12 {
    public static void main(String[] args) {
        ArrayList<String> lista_compra = new ArrayList<>();
        lista_compra.add("Tomates");
        lista_compra.add("Atún");
        lista_compra.add("Lechuga");
        lista_compra.add("Ketchup");
        lista_compra.add("Mayonesa");
        // Show the elements contained in the ArrayList.
        System.out.println("La lista de la compra es: " + lista_compra);

        // Insert an element in the third position
        // Show the elements contained in the ArrayList.
        lista_compra.set(2, "Agua");
        System.out.println("La lista de la compra con un objeto nuevo en la posición 3: " + lista_compra);

        // Show the element in the first position.
        System.out.println("El primer objeto de la lista de la compra es: " + lista_compra.get(0));

        // Remove the first element in the ArrayList
        System.out.println("Se ha eliminado el primer elemento \"" + lista_compra.remove(0)
                + "\" de la lista de la compra.");
        System.out.println("Lista de la compra eliminando el primer objeto: " + lista_compra);

        // Change the element in the last position by another one.
        lista_compra.set(lista_compra.size() - 1, "Olivas");
        System.out.println("Lista de la compra cambiando el último objeto: " + lista_compra);
    }
}
