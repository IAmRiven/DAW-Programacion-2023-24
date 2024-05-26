public class desafio5_3 {
    public static void main(String[] args) {
        int numeros[] = { 4, 5, 6, 7, 3, 4, 2 };
        Numeros(numeros);
    }

    public static void Numeros(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
        }
    }

    public static void mostrarforeach(int numeros[]) {
        for (int i : numeros) {
            System.out.println(i);
        }
    }

    public static void mostrarElementos(int[] numbers) {
        String salida = "";
        for (int number : numbers) {
            salida += number + ", ";
        }
        System.out.println(salida.substring(0, salida.length() - 2));
    }
}

// Create an array with 7 elements.
// Create a function to show all the elements on screen by using the loop for
// (use both ways of looping with for seen on class).