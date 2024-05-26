public class desafio5_8 {
    public static void main(String[] args) {
        int numeros[] = { 1, 4, 3, 5, 7, 3, 9, 4, 10, 9, };

        checkDuplicates(numeros);
    }

    public static void checkDuplicates(int numeros[]) {

        boolean haydulicado = false;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[i] == numeros[j]) {
                    System.out.println("El numero "+numeros[j]+" está duplicado.");
                    haydulicado = true;
                } 
            
            }
        }

        if (haydulicado == false) {
            System.out.println("No se han encontrado duplicados.");
        }
        
    }
}
