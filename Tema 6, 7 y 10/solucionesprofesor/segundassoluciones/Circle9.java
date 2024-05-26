package UT6;

import java.text.DecimalFormat;

public class Circle9 {
    private double radius;
    private static int numbersOfCircle9=0;

    public double getRadius() {
        return radius;
    }

    public static int getNumbersOfCircle9() {
        return numbersOfCircle9;
    }

    public Circle9(float radius) {
        this.radius = radius;
        numbersOfCircle9++;
    }

    protected double calcularPerimetro(){
        return (2*Math.PI*radius);
    }

    protected double calcularArea(){
        return (Math.PI*Math.pow(radius, 2));
    }
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("#.##");
        System.out.println("Número de Círculos: "+numbersOfCircle9);
        Circle9 circle1=new Circle9(3);
        Circle9 circle2=new Circle9(4);
        System.out.println("Número de Circulos: "+numbersOfCircle9);
        System.out.println("Perímetro del círculo 1: "+formato.format(circle1.calcularPerimetro()));
        System.out.println("Área del círculo 1: "+formato.format(circle1.calcularArea()));
        System.out.println("Perímetro del círculo 2: "+formato.format(circle2.calcularPerimetro()));
        System.out.println("Área del círculo 2: "+formato.format(circle2.calcularArea()));


    }
}
