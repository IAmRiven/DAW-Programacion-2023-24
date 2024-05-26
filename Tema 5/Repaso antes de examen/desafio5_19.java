import java.util.HashMap;

public class desafio5_19 {
    public static void main(String[] args) {
        HashMap<String, String> equipos_futbol = new HashMap<>();
        equipos_futbol.put("Alavés", "White");
        equipos_futbol.put("Almeria", "Red-blue");
        equipos_futbol.put("Cádiz", "Tablecoth");
        equipos_futbol.put("Granada", "White");

        HashMap<String, Integer> contar_camisetas = new HashMap<>();

        for (HashMap.Entry<String, String> recorrer_equipos : equipos_futbol.entrySet()) {
            String equipo = recorrer_equipos.getKey();
            String camiseta = recorrer_equipos.getValue();

            contar_camisetas.put(camiseta, contar_camisetas.getOrDefault(camiseta, 0) +
                    1);

        }
        for (String recorrer_contar_camisetas : contar_camisetas.keySet()) {
            System.out.println(
                    "La camiseta " + recorrer_contar_camisetas + " es llevada por "
                            + contar_camisetas.get(recorrer_contar_camisetas) + " equipos.");
        }
    }
}
// Take the challenge 5_17 and count how many times is weared each T-Shirt.
// For example:
// White colour is weared by 2 teams.
// Red-blue colour is weared by 1 team.
// Tablecoth colour is weared by 1 team.
