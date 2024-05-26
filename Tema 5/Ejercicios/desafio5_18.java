import java.util.HashMap;
import java.util.HashSet;

public class desafio5_18 {

    public static void main(String[] args) {

        int numeros[] = { 1, 4, 3, 5, 7, 3, 9, 4, 10, 9, 9, 9, 3, 3, 3 };
        System.out.println("La array es: " + numeros);

        duplicados(numeros);

    }

    public static void duplicados(int numeros[]) {
        HashSet<Integer> numeroshashset = new HashSet<>();

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[i] == numeros[j]) {
                    numeroshashset.add(numeros[i]);
                    break;
                }

            }
        }

        System.out.println("La array duplicada es: " + numeroshashset);

        int ocurrencias = 0;
        HashMap<Integer, Integer> numeroshashmap = new HashMap<>();
        for (Integer claves : numeroshashset) {
            for (int index = 0; index < numeros.length; index++) {
                if (numeros[index] == claves) {
                    ocurrencias++;
                }
            }
            numeroshashmap.put(claves, ocurrencias);
            ocurrencias = 0;
        }
        for (Integer keys : numeroshashmap.keySet()) {
            System.out.println("El numero " + keys + " se repite "+numeroshashmap.get(keys));
        }
    }

}
