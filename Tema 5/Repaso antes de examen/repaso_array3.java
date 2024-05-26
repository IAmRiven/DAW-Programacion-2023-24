public class repaso_array3 {
    public static void main(String[] args) {
        int longitud = pedirLongitud();
        int numeros[] = new int[longitud];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = pedirNumero(numeros, longitud);
        }
        System.out.println("El máximo del Array es: " + comprobarMaximo(numeros));
    }

    public static int pedirLongitud() {
        System.out.println("¿De que tamaño quieres el array?");
        int longitud = Teclado.teclado.nextInt();
        return longitud;
    }

    public static int pedirNumero(int numeros[], int longitud) {
        int numero;
        do {
            System.out.println("¿Que numero quieres añadir al array?");
            numero = Teclado.teclado.nextInt();
        } while (numeros.length < longitud);
        return numero;
    }

    public static int comprobarMaximo(int numeros[]) {
        int maximo = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        return maximo;
    }
}

// 3. Diseñar una función: int máximo (intt[]),
// que devuelva el máximo valor contenido en una tabla.