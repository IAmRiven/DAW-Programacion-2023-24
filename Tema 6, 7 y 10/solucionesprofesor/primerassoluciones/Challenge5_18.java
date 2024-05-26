package UT5;

import java.util.HashMap;
import java.util.HashSet;

public class Challenge5_18 {
       public static void main(String[] args) {
        int numbers[]=new int[20];
        Challenge5_6.rellenarArrayPositivos(numbers);
        System.out.print("Array: ");
        Challenge5_3.mostrarElementos(numbers);
        mostrarDuplicados(numbers);
    }
    public static void mostrarDuplicados(int[] array){
        //Almaceno los números duplicados
        HashSet<Integer> duplicadosHS=new HashSet<>();        
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]==array[j]){
                    duplicadosHS.add(array[i]);
                    break;
                }
            }
        }
        //Recorro el HashSet
        int ocurrencias=0;
        HashMap<Integer,Integer> duplicadosHM = new HashMap<>();
        for (Integer clave : duplicadosHS) {
            for (int index = 0; index < array.length; index++) {
                if (array[index]==clave)
                {
                    ocurrencias++;
                }
            }
            duplicadosHM.put(clave,ocurrencias);
            ocurrencias=0;
        }//Mostrar elementos del HashMap (clave,valor) (número_repetido,ocurrencias)
        for (Integer clave : duplicadosHM.keySet()) {
            System.out.println("El número "+clave+ " se repite "+duplicadosHM.get(clave));

        }
    }
}
