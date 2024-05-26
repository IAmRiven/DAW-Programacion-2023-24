public class desafio5_6b {
    public static void main(String[] args) {
        int numeros[] = desafio5_3.rellenarArray(5);
        int numeros_duplicado_reversa[] = new int[numeros.length];
        int longitud = numeros.length;

        for (int i = 0; i < numeros_duplicado_reversa.length; i++) {
            numeros_duplicado_reversa[longitud - i - 1] = numeros[i];
        }

        desafio5_3.enseñarArray(numeros);
        desafio5_3.enseñarArray(numeros_duplicado_reversa);
    }
}
