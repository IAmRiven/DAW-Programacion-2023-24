package UT5;

import java.util.Arrays;


public class Challenge5_10 {
    public static void main(String[] args) {
        int[] numbers={3,1,5,7,9,11,13};//igual a numbers2 pero distinto orden
        int[] numbers2={1,3,5,7,9,11,13};
        int[] numbers3={1,3,5,8,10,12,14};//Diferente a numbers y numbers2
        int[] numbers4=new int[7];
        
        System.out.println("Array: "+Arrays.toString(numbers));
        System.out.println("Array2: "+Arrays.toString(numbers2));
        System.out.println(Arrays.equals(numbers, numbers2));
        System.out.println("Ordenar array y array2");
        Arrays.sort(numbers);
        Arrays.sort(numbers2);
        System.out.println("Array : "+Arrays.toString(numbers));
        System.out.println("Array 2: "+Arrays.toString(numbers2));
        System.out.println("Array 3:"+Arrays.toString(numbers3));
        System.out.println("Comparar Array y Array2");
        System.out.println(Arrays.equals(numbers, numbers2));
        System.out.println("Mostrar elementos distintos: ");
        System.out.println("Array2 y Array3");
        mostrarDistintos(numbers2, numbers3);
        System.out.println("Array2 y Array");
        mostrarDistintos(numbers2, numbers);
        Arrays.fill(numbers4,32);
        System.out.println(Arrays.toString(numbers4));
    }
    public static void mostrarDistintos(int[] array, int array2[]){
    if(!Arrays.equals(array, array2))
        for (int index = 0; index < array.length; index++) {
            if(array[index]!=array2[index])
            {
                System.out.println("Los elementos en la posición "+index+ " son distintos: "+array[index]+","+array2[index]);
            }
        }
    else{
        System.out.println("Los arrays son iguales");
    }
}
}
