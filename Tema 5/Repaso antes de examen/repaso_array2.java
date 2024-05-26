import java.util.Arrays;

public class repaso_array2 {
    public static void main(String[] args) {
        int longitud = pedirLongitud();
        int lista_numeros[] = new int[longitud];
        for (int i = 0; i < lista_numeros.length; i++) {
            lista_numeros[i] = pedirNumeros(lista_numeros, longitud);
        }
        System.out.println("Lista original: " + Arrays.toString(lista_numeros));
        System.out.println("Array invertida: " + Arrays.toString(invertirArray(lista_numeros)));
    }

    public static int pedirLongitud() {
        System.out.println("¿Cuantos numeros quieres introducir?");
        int longitud = Teclado.teclado.nextInt();
        return longitud;
    }

    public static int pedirNumeros(int lista_numeros[], int longitud) {
        int numero;
        do {
            System.out.println("¿Qué numero quieres añadir a la lista?");
            numero = Teclado.teclado.nextInt();

        } while (lista_numeros.length < longitud);
        return numero;
    }

    public static int[] invertirArray(int lista_numeros[]) {
        int lista_alreves[] = new int[lista_numeros.length];
        int longitud = lista_alreves.length;

        for (int i = 0; i < lista_alreves.length; i++) {
            lista_alreves[longitud - i - 1] = lista_numeros[i];
        }

        return lista_alreves;

    }
}

// 2. Escribir un programa que solicite al usuario cuántos números
// desea introducir. A continuación, introducir por teclado esa cantidad
// de números enteros, y por último, mostrar en el orden inverso al introducido.