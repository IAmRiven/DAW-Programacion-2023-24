package Figuras;
import java.awt.Color;

public class triangulos extends figuras {
    private double x;
    private double y;
    private double a;

    public triangulos(Color color, double x, double y, double a) {
        super(color);
        this.x = x;
        this.y = y;
        this.a = a;
    }

    public void print() {
        System.out.println(
                "Soy un " + nombre + " con las coordenadas: " + x + ", " + y + " y " + a + " y color " + color);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

}
