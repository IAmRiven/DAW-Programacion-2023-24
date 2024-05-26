package UT6;
// Have a look to the class "Math". This is a predefined class in Java (it comes with Java when you use it), and have a lot of methods to perform different operations. With this class:
// a) Use the appropriate method to round this number 12.8765 to the closest integer (that is, 13).
// b) Calculate the absolute value of a number (the absolute value of 13 is 13 and the absolute value of -13 is 13).
// c) Calculate the square root of 48.
// d) Calculate 2 to the power of 10.
// Now by using the class Integer:
// e) Convert a String value to an int.

public class Challenge6_7 {
    public static void main(String[] args) {
        System.out.println("Redondear 12,8765: "+Math.round(12.8765));
        System.out.println("Valor absoluto de -13: "+Math.abs(-13));
        System.out.println("Raiz cuadrada de 48: "+Math.sqrt(25));
        System.out.println("2^10="+Math.pow(2, 10));
        String cadena="-1432";
        System.out.println("Sumo dos veces el string -1432="+(Integer.parseInt(cadena)+Integer.parseInt(cadena)));



    }
}
