package UT5;

import java.util.ArrayList;


public class Challenge5_20d {
    public static void main(String[] args) {
        //calcular múltiplos de 16
        int numero=16;
        ArrayList<Integer> multiplos=new ArrayList<>();
        calcularMultiplos(numero, multiplos);
        
        for (Integer multiplo : multiplos) {
            for (int i = multiplo; i >0; i--) {
                Challenge5_20c.rellenarCaracteres(numero/multiplo,' ');
                Challenge5_20c.rellenarCaracteres(numero/multiplo,'*');
            }
            System.out.println("");
        }
    }
    public static void calcularMultiplos(int numero,ArrayList<Integer> multiplos ){
        
        for (int i = 1; i <= numero; i++) {
            if(numero%i==0)
            multiplos.add(i);
        }
    
    }
}
