package UT5;
// Create an ArrayList of Strings to store whatever you want and add some elements.
// Show the elements contained in the ArrayList.
// Insert an element in the third position.
// Show the elements contained in the ArrayList.
// b)
// Show the element in the first position.
// c)
// Remove the first element in the ArrayList.
// Show the elements contained in the ArrayList.
// d)
// Change the element in the last position by another one.
// Show the elements contained in the ArrayList.

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge5_12 {
    public static void main(String[] args) {
        //a
        ArrayList<String> elementos=new ArrayList<>();
        rellenarArrayList(elementos);
        System.out.println(elementos);
        elementos.add(2,"prueba");
        System.out.println(elementos);
        //b
        System.out.println("Primer elemento: "+elementos.get(0));
        //c
        elementos.remove(0);
        System.out.println(elementos);
        //d
        elementos.set(elementos.size()-1,"fin");
        System.out.println(elementos);
        
    }
    public static void rellenarArrayList(ArrayList<String> elementos){
    String elemento="";
    Scanner sc=new Scanner(System.in);
    while (true) {
        System.out.print("Introduce elemento: ");
        elemento=sc.nextLine();
        if(elemento.isEmpty()){
            break;
        }
        elementos.add(elemento);  
    } 
    sc.close();
    }
}
