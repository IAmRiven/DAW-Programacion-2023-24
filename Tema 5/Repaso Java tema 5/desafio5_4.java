public class desafio5_4 {
    public static void main(String[] args) {
        int numero_random = (int) (Math.random() * 7);
        String dias_de_la_semana[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

        System.out.println("Hoy es " + (numero_random + 1) + " corresponde a " + dias_de_la_semana[numero_random]);
    }
}

// Generate a random number between 1 and 7. Create a function that returns the
// day of the week
// in letter (corresponding 1 to Monday and 7 to Sunday).
// Show on screen: Today is 5 corresponding to Friday.
// To make it easier, create an array with the names of the days of the week:
// Monday, Tuesday…
// Once you have the number from 1 to 7, pick from the array the right day of
// the week.