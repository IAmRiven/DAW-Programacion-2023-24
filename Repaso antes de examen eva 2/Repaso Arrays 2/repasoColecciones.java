import java.util.HashMap;

public class repasoColecciones {
    public static void main(String[] args) {
        HashMap<String, String> datos = new HashMap<>();
        datos.put("Joan Mir", "Honda");
        datos.put("Luca Marini", "Honda");
        datos.put("Fabio Quartararo", "Yamaha");
        datos.put("Alex Rins", "Yamaha");
        datos.put("Francesco Bagnaia", "Ducati");
        datos.put("Enea Bastianini", "Ducati");
        datos.put("Brad Brinder", "KTM");
        datos.put("Jack Miller", "KTM");
        datos.put("Aleix Espargaro", "Aprilia");
        datos.put("Maverick Viñales", "Aprilia");
        datos.put("Jorge Martín", "Ducati");
        datos.put("Franco Morbidelli", "Ducati");
        datos.put("Takaaki Nakagami", "Honda");
        datos.put("Johan Zarco", "Honda");
        datos.put("Augusto Fernández", "KTM");
        datos.put("Pedro Acosta ", "KTM");
        datos.put("Marco Bezzecchi", "Ducati");
        datos.put("Fabio Di Giannantonio", "Ducati");
        datos.put("Marc Márquez ", "Ducati");
        datos.put("Alex Márquez", "Ducati");
        datos.put("Miguel Oliveira", "Aprilia");
        datos.put("Raúl Fernández", "Aprilia");

        HashMap<String, String> paises = new HashMap<>();
        paises.put("Joan Mir", "España");
        paises.put("Luca Marini", "Italia");
        paises.put("Fabio Quartararo", "Francia");
        paises.put("Alex Rins", "España");
        paises.put("Francesco Bagnaia", "Italia");
        paises.put("Enea Bastianini", "Italia");
        paises.put("Brad Brinder", "Sudáfrica");
        paises.put("Jack Miller", "Australia");
        paises.put("Aleix Espargaro", "España");
        paises.put("Maverick Viñales", "España");
        paises.put("Jorge Martín", "España");
        paises.put("Franco Morbidelli", "España");
        paises.put("Takaaki Nakagami", "Japón");
        paises.put("Johan Zarco", "Francia");
        paises.put("Augusto Fernández", "España");
        paises.put("Pedro Acosta ", "España");
        paises.put("Marco Bezzecchi", "Italia");
        paises.put("Fabio Di Giannantonio", "Italia");
        paises.put("Marc Márquez ", "España");
        paises.put("Alex Márquez", "España");
        paises.put("Miguel Oliveira", "Portugal");
        paises.put("Raúl Fernández", "España");
        
        HashMap<String, String> equipos = new HashMap<>();
        equipos.put("Joan Mir", "Repsol Honda Team");
        equipos.put("Luca Marini", "Repsol Honda Team");
        equipos.put("Fabio Quartararo", "Yamaha Factory");
        equipos.put("Alex Rins", "Yamaha Factory");
        equipos.put("Francesco Bagnaia", "Ducati Team");
        equipos.put("Enea Bastianini", "Ducati Team");
        equipos.put("Brad Brinder", "Red Bull KTM ");
        equipos.put("Jack Miller", "Red Bull KTM ");
        equipos.put("Aleix Espargaro", "Aprilia Racing");
        equipos.put("Maverick Viñales", "Aprilia Racing");
        equipos.put("Jorge Martín", "Pramac Racing");
        equipos.put("Franco Morbidelli", "Pramac Racing");
        equipos.put("Takaaki Nakagami", "Team LCR");
        equipos.put("Johan Zarco", "Team LCR");
        equipos.put("Augusto Fernández", "GasGas Tech3");
        equipos.put("Pedro Acosta ", "GasGas Tech3");
        equipos.put("Marco Bezzecchi", "Mooney VR46");
        equipos.put("Fabio Di Giannantonio", "Mooney VR46");
        equipos.put("Marc Márquez ", "Gresini Racing");
        equipos.put("Alex Márquez", "Gresini Racing");
        equipos.put("Miguel Oliveira", "Trackhouse");
        equipos.put("Raúl Fernández", "Trackhouse");


        // ¿Cuántos pilotos llevan una determinada moto? Ejemplo:
        // o Honda es llevada por 4 pilotos
        HashMap<String, Integer> motos_cantidad = new HashMap<>();

        for (HashMap.Entry<String, String> recorrer_Datos : datos.entrySet()) {
            String moto = recorrer_Datos.getValue(); // Guardamos moto

            motos_cantidad.put(moto, motos_cantidad.getOrDefault(moto, 0) + 1);
        }

        for (String devolver_motos_cantidad : motos_cantidad.keySet()) {
            System.out.println("La moto " + devolver_motos_cantidad + " es llevada "
                    + motos_cantidad.get(devolver_motos_cantidad) + " veces");
        }

        System.out.println();

        // ¿Qué pilotos llevan cada moto? Ejemplo:
        // o Honda: Joan Mir, Luca Marini,TakaakiNakagami, Johan Zarco
        HashMap<String, StringBuilder> corredores = new HashMap<>();

        for (HashMap.Entry<String, String> recorrer_Datos_segundo : datos.entrySet()) {
            String motero = recorrer_Datos_segundo.getKey(); // Guardamos motero
            String moto = recorrer_Datos_segundo.getValue(); // Guardamos moto
            corredores.computeIfAbsent(moto, k -> new StringBuilder()).append(motero)
                    .append(", ");
        }
        for (HashMap.Entry<String, StringBuilder> devolver_corredores : corredores.entrySet()) {
            System.out.println(devolver_corredores.getKey() + " es llevada por " + devolver_corredores.getValue());

        }
        System.out.println();
        // ¿Cuántos pilotos hay de cada país?
        // o Japón: 1
        HashMap<String, Integer> contamos_paises = new HashMap<>();

        for (HashMap.Entry<String, String> recorrer_Paises : paises.entrySet()) {
            String pais = recorrer_Paises.getValue(); // Pais
            contamos_paises.put(pais, contamos_paises.getOrDefault(pais, 0) + 1);
        }
        for (HashMap.Entry<String, Integer> devolver_paises : contamos_paises.entrySet()) {
            System.out.println(devolver_paises.getKey()+": "+devolver_paises.getValue());
        }

        System.out.println();
        //  Pilotos en cada equipo. 
        // Ejemplo: Team LCR: TakaakiNakagami, Johan Zarco
        HashMap<String, StringBuilder> contamos_equipos = new HashMap<>();

        for (HashMap.Entry<String, String> recorrer_equipos : equipos.entrySet()) {
            String equipo = recorrer_equipos.getValue(); // Recuperamos equipo
            String motero = recorrer_equipos.getKey(); // Recuperamos motero
            contamos_equipos.computeIfAbsent(equipo, k -> new StringBuilder()).append(motero)
            .append(", "); // Editar el String y se añaden los pilotos
        }
        for (HashMap.Entry<String, StringBuilder> devolver_equipos : contamos_equipos.entrySet()) {
            System.out.println(devolver_equipos.getKey() + ": " + devolver_equipos.getValue());
        }

        System.out.println();
        // Número total de pilotos
        int pilotos_totales = datos.size();
        System.out.println("Hay en total: "+pilotos_totales+" pilotos.");
    }
}
