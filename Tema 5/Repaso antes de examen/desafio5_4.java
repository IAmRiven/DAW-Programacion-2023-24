public class desafio5_4 {

    public static void main(String[] args) {
        String dias_de_la_semana[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
        System.out.print("Dime un numero (1 al 7): ");
        int opcion = Teclado.teclado.nextInt();
        System.out.println("Ese numero corresponde a " + dias_de_la_semana[opcion - 1]);
    }
}
