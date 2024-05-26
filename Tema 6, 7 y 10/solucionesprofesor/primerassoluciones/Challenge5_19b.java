package UT5;


import java.util.HashMap;
public class Challenge5_19b {
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

        //Registra cuántas veces es llevada una camiseta
        HashMap<String, Integer> cantidadCamisetas = new HashMap<>();
        //registra qué equipos llevan la camiseta
        HashMap<String, String> equiposPorCamiseta = new HashMap<>();
        //Procesar 
        String equiposCamisetas="";
        String equipo="";
        String camiseta="";
        for (HashMap.Entry<String, String> entry: equipos.entrySet()) {
            //Almacenar cuantas veces es llevada la camiseta
            equipo = entry.getKey();
            camiseta = entry.getValue();

            //Almacenar cuantas veces es llevada una camiseta
            cantidadCamisetas.put(camiseta, cantidadCamisetas.getOrDefault(camiseta,0) +1);
              
            // Almacenar qué equipos llevan cada camiseta
            equiposCamisetas=equiposPorCamiseta.get(camiseta);
            if (equiposCamisetas!=null){
                equiposCamisetas=equiposCamisetas+equipo+", ";
            }
            else{
                equiposCamisetas=equipo+", ";
            }
            equiposPorCamiseta.put(camiseta,equiposCamisetas);        
        }

        int cantidad;
        for (HashMap.Entry<String, String> entry : equiposPorCamiseta.entrySet()) {
            cantidad=cantidadCamisetas.get(entry.getKey());//obtengo el número de camisetas 
            System.out.println("La camiseta " + entry.getKey() + " es llevada "+cantidad+" veces "+" por: " + entry.getValue());
        }
    }
}



