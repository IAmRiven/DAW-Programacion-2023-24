
import java.util.HashSet;

public class desafio5_15 {
    public static void main(String[] args) {

        int numeros[] = { 1, 4, 3, 5, 7, 3, 9, 4, 10, 9, };

        duplicados(numeros);
        
    }

    public static void duplicados(int numeros[]) {
        HashSet<Integer> numeroshash = new HashSet<>();

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[i] == numeros[j]) {
                    numeroshash.add(numeros[i]);
                    break;
                }
                
            }
        }
        System.out.println("Lista de numeros duplicados: "+numeroshash);
    }

}
