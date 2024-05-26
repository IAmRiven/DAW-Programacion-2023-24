public class desafio5_6a {
    public static void main(String[] args) {
        int numeros[] = desafio5_3.rellenarArray(5);
        int numeros_duplicado[] = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            numeros_duplicado[i] = numeros[i];
        }
        desafio5_3.enseñarArray(numeros);
        desafio5_3.enseñarArray(numeros_duplicado);
    }
}
