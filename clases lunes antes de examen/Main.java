import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Leche", 1.45, 100));
        productos.add(new Producto("Almendras", 8.5, 1));
        productos.add(new Producto("Tomates", 4.5, 1));

        System.out.println(productos.toString());
        Collections.sort(productos);
        System.out.println(productos.toString());

        // Ordenada por nombre y precio
        Collections.sort(productos, new ComparatorPrecio());
        System.out.println(productos.toString());
    }

}
