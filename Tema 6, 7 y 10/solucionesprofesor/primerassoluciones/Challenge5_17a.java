package UT5;

import java.util.HashMap;
public class Challenge5_17a {
    public static void main(String[] args) {
        HashMap<String, String> equipos = new HashMap<>();
        equipos.put("Real Madrid", "blanca");
        equipos.put("Barcelona", "azul-roja");
        equipos.put("Betis", "verde");
        equipos.put("Murcia", "granate");

        for (String equipo : equipos.keySet ()) {
            System.out.println("El "+equipo+" lleva camiseta "+equipos.get(equipo));
        }
    }
}
