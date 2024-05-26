import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class repasoColecciones_clases {
    String nombre;
    int year;
    ArrayList<Piloto> pilotos = new ArrayList<>();

    public repasoColecciones_clases(String nombre, int year) {
        this.nombre = nombre;
        this.year = year;
    }

    public void cargarPilotos(String ruta) {
        try {
            File file = new File(ruta);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String linea = sc.nextLine().trim();
                Scanner sc2 = new Scanner(linea);
                sc2.useDelimiter(";");
                String nombre = sc2.next();
                String equipo = sc2.next();
                String moto = sc2.next();
                String pais = sc2.next();
                sc2.close();
                Piloto piloto = new Piloto(nombre, equipo, moto, pais);
                pilotos.add(piloto);

            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al cargar el archivo.");
            e.printStackTrace();

        }
    }

    public void imprimirPilotos() {
        for (Piloto piloto : pilotos) {
            System.out.println(piloto.nombre + ";" + piloto.equipo + ";" + piloto.moto + ";" + piloto.pais);

        }
    }

    public int numeroPilotosxPais(String pais) {
        int contador = 0;
        for (Piloto piloto : pilotos) {
            if (piloto.pais.equals(pais)) {
                contador++;
            }
        }
        return contador;
    }

    public StringBuilder pilotosxPais(String pais) {
        StringBuilder pilotos = new StringBuilder();
        for (Piloto piloto : this.pilotos) {
            if (piloto.pais.equals(pais)) {
                pilotos.append(piloto.nombre).append(",");
            }
        }
        return pilotos;

    }

    public int numeroPilotosxMoto(String moto) {
        int contador = 0;
        for (Piloto piloto : pilotos) {
            if (piloto.moto.equals(moto)) {
                contador++;
            }
        }
        return contador;
    }

    public StringBuilder pilotosxMoto(String moto) {
        StringBuilder pilotos = new StringBuilder();
        for (Piloto piloto : this.pilotos) {
            if (piloto.moto.equals(moto)) {
                pilotos.append(piloto.nombre).append(",");
            }
        }
        return pilotos;

    }

    public static void menuImprimir() {
        System.out.println("******* MENU DE LA TEMPORADA *******");
        System.out.println("1 - Imprimir los pilotos");
        System.out.println("2 - Imprimir pilotos por moto.");
        System.out.println("3 - Imprimir motos por piloto.");
        System.out.println("4 - Imprimir paises");
        System.out.println("5 - Imrpimir equipos + corredores.");
        System.out.println("6 - Salir");
        System.out.println("*************************************");
    }

    public static void main(String[] args) {
        repasoColecciones_clases temporada2024 = new repasoColecciones_clases("MotoGP", 2024);
        temporada2024.cargarPilotos("E:\\datos_pilotos.txt");
        Scanner teclado = new Scanner(System.in);
        int contador = 0;

        while (true) {
            menuImprimir();
            System.out.print("¿Qué necesitas hacer? ");
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    temporada2024.imprimirPilotos();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("¿Que moto quieres saber los pilotos?");
                    String moto_opcion = teclado.next();
                    temporada2024.numeroPilotosxMoto(moto_opcion);
                default:
                    System.out.println("No existe esa opción.");
            }
        }

        

        // //temporada2024.imprimirPilotos();
        // System.out.println("*******"+temporada2024.nombre+temporada2024.year+"**********************");
        // System.out.println("Honda es llevada por:
        // "+temporada2024.numeroPilotosxMoto("Honda"));
        // System.out.println("Ducati es llevada por:
        // "+temporada2024.numeroPilotosxMoto("Ducati"));
        // System.out.println("Yamaha es llevada por:
        // "+temporada2024.numeroPilotosxMoto("Yamaha"));
        // System.out.println("KTM es llevada por:
        // "+temporada2024.numeroPilotosxMoto("KTM"));
        // System.out.println("Aprilia es llevada por:
        // "+temporada2024.numeroPilotosxMoto("Aprilia"));

        // System.out.println("Pilotos Honda: "+temporada2024.pilotosxMoto("Honda"));
        // System.out.println("Pilotos Yamaha: "+temporada2024.pilotosxMoto("Yamaha"));

        // System.out.println("España tiene:
        // "+temporada2024.numeroPilotosxPais("España"));

        // System.out.println("Pilotos España: "+temporada2024.pilotosxPais("España"));

        // System.out.println("Número total de pilotos: "+temporada2024.pilotos.size());
    }

}