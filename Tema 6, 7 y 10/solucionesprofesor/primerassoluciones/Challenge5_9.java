package UT5;


public class Challenge5_9 {
    public static void main(String[] args) {
        int[] numbers=new int[20];
        Challenge5_6.rellenarArrayPositivos(numbers);
        Challenge5_3.mostrarElementos(numbers);
        mostrarBulkiest(numbers);
        
    }
    public static void mostrarBulkiest(int[] array){
        boolean bulkiest;
        for (int i = 0; i < array.length; i++) {
            bulkiest=true;//presupongo que es un bulkiest
            for (int j = i+1; j < array.length; j++) {
                if(array[j]>array[i]){
                    bulkiest=false;
                    break;
                }
            }
            if(bulkiest){
                System.out.println(array[i]+" is bulkiest");
            }
        }
    }
}
