package UT5;
// Create a function that calculates the average temperature of a day by using the lower and upper temperature of this day.
// Create a main program asking to the user for a lower and upper temperature of each day and by using the function shows the average temperature.
// Repeat the program 7 times.

import java.util.Scanner;

public class Challenge5_20a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[][] temperaturaSemana=new String[7][7];
        temperaturaSemana[0][0]="lunes";
        temperaturaSemana[0][1]="martes";
        temperaturaSemana[0][2]="miércoles";
        temperaturaSemana[0][3]="jueves";
        temperaturaSemana[0][4]="viernes";
        temperaturaSemana[0][5]="sábado";
        temperaturaSemana[0][6]="domingo";


        double min;
        double max;
        for (int i=0;i<7;i++) {
            System.out.println("Temperatura mínima para "+temperaturaSemana[0][i]);
            min=sc.nextDouble();
            System.out.println("Temperatura maxima para "+temperaturaSemana[0][i]);
            max=sc.nextDouble();
            temperaturaSemana[1][i]=Double.toString(temperaturaMedia(min,max)); 
        }
        for (int i = 0; i < temperaturaSemana.length; i++) {
            System.out.println(temperaturaSemana[0][i]+ ", temperatura media: "+temperaturaSemana[1][i]+" \u00B0"+"C");
        }
        sc.close();

    }
    public static double temperaturaMedia(double max, double min){
        return((max+min)/2);
    }
}
