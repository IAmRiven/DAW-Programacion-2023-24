import java.util.HashMap;

public class desafio5_17 {
    public static void main(String[] args) {
        HashMap<String, String> equipos_futbol = new HashMap<>();
        equipos_futbol.put("Alavés", "Azul");
        equipos_futbol.put("Almeria", "Roja");
        equipos_futbol.put("Cádiz", "Blanca");
        equipos_futbol.put("Atlético", "Blanca");
        equipos_futbol.put("Granada", "Roja");
        equipos_futbol.put("Las Palmas", "Roja");
        equipos_futbol.put("Osasuna", "Verde");
        equipos_futbol.put("Valencia", "Verde");
        equipos_futbol.put("Villareal", "Violeta");
        // Clave(Key) - Valor(Value)
        for (HashMap.Entry<String, String> recorrer_equipos : equipos_futbol.entrySet()) {
            System.out.println(
                    "El equipo " + recorrer_equipos.getKey() + " lleva la camiseta " + recorrer_equipos.getValue());
        }

    }

}

// Create a HashMap with sport teams (choose one football, basketball, jugger…)
// associating the colour of the T-shirt with each team.
// Add some elements to it.
// Loop through all elements showing keys and values simultaneously.
// For example:
// Real Madrid wears a white T-shirt.
// Barcelona wears a blue-red T-shirt.
// Sevilla wears a white T-shirt.
// Croatia wears a tablecloth T-shirt.
//
// Crea un HashMap con equipos deportivos (elige uno de fútbol, ​​baloncesto,
// jugger…)
// asociando el color de la camiseta a cada equipo.
// Añade algunos elementos.
// Recorre todos los elementos que muestran claves y valores simultáneamente.
// Por ejemplo:
// El Real Madrid viste camiseta blanca.
// Barcelona viste una camiseta azul-roja.
// El Sevilla viste camiseta blanca.
// Croacia viste camiseta de mantel.
