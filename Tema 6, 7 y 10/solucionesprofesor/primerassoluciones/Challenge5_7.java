package UT5;

public class Challenge5_7 {
    public static void main(String[] args) {
        int[] numbers=new int[20];
        Challenge5_6.rellenarArray(numbers);
        System.out.print("Array: ");
        Challenge5_3.mostrarElementos(numbers);
        System.out.println("El valor máximo es: "+maximo(numbers));
        System.out.println("El valor mínimo es: "+minimo(numbers));
    }
    public static int maximo(int[] numbers){
        int maximo=numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]>maximo){
                maximo=numbers[i];
            }
        }
        return maximo;
    }
    public static int minimo(int[] numbers){
        int minimo=numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]<minimo){
                minimo=numbers[i];
            }
        }
        return minimo;
    }
    
}
