package UT5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Challenge5_14 {
    public static void main(String[] args) {
        ArrayList<Double> calificaciones=new ArrayList<>();
        insertarCalificaciones(calificaciones);
        System.out.println("Calificaciones del estudiante: "+calificaciones);
        System.out.println("Media de calificaciones: "+calcularMedia(calificaciones));
        if(!calificaciones.isEmpty()){
            System.out.println("Nota máxima: "+Collections.max(calificaciones));
            System.out.println("Nota mínima: "+Collections.min(calificaciones));
        }
    }
    public static double calcularMedia(ArrayList<Double> calificaciones){
        double suma=0;
        if (calificaciones.isEmpty()){
            return(0);
        }else{
            for (double calificacion : calificaciones) {
                //suma+=calificacion;
                suma=suma+calificacion;
            }
            return (suma/calificaciones.size());
        }

    }
    public static void insertarCalificaciones(ArrayList<Double> calificaciones){
        Scanner sc=new Scanner(System.in);
        double calificacion;
        while(true){
            System.out.print("Introduce calificación (otro valor para terminar): ");
            if(sc.hasNextDouble()) //Mientras haya calificaciones que leer
            {
               calificacion=sc.nextDouble();//Leo la calificación
               if(calificacion>=0&&calificacion<=10)
               {
                calificaciones.add(calificacion);
               } else{
                System.out.println("Nota no válida");
               }
            }
            else{//Si no hay más calificaciones
                sc.close();
                break;
            }
  
        }

    }
}
