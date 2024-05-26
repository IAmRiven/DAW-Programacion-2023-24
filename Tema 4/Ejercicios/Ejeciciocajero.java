import java.util.Scanner;

public class Ejeciciocajero {
public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int saldo = 100;
    String eleccion = "";
    int ingresado = 0;
    int sacar = 0;
    int intentos = 0;

    do {
        // Menú del cajero
        System.out.println("****** Cajero automático ******");
        System.out.println("Opción A - Ingresar dinero.");
        System.out.println("Opción B - Sacar dinero.");
        System.out.println("Opción C - Consultar dinero.");
        System.out.println("Opción D - Cancelar.");
        System.out.println("***************************");
        eleccion = keyboard.next().toLowerCase();

        if (eleccion.charAt(0) == 'a') {
            System.out.println("¿Cuanto quieres ingresar?");
            ingresado = keyboard.nextInt();
            saldo = Ingresar(ingresado, saldo);
            System.out.println("Tu nuevo saldo es: "+saldo);
        } else if (eleccion.charAt(0) == 'b') {
            if (saldo == 0) {
                System.out.println("No dispones de saldo para poder sacar.");
            } else {
                System.out.println("¿Cuanto dinero quieres sacar?");
                sacar = keyboard.nextInt();
                if (sacar > saldo) {
                    System.out.println("No tienes suficiente saldo");
                } else {
                saldo = Sacar(saldo, sacar);
                System.out.println("Tu nuevo saldo es: "+saldo);
                }
            }
        } else if (eleccion.charAt(0) == 'c') {
            Consultar(saldo);              
        } else if (eleccion.charAt(0) == 'd') {
            System.exit(intentos);
        } else {
            System.out.println("Opción inválida");
            intentos++;
        }

    } while (intentos < 5);


    keyboard.close();
}

    public static void Consultar(int saldo) {
        System.out.println("Tu nuevo saldo es: "+saldo);
    }

    public static int Sacar(int sacar, int saldo) {
        return(sacar - saldo);
    }
        
    public static int Ingresar(int ingresado, int saldo) {
        return(ingresado + saldo);
    }
}

// Hacer un menú (Cajero) con 4 opciones, Ingresar, Sacar, Consulta, salir
// Hacer las opciones con funciones.