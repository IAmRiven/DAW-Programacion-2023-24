package UT5;
// Create an array with some elements.
// Create an empty array with the same number of elements and duplicate the first array in the second one.
// Use the function created in 5.3 to show the elements of the second array.
// b) 
// Instead of duplicating the array, reverse the elements in the array. For example, if our first array has the following elements:
// 1, 5, 3, 4, 9
// The second array should have the same elements but in the reverse order:
// 9, 4, 3, 5, 1


public class Challenge5_6 {
    public static void main(String[] args) {
        int[] numbers=new int[10];
        rellenarArray(numbers);
        System.out.print("Array: ");
        Challenge5_3.mostrarElementos(numbers);
        System.out.print("Copia: ");
        Challenge5_3.mostrarElementos(duplicarArray(numbers));
        System.out.print("Array invertido: ");
        Challenge5_3.mostrarElementos(reverseArray(numbers));
    }
    public static void rellenarArray(int[] numbers){
        for (int index = 0; index < numbers.length; index++) {
            numbers[index]=(int)(Math.random()*100)+1;
          }
    }
    public static int[] duplicarArray(int[] original){
         int[] copia=new int[original.length];
        for (int index = 0; index < original.length; index++) {
           copia[index]=original[index];
        }
        return(copia);
    }
    public static int[] reverseArray(int[] original){
        int[] copia=new int[original.length];
        int longitud=original.length-1;
        for (int i = 0; i < original.length; i++) {
            copia[longitud-i]=original[i];
        }
        return(copia);  
    }
    
}
