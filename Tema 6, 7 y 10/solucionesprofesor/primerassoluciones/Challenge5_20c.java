package UT5;

public class Challenge5_20c {
    public static void main(String[] args) {
        for (int index = 10; index >0; index--) {
            rellenarCaracteres(index, '*');
            
            
        }
  


    }
    public static void rellenarCaracteres(int numero, char caracter){
        for (int index = 1; index <= numero; index++) {
            System.out.print(caracter);
        }
        System.out.println("");
    }


}
