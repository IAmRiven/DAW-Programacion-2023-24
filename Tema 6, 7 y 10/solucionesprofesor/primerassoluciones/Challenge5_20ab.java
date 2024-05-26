package UT5;
// Create a function that calculates the average temperature of a day by using the lower and upper temperature of this day.
// Create a main program asking to the user for a lower and upper temperature of each day and by using the function shows the average temperature.
// Repeat the program 7 times.

import java.util.HashMap;
import java.util.Scanner;

public class Challenge5_20ab {
    public static void main(String[] args) {
       HashMap<String,Double> semana= new HashMap<>();
       semana.put("lunes",null);
       semana.put("martes",null);
       semana.put("miércoles",null);
       semana.put("jueves",null);
       semana.put("viernes",null);
       semana.put("sábado",null);
       semana.put("domingo",null);

       
       Double min,max;
       Scanner sc=new Scanner(System.in);
       for (String dia : semana.keySet()) {
        System.out.print("Temperatura mínima para "+dia+": ");
        min=sc.nextDouble();
        System.out.print("Temperatura maxima para "+dia+": ");
        max=sc.nextDouble();
        semana.put(dia,(Double)temperaturaMedia(max,min));
        //semana.putIfAbsent(dia,(Double)temperaturaMedia(max,min));
       } 
       sc.close();

       for (String dia : semana.keySet()) {
        System.out.println("Temperatura media de "+dia+ " : "+semana.get(dia));
       }
    }
    public static double temperaturaMedia(double max, double min){
        return((max+min)/2);
    }
    

}
