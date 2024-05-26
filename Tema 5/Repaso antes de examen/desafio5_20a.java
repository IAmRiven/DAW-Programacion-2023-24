public class desafio5_20a {
    public static void main(String[] args) {
        String temperaturas[][] = new String[7][7]; // Siete porque son 7 dias de la semana
        temperaturas[0][0] = "lunes";
        temperaturas[0][1] = "martes";
        temperaturas[0][2] = "miercoles";
        temperaturas[0][3] = "jueves";
        temperaturas[0][4] = "viernes";
        temperaturas[0][5] = "sabado";
        temperaturas[0][6] = "domingo";
        double tempMax;
        double tempMin;
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Dime la temperatura máxima para " + temperaturas[0][i]);
            tempMax = Teclado.teclado.nextDouble();
            System.out.println("Dime la temperatura mínima para " + temperaturas[0][i]);
            tempMin = Teclado.teclado.nextDouble();
            temperaturas[1][i] = Double.toString(calcularTemperaturaMedia(tempMax, tempMin));
        }
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("La temperatura media de " + temperaturas[0][i] + " es " + temperaturas[1][i]);
        }
    }

    public static double calcularTemperaturaMedia(double tempMax, double tempMin) {
        double media = (tempMax + tempMin) / 2;
        return media;
    }
}

// Create a function that calculates the average temperature of
// a day by using the lower and upper temperature of this day.
// Create a main program asking to the user for a lower and upper
// temperature of each day and by using the function shows the average
// temperature.
//
// Cree una función que calcule la temperatura promedio de un día
// utilizando la temperatura superior e inferior de ese día.
// Cree un programa principal que solicite al usuario una temperatura
// superior e inferior para cada día y al usar la función muestra la temperatura
// promedio.