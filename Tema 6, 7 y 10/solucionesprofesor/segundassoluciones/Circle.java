package UT6;

import java.text.DecimalFormat;

public class Circle {
    double radius;
    static int numbersOfCircle=0;

    public Circle(double radius) {
        this.radius = radius;
        numbersOfCircle++;
    }

   public double calcularPerimetro(){
        return (2*Math.PI*radius);
    }

    public double calcularArea(){
        return (Math.PI*Math.pow(radius, 2));
    }
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("#.##");
        System.out.println("Número de Círculos: "+Circle.numbersOfCircle);
        Circle circle1=new Circle(3);
        Circle circle2=new Circle(4);
        System.out.println("Número de Circulos: "+Circle.numbersOfCircle);
        System.out.println("Perímetro del círculo 1: "+formato.format(circle1.calcularPerimetro()));
        System.out.println("Área del círculo 1: "+circle1.calcularArea());
        System.out.println("Perímetro del círculo 2: "+circle2.calcularPerimetro());
        System.out.println("Área del círculo 2: "+circle2.calcularArea());


    }
}
