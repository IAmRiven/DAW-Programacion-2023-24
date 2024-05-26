import java.util.ArrayList;
import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        boolean salir = false;
        do {
            System.out.print("Dime un numero: ");
            int numero = teclado.nextInt();
            if (numero <= -2) {
                System.out.println("No se pueden añadir numeros negativos.");
            } else if(numero == -1) {
                salir = true;
            } else {
                numeros.add(numero);
            }
            teclado.close();
            
        } while (!salir);
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        for (int dividir : numeros) {
            if (dividir % 2 == 0) {
                pares.add(dividir);
            } else {
                impares.add(dividir);
            }
        }
        System.out.println("Los numeros pares son: "+pares.toString());
        System.out.println("Los numeros impares son: "+impares.toString());
        
    }
}

// 2.	Leer y almacenar n números enteros en una tabla, a 
// partir de la cual se construirán otras dos tablas con 
// los elementos con los valores pares e impares Diseña 
// la primera, respectivamente. Las tablas pares e impares
//  deben mostrarse ordenadas.