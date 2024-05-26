public class desafio5_5 {
    public static void main(String[] args) {
        int numeros[] = { 1, 8, 5, 3, 6, 9 };
        System.out.println("¿Qué numero quieres comprobar?");
        int numero_elegido = Teclado.teclado.nextInt();
        int posicion = comprobarNumero(numeros, numero_elegido);

        System.out.println("La posición de " + numero_elegido + " es " + posicion);

    }

    public static int comprobarNumero(int numeros[], int numero_elegido) {
        int posicion = -1;
        for (int i = 0; i < numeros.length && posicion == -1; i++) {
            if (numero_elegido == numeros[i]) {
                posicion = i;
            }
        }
        return posicion;
    }
}
