package UT5;
public class Challenge5_3 {
    
    public static void main(String[] args) {
        int[] numbers= new int[7];
        for (int index = 0; index < numbers.length; index++) {
          numbers[index]=(int)(Math.random()*100)+1;

        }
        mostrarElementos(numbers);
    }
    public static void mostrarElementos(int[] numbers){
        for (int  number : numbers) {
            System.out.print(number+",");
            
        } 
        System.out.println("");

    }
}
