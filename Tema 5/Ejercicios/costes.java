import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class costes {

    public class escribir {
        private static Scanner scanner = new Scanner(System.in);

        private escribir() {
        }

        public static String nextLine() {
            return scanner.nextLine();
        }

        public static String next() {
            return scanner.next();
        }

        public static int nextInt() {
            return scanner.nextInt();
        }

        public static double nextDouble() {
            return scanner.nextDouble();
        }

        public static float nextFloat() {
            return scanner.nextFloat();
        }

        public static void close() {
            scanner.close();
        }
    }

    public static class Joya {
        private List<Float> preciosPorNivel;
        private List<Integer> cronsPorNivel;

        public Joya(List<Float> preciosPorNivel, List<Integer> cronsPorNivel) {
            this.preciosPorNivel = preciosPorNivel;
            this.cronsPorNivel = cronsPorNivel;
        }
    }

    public static void main(String[] args) {

        menu_principal();

    }

    public static void menu_principal() {

        System.out.println();
        System.out.println("\u002E"+ "(1)Simular joyeria • (2)Cerrar programa");
        System.out.println();

        System.out.print("¿Que quieres hacer?: ");
        int input = escribir.nextInt();

        if (input == 1) {
            menu_segundo();
        } else {
            System.out.println();
            System.out.println("Has cerrado el programa con éxito");
            System.exit(input);
            System.out.println();
        }

    }

    public static void menu_segundo() {
        System.out.println();
        System.out.println("• (1)Anillos • (2)Colgantes • (3)Pendientes • (4)Cinturones • (5)Volver atrás");
        System.out.println();
        System.out.print("¿Qué joyería quieres encantar?: ");
        String tipo_objeto = escribir.next().toLowerCase();

        if (tipo_objeto.equals("anillos") || tipo_objeto.equals("1")) {
            System.out.println();
            System.out.println("Has seleccionado anillos.");
            menu_tipo_anillos(tipo_objeto);
        } else if (tipo_objeto.equals("colgantes") || tipo_objeto.equals("2")) {
            System.out.println();
            System.out.println("Has seleccionado colgantes.");
            menu_tipo_colgantes(tipo_objeto);
        } else if (tipo_objeto.equals("pendientes") || tipo_objeto.equals("3")) {
            System.out.println(tipo_objeto);
            System.out.println("Has seleccionado pendientes.");
            menu_tipo_pendientes(tipo_objeto);
        } else if (tipo_objeto.equals("cinturones") || tipo_objeto.equals("4")) {
            System.out.println();
            System.out.println("Has seleccionado cinturones.");
            menu_tipo_cinturones(tipo_objeto);
        } else if (tipo_objeto.equals("Volver atras") || tipo_objeto.equals("Volver") || tipo_objeto.equals("5")) {
            System.out.println();
            System.out.println("Has vuelto al menú principal.");
            menu_principal();
        }
    }

    public static void menu_tipo_anillos(String tipo_objeto) {
        System.out.println();
        System.out.println("Tipo de anillos");
        System.out.println();
        System.out.println("• (1)Anillo de Tungrad");
        System.out.println("• (2)Anillo de manos");
        System.out.println("• (3)Anillo vil");
        System.out.println("• (4)Ojo de la ruina");
        System.out.println("• (5)Anillo de guardián de medialuna");
        System.out.println("• (6)Anillo de guardián Cadry");
        System.out.println("• (7)Anillo ronaros");
        System.out.println("• (8)Volver al menú principal");
        System.out.println();
        System.out.print("¿Que joyería quieres escoger?: ");
        String item = escribir.next().toLowerCase();

        if (item.equals("tungrad") || item.equals("1")) {
            System.out.println();
            menu_elegir_nivel("anillotungrad");
        } else if (item.equals("vil") || item.equals("2")) {
            System.out.println();
            menu_elegir_nivel("vil");
        } else if (item.equals("ruina") || item.equals("3")) {
            System.out.println();
            menu_elegir_nivel("ruina");
        } else if (item.equals("medialuna") || item.equals("4")) {
            System.out.println();
            menu_elegir_nivel("medialuna");
        } else if (item.equals("cadry") || item.equals("5")) {
            System.out.println();
            menu_elegir_nivel("cadry");
        } else if (item.equals("medialuna") || item.equals("6")) {
            System.out.println();
            menu_elegir_nivel("medialuna");
        } else if (item.equals("ronaros") || item.equals("7")) {
            System.out.println();
            menu_elegir_nivel("ronaros");
        } else if (item.equals("Volver atras") || item.equals("Volver")
                || item.equals("8")) {
            System.out.println();
            System.out.println("Has vuelto atrás.");
            menu_principal();
        }
    }

    public static void menu_tipo_colgantes(String tipo_objeto) {
        System.out.println();
        System.out.println("Tipo de colgantes");
        System.out.println();
        System.out.println("• (1)Collar de Deboreka");
        System.out.println("• (2)Collar de manos");
        System.out.println("• (3)Colgante de luna renacida");
        System.out.println("• (4)Colgante de Tungrad");
        System.out.println("• (5)Anillo de ogro");
        System.out.println("• (6)Piedra de poder de Laytenn");
        System.out.println("• (7)Colgante de río renacido");
        System.out.println("• (8)Colgante de Serap");
        System.out.println("• (9)Colgante de Sicil");
        System.out.println("• (10)Volver al menú principal");
        System.out.println();
        System.out.print("¿Que joyería quieres escoger?: ");
        String item = escribir.next().toLowerCase();

        if (item.equals("deboreka") || item.equals("1")) {
            System.out.println();
            menu_elegir_nivel("deboreka");
        } else if (item.equals("manos") || item.equals("2")) {
            System.out.println();
            menu_elegir_nivel("manos");
        } else if (item.equals("luna renacida") || item.equals("3")) {
            System.out.println();
            menu_elegir_nivel("luna renacida");
        } else if (item.equals("tungrad") || item.equals("4")) {
            System.out.println();
            menu_elegir_nivel("tungrad");
        } else if (item.equals("ogro") || item.equals("5")) {
            System.out.println();
            menu_elegir_nivel("ogro");
        } else if (item.equals("poder de laytenn") || item.equals("6")) {
            System.out.println();
            menu_elegir_nivel("poder de laytenn");
        } else if (item.equals("río renacido") || item.equals("7")) {
            System.out.println();
            menu_elegir_nivel("río renacido");
        } else if (item.equals("serap") || item.equals("8")) {
            System.out.println();
            menu_elegir_nivel("serap");
        } else if (item.equals("sicil") || item.equals("9")) {
            System.out.println();
            menu_elegir_nivel("sicil");
        } else if (item.equals("Volver atras") || item.equals("Volver")
                || item.equals("10")) {
            System.out.println();
            System.out.println("Has vuelto atrás.");
            menu_principal();
        }
    }

    public static void menu_tipo_pendientes(String tipo_objeto) {
        System.out.println();
        System.out.println("Tipo de pendientes");
        System.out.println();
        System.out.println("• (1)Pendiente de Deboreka");
        System.out.println("• (2)Pendiente de la distorsión");
        System.out.println("• (3)Pendiente del alba");
        System.out.println("• (4)Alba de Vaha");
        System.out.println("• (5)Pendiente de Manos");
        System.out.println("• (6)Pendiente de Tungrad");
        System.out.println("• (7)Pendiente etéreo");
        System.out.println("• (8)Pendiente de Naak");
        System.out.println("• (9)Volver al menú principal");
        System.out.println();
        System.out.print("¿Que joyería quieres escoger?: ");
        String item = escribir.next().toLowerCase();

        if (item.equals("deboreka") || item.equals("1")) {
            System.out.println();
            menu_elegir_nivel("deboreka");
        } else if (item.equals("distorsion") || item.equals("2")) {
            System.out.println();
            menu_elegir_nivel("distorsion");
        } else if (item.equals("alba") || item.equals("3")) {
            System.out.println();
            menu_elegir_nivel("alba");
        } else if (item.equals("vaha") || item.equals("4")) {
            System.out.println();
            menu_elegir_nivel("vaha");
        } else if (item.equals("manos") || item.equals("5")) {
            System.out.println();
            menu_elegir_nivel("manos");
        } else if (item.equals("tungrad") || item.equals("6")) {
            System.out.println();
            menu_elegir_nivel("tungrad");
        } else if (item.equals("etéreo") || item.equals("7")) {
            System.out.println();
            menu_elegir_nivel("etéreo");
        } else if (item.equals("naak") || item.equals("8")) {
            System.out.println();
            menu_elegir_nivel("naak");
        } else if (item.equals("Volver atras") || item.equals("Volver")
                || item.equals("9")) {
            System.out.println();
            System.out.println("Has vuelto atrás.");
            menu_principal();
        }
    }

    public static void menu_tipo_cinturones(String tipo_objeto) {
        System.out.println();
        System.out.println("Tipo de cinturones");
        System.out.println();
        System.out.println("• (1)Cinturón de Deboreka");
        System.out.println("• (2)Cinturón de Taebaek");
        System.out.println("• (3)Cinturón de Manos");
        System.out.println("• (4)Cinturón de turo");
        System.out.println("• (5)Cinturón de Tungrad");
        System.out.println("• (6)Cinturón de basilisco");
        System.out.println("• (7)Cinturón de Orkinrad");
        System.out.println("• (8)Cinturón de centauro");
        System.out.println("• (9)Volver al menú principal");
        System.out.println();
        System.out.print("¿Que joyería quieres escoger?: ");
        String item = escribir.next().toLowerCase();

        if (item.equals("deboreka") || item.equals("1")) {
            System.out.println();
            menu_elegir_nivel("deboreka");
        } else if (item.equals("taebaek") || item.equals("2")) {
            System.out.println();
            menu_elegir_nivel("taebaek");
        } else if (item.equals("manos") || item.equals("3")) {
            System.out.println();
            menu_elegir_nivel("manos");
        } else if (item.equals("turo") || item.equals("4")) {
            System.out.println();
            menu_elegir_nivel("turo");
        } else if (item.equals("tungrad") || item.equals("5")) {
            System.out.println();
            menu_elegir_nivel("tungrad");
        } else if (item.equals("basilisco") || item.equals("6")) {
            System.out.println();
            menu_elegir_nivel("basilisco");
        } else if (item.equals("orkinrad") || item.equals("7")) {
            System.out.println();
            menu_elegir_nivel("orkinrad");
        } else if (item.equals("centauro") || item.equals("8")) {
            System.out.println();
            menu_elegir_nivel("centauro");
        } else if (item.equals("Volver atras") || item.equals("Volver")
                || item.equals("9")) {
            System.out.println();
            System.out.println("Has vuelto atrás.");
            menu_principal();
        }
    }

    public static void menu_elegir_nivel(String item) {
        System.out.println("• (1)PRI • (2)DUO • (3)TRI • (4)TET • (5)PEN • (6)Volver atrás");
        System.out.println();
        System.out.print("¿A que nivel quieres encantar?: ");
        String nivel = escribir.next().toLowerCase();

        if (nivel.equals("pri") || nivel.equals("1")) {
            System.out.println();
            menu_crons("pri", item);
        } else if (nivel.equals("duo") || nivel.equals("2")) {
            System.out.println();
            menu_crons("duo", item);
        } else if (nivel.equals("tri") || nivel.equals("3")) {
            System.out.println();
            menu_crons("tri", item);
        } else if (nivel.equals("tet") || nivel.equals("4")) {
            System.out.println();
            menu_crons("tet", item);
        } else if (nivel.equals("pen") || nivel.equals("5")) {
            System.out.println();
            menu_crons("pen", item);
        } else if (nivel.equals("Volver atras") || nivel.equals("Volver") || nivel.equals("6")) {
            System.out.println();
            System.out.println("Has vuelto atrás.");
            menu_segundo();
        }
    }

    public static void menu_crons(String nivel, String item) {
        System.out.println("• (1)Utilizar cronilitas • (2)No utilizar cronilitas • (3)Volver menú principal");
        System.out.println();
        System.out.print("¿Quieres utilizar cronilitas?: ");
        String input = escribir.next().toLowerCase();
        boolean crons = false;
        if (input.equals("si") || input.equals("1")) {
            System.out.println();
            crons = true;
            pedir_fallo(nivel, item, crons);
        } else if (input.equals("no") || input.equals("2")) {
            System.out.println();
            pedir_fallo(nivel, item, crons);
        } else if (input.equals("Volver atras") || input.equals("Volver") || input.equals("3")) {
            System.out.println();
            System.out.println("Has vuelto atrás.");
            menu_principal();
        }
    }

    public static void pedir_fallo(String nivel, String item, boolean crons) {
        System.out.print("¿Qué porcentaje tienes? (2)Volver menú principal: ");
        double fallo = escribir.nextDouble() / 100;
        if (fallo == 2) {
            System.out.println();
            System.out.println("Has vuelto atrás.");
        }
        System.out.println();
        calcular(nivel, item, crons, fallo);
    }

    public static void calcular(String nivel, String item, boolean crons, double fallo) {

        Map<String, Joya> joyas = get_map_joyeria();

        int precio_crons = 3;
        Joya joya = joyas.get(item);
        double coste_medio = 0;
        double num_intentos = 0;

        if (crons) {

            if (nivel.equals("pri") || nivel.equals("1")) {

            } else if (nivel.equals("duo") || nivel.equals("2")) {

                num_intentos = 1 / fallo;

            } else if (nivel.equals("tri") || nivel.equals("3")) {

                num_intentos = 1 / fallo;

            } else if (nivel.equals("tet") || nivel.equals("4")) {

                num_intentos = 1 / fallo;

            } else {

                num_intentos = 1 / fallo;

            }
        } else {

            if (nivel.equals("pri") || nivel.equals("1")) {

                num_intentos = 1 / fallo;
                coste_medio = (joya.preciosPorNivel.get(0) * 2) / fallo;

            } else if (nivel.equals("duo") || nivel.equals("2")) {

                num_intentos = 1 / fallo;

            } else if (nivel.equals("tri") || nivel.equals("3")) {

                num_intentos = 1 / fallo;

            } else if (nivel.equals("tet") || nivel.equals("4")) {

                num_intentos = 1 / fallo;

            } else {

                num_intentos = 1 / fallo;

            }

        }

        System.out.println("El coste medio para subir la joya es de " + coste_medio + " de plata.");
        System.out.println("El coste medio de intentos para subir la joya es de " + num_intentos);
        System.out.println("¿Quieres volver al menú de selección de joyas?");
        String eleccion = escribir.next().toLowerCase();

        if (eleccion.equals("si")) {
            menu_segundo();
        } else {
            System.exit(precio_crons);
        }

    }

    public static Map<String, Joya> get_map_joyeria() {
        Map<String, Joya> joyas = new HashMap<>();
        joyas.put("anillotungrad", new Joya(
                Arrays.asList(825f, 2470f, 7400f, 20600f, 95000f, 300000f),
                Arrays.asList(0, 285, 865, 2405, 11548)));
        joyas.put("Deboreka", new Joya(
                Arrays.asList(825f, 2470f, 7400f, 20600f, 95000f, 300000f),
                Arrays.asList(0, 285, 865, 2405, 11548)));
        return joyas;

    }
}