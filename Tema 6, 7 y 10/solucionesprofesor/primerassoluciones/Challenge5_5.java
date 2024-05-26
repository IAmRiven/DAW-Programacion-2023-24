package UT5;

import java.util.Scanner;

public class Challenge5_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numbers[]={2,3,44,5,6,8,10,11,12,3};
        System.out.println("Introduce un número: ");
        int numero=sc.nextInt();
        sc.close();
        int posicion=buscarNumero(numbers, numero);
        if(posicion!=-1)
        {
            System.out.println("El número "+numero+ " se encudentra en la posición "+posicion);
        }else{
            System.out.println("El número "+numero+" no se encuentra en el Array");
        }
  
    }

    public static int buscarNumero(int[] numeros, int numero){
        int posicion=-1;
        for (int index = 0; index < numeros.length; index++) {
            if(numeros[index]==numero){
                posicion=index;
                break;
            } 
        }
        return posicion;

    }

    

}
