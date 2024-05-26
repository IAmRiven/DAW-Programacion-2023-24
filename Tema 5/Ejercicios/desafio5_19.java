import java.util.HashMap;

public class desafio5_19 {
    public static void main(String[] args) {
        
        HashMap<String, String> equipos = new HashMap<>();
        equipos.put("Real Madrid", "blanca");
        equipos.put("Barcelona", "azul-roja");
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

            // if(camisetas_cantidad.containsKey(camiseta)){
            //     camisetas_cantidad.put(camiseta,camisetas_cantidad.get(camiseta)+1);
            // }else{
            //     camisetas_cantidad.put(camiseta,1);
            // }
            camisetas_cantidad.put(camiseta, camisetas_cantidad.getOrDefault(camiseta, 0) + 1);
        }
        //Muestro el nuevo HashMap camisetas-->cantidad
        for (String camiseta : camisetas_cantidad.keySet()) {
            System.out.println("La camiseta "+camiseta+ " es llevada "+camisetas_cantidad.get(camiseta)+ " veces");  
        }

        // for (HashMap.Entry<String, Integer> entry : camisetas_cantidad.entrySet()) {
        //     System.out.println("La camiseta " + entry.getKey() + " es llevada " + entry.getValue() + " veces.");
        // }
    }

}

// Take the challenge 5_17 and count how many times is weared each T-Shirt.
// For example:
// White colour is weared by 2 teams.
// Red-blue colour is weared by 1 team.
// Tablecoth colour is weared by 1 team.

// b) [ADVANCED]
// Modify this exercise to say what teams are wearing a colour.
// For example:
// White colour is weared by 2 Real Madrid, Sevilla.
// Red-blue colour is weared by Barcelona.
// Tablecoth colour is weared by 1 Croatia.

