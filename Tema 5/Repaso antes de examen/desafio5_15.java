import java.util.HashSet;

public class desafio5_15 {
    public static void main(String[] args) {
        int numeros[] = { 1, 2, 3, 3, 4, 5, 6, 10, 10, 12, 12, 12 };

        // desafio5_8.comprobarDuplicados(numeros); código a modificar.

        HashSet<Integer> numeros_duplicados = new HashSet<>();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    numeros_duplicados.add(numeros[i]);
                    break;
                }

            }
        }
        System.out.println("La lista de numeros duplicados es: " + numeros_duplicados);
    }
}

// Take the challenge “5_8 Look for duplicates of an array” and
// fix it so that it doesn’t show twice (or more time) each number
// that is duplicated.
//
// Acepta el desafío “5_8 Buscar duplicados de una matriz” y
// arreglarlo para que no se muestre dos veces (o más veces) cada número
// eso está duplicado.