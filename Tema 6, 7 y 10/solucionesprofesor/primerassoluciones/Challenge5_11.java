package UT5;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge5_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> nombres=new ArrayList<>();
        String nombre="";
        while (true) {
            System.out.print("Introduce nombre: ");
            nombre=sc.nextLine();
            if(nombre.isEmpty()){
                break;
            }
            nombres.add(nombre);  
        }

        sc.close();
        System.out.println("Nombres: "+nombres);
        
        
        
        
        // do {
        //     System.out.print("Introduce nombre: ");
        //     nombre=sc.nextLine();
        //      if(!nombre.isEmpty()){
        //       nombres.add(nombre);
        //       }
    
        // } while(!nombre).isEmpty());

    }
    
    
}
