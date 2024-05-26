import java.util.ArrayList;

public class camarasecreta {
    /**
     * Función principal donde recuperaremos el Arraylist completado.
     */
    public static void main(String[] args) {
        int longitud = pedirLongitud();
        boolean salir = false;

        ArrayList<Integer> combinacion_secreta = generarCombinacion(longitud);
        ArrayList<Integer> intento;
        ;
        do {
            intento = pedirNumeros(combinacion_secreta);
            if (combinacion_secreta.equals(intento)) {
                salir = true;
            } else {
                System.out.println("Intento" + intento);
                System.out.println("Combinación_secreta" + combinacion_secreta);
                System.out.println("Pista" + comprobarIntento(combinacion_secreta, longitud, intento));
            }

        } while (!salir);
        System.out.println("Has acertado todas, la combinación era: " + combinacion_secreta);

    }

    /**
     * Función donde hacemos el arraylist y generamos los numeros pasandole la
     * longitud
     * desde el Main.
     * 
     * @return combinacion_secreta El arraylist de los numeros con la longitud
     *         elegida.
     */
    public static ArrayList<Integer> generarCombinacion(int longitud) {
        ArrayList<Integer> combinacion_secreta = new ArrayList<>();
        for (int i = 0; i < longitud; i++) {
            combinacion_secreta.add((int) (Math.random() * 5) + 1);
        }

        // System.out.println(combinacion_secreta); // Linea para comprobar
        // combinacion_secreta
        return combinacion_secreta;
    }

    /**
     * Función para pedir la longitud del ArrayList (en su defecto, el tamaño de la
     * combinación)
     * 
     * @return longitud Tamaño de la combinación.
     */
    public static int pedirLongitud() {
        System.out.println("¿Que longitud quieres de la combinacion?");
        return teclado.teclado.nextInt();
    }

    /**
     * @param combinacion_secreta El Arraylist con la combinación correcto
     * @return ArrayList<Integer> Devuelve los numeros que ha elegido el usuario.
     */
    public static ArrayList<Integer> pedirNumeros(ArrayList<Integer> combinacion_secreta) {
        ArrayList<Integer> intento = new ArrayList<>();
        int longitud_intentos = 0;
        int numero_intento;
        while (combinacion_secreta.size() > longitud_intentos) {
            System.out.println("Qué numero quieres añadir al intento?");
            numero_intento = teclado.teclado.nextInt();
            intento.add(numero_intento);
            longitud_intentos++;
        }
        return intento;
    }

    /**
     * @param combinacion_secreta ArrayList con la combinación secreta
     * @param longitud            Tamaño del Arraylist de combinación secreta
     * @param intento             Numeros que ha introducido el usuario por teclado
     * @return String Recupera el Arraylist de final_intento indicando si los ha
     *         acertado, si son mayor o menor.
     */
    public static String comprobarIntento(ArrayList<Integer> combinacion_secreta, int longitud,
            ArrayList<Integer> intento) {
        ArrayList<String> final_intento = new ArrayList<>(longitud);
        for (int i = 0; i < combinacion_secreta.size(); i++) {
            if (intento.get(i) > combinacion_secreta.get(i)) {
                final_intento.add("menor");
            } else if (intento.get(i) < combinacion_secreta.get(i)) {
                final_intento.add("mayor");
            } else {
                final_intento.add("igual");
            }

        }

        return final_intento.toString();

    }
}

// 10. Desarrollar el juego “la cámara secreta”, que consiste
// en abrir una cámara mediante su combinación secreta, que
// está formada por una combinación de dígitos del uno al cinco.
// El jugador especificará cuál es la longitud de la combinación;
// a mayor longitud, mayor será la dificultad del juego. La
// aplicación genera, de forma aleatoria, una combinación secreta
// que el usuario tendrá que acertar. En cada intento se muestra
// como pista, para cada dígito de la combinación introducido
// por el jugador, si es mayor, menor o igual que el correspondiente
// de la combinación secreta.
// 3
// Combinación_secreta[4,7,9]
// Intento[5,6,9]
// Pista[menor,mayor,igual]
