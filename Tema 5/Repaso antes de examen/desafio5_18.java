import java.util.HashMap;

public class desafio5_18 {
    public static void main(String[] args) {
        int numeros[] = { 1, 1, 1, 1, 1, 1, 2, 3, 3, 4, 5, 6, 10, 10, 12, 12, 12 };
        HashMap<Integer, Integer> numeros_cantidad = new HashMap<>();
        for (int recorrer_numeros : numeros) {
            numeros_cantidad.put(recorrer_numeros, numeros_cantidad.getOrDefault(recorrer_numeros, 0) + 1);
        }
        for (HashMap.Entry<Integer, Integer> recorrer_numeros_cantidad : numeros_cantidad.entrySet()) {
            System.out.println(
                    "El numero " + recorrer_numeros_cantidad.getKey() + " se repite "
                            + recorrer_numeros_cantidad.getValue()
                            + " veces");
        }
    }
}
// Take the exercise 5_15 and modify it to count how many times is duplicated
// each element.