public class desafio5_3 {
    public static void main(String[] args) {
        int numeros[] = rellenarArray(7); // El 7 es el tamaño del array
        enseñarArray(numeros);
    }

    public static void enseñarArray(int numeros[]) {
        String array_sin_coma = "";
        for (int i = 0; i < numeros.length; i++) {
            array_sin_coma += numeros[i] + ", ";
        }
        System.out.println("El array es: " + array_sin_coma.substring(0, array_sin_coma.length() - 2));
    }

    public static int[] rellenarArray(int longitud) {
        int lista_de_numeros[] = new int[longitud];
        int numero_random;
        for (int i = 0; i < lista_de_numeros.length; i++) {
            numero_random = (int) (Math.random() * 100) + 1;
            lista_de_numeros[i] = numero_random;
        }
        return lista_de_numeros;
    }
}
