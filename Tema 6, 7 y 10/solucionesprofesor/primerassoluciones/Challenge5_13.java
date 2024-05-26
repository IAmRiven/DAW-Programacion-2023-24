package UT5;

import java.util.ArrayList;
import java.util.Collections;
public class Challenge5_13 {
    
   public static void main(String[] args) {
    //a
    ArrayList<String> lenguajes=new ArrayList<>();
    lenguajes.add("Java");
    lenguajes.add("PHP");
    lenguajes.add("Phyton");
    lenguajes.add("C++");
    lenguajes.add("C#");
    lenguajes.add("Kotlin");
    System.out.println(lenguajes);
    Collections.sort(lenguajes);
    System.out.println(lenguajes);
    
    //b
    lenguajes.remove("Java");
    lenguajes.add(0, "Java");
    System.out.println(lenguajes);
    //c
    System.out.println("Índice de Kotlin: "+lenguajes.indexOf("Kotlin"));
    System.out.println("Posición de Kotlin: "+(int)(lenguajes.indexOf("Kotlin")+1));
    
    //d
    System.out.println("Lenguajes que contienen la letra \"o\"");

    for (String lenguaje : lenguajes) {
        if(lenguaje.contains("o"))
        {
            System.out.println(lenguaje);
        }
    }

    for (int index = 0; index < lenguajes.size(); index++) {
        //String elemento=lenguajes.get(index);
        if(lenguajes.get(index).contains("o")){
            System.out.println(lenguajes.get(index));
        }
    }

   } 
}
