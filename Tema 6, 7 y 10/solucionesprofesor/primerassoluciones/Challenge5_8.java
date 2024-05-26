package UT5;

public class Challenge5_8 {
    public static void main(String[] args) {
        int numbers[]=new int[40];
        Challenge5_6.rellenarArrayPositivos(numbers);
        System.out.print("Array: ");
        Challenge5_3.mostrarElementos(numbers);
        mostrarDuplicados(numbers); 
    }
    public static void mostrarDuplicados(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]==array[j]){
                    System.out.println("El elemento "+array[i]+ " está duplicado");
                    break;
                }
            } 
        }
    }
}
