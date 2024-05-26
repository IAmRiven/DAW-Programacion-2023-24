package UT6;

public class Prueba9 {
    public static void main(String[] args) {
        Circle9 circulo=new Circle9(4);
        System.out.println(circulo.getRadius());
        System.out.println(Circle9.getNumbersOfCircle9());
        Circle9 circulo2=new Circle9(5);
        System.out.println(circulo2.getRadius());
        System.out.println(Circle9.getNumbersOfCircle9());
        System.out.println(circulo2.calcularArea());
        
    }
    
    
}
