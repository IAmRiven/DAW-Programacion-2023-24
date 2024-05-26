import java.util.ArrayList;

public class desafio5_12 {
    public static void main(String[] args) {
        ArrayList<String> elementos = new ArrayList<>();
        elementos.add("Pelota");
        elementos.add("Mesas");
        elementos.add("Coches");

        System.out.println("Elementos de la array: "+elementos);

        // Apartado A
        elementos.add(2, "Tercera");

        System.out.println("Elementos de la array en la tercera posición: "+elementos);
        
        // Apartado B
        System.out.println("Elemento de la primera posición: "+elementos.get(0));

        // Apartado C
        elementos.remove(0);

        System.out.println("Eliminamos la primera posición de la Array: "+elementos);

        // Apartado D
        elementos.remove(elementos.size()-1);
        elementos.add("Tomates");
        
        System.out.println("Elemento de la ultima Array: "+elementos);

        // Apartado E
        elementos.set(elementos.size()-1, "Marionetas");

        System.out.println("Elemento de la ultima Array: "+elementos);
    }
}
