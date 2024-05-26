import java.text.DecimalFormat;

public class Circle {
    double radio;
    static double total_circles;

    public Circle(double radio) {
        this.radio = radio;
        total_circles++;
    }

    public double calculatePerimetro() {
        return (2 * Math.PI * radio);
    }

    public double calcularArea() {
        return (Math.PI * Math.pow(radio, 2));
    }

    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("##.##");
        System.out.println("Total de circulos antes de crear: " + Circle.total_circles);
        Circle circulo_1 = new Circle(3);
        Circle circulo_2 = new Circle(4);
        System.out.println("Total de circulos despues de crear: " + Circle.total_circles);
        System.out.println("El perimetro del Circulo 1 es: " + formato.format(circulo_1.calculatePerimetro()));
        System.out.println("El área del Circulo 1 es: " + formato.format(circulo_1.calcularArea()));
        System.out.println("El perimetro del Circulo 2 es: " + formato.format(circulo_2.calculatePerimetro()));
        System.out.println("El área del Circulo 2 es: " + formato.format(circulo_2.calcularArea()));
    }

}

// Create a class to store Circles.
// A circle is defined by its radius.
// Create 2 circles with radius 3 and with radius 4 .
// Print the total numbers of circles before creating any circle and after
// creating the circles.
// Create a method to calculate the perimeter of the circle and a method to
// calculate the area of the circle.
// For the circle with radius 3 the area should be 28.27 and the perimeter
// 18.85, and for the circle with radius
// 4 the area should be 50.27 and the perimeter 25.13.
