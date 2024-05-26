import java.util.HashMap;

public class desafio5_19b {
        public static void main(String[] args) {
        
        HashMap<String, String> equipos = new HashMap<>();
        equipos.put("Real Madrid", "blanca"); // Clave & Valor 
        equipos.put("Barcelona", "azul-roja"); // Key & Value
        equipos.put("Betis","verde");
        equipos.put("Sevilla", "blanca");
        equipos.put("Murcia", "granate");
        equipos.put("TeamA", "azul-roja");
        equipos.put("TeamB", "blanca");
        equipos.put("TeamC", "granate");
        equipos.put("TeamD", "azul-roja");
        equipos.put("TeamE", "blanca");
        equipos.put("TeamF", "granate");
        equipos.put("TemaG", null);


        HashMap<String, Integer> camisetas_cantidad = new HashMap<>();

        for (String camiseta : equipos.values()) {
            camisetas_cantidad.put(camiseta, camisetas_cantidad.getOrDefault(camiseta, 0) + 1);
        }
        for (String camiseta : camisetas_cantidad.keySet()) {
            System.out.println("La camiseta "+camiseta+ " es llevada "+camisetas_cantidad.get(camiseta)+ " veces");  
        }

    }
}
// White colour is weared by 2 Real Madrid, Sevilla.
// Red-blue colour is weared by Barcelona.
// Tablecoth colour is weared by 1 Croatia.

