package UT5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Collections;

public class Challenge5_15 {
    public static void main(String[] args) {
        int numbers[]=new int[50];
        Challenge5_6.rellenarArrayPositivos(numbers);
        System.out.println("Array: "+Arrays.toString(numbers));
        mostrarDuplicados(numbers);
    }
    public static void mostrarDuplicados(int[] array){
        HashSet<Integer> duplicados=new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]==array[j]){
                    duplicados.add(array[i]);
                    break;
                }
            }
        }
        System.out.println(duplicados);
    }
}
