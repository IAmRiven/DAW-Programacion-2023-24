package Figuras;

import java.awt.Color;

public class ovalos extends figuras {
    private double x;
    private double y;
    private double ancho;
    private double alto;

    

    public ovalos(Color color, double x, double y, double ancho, double alto) {
        super(color);
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }

    public void print() {
        System.out.println(
                "Soy un óvalo que empieza en " + x + " y " + y + " con un ancho de " + ancho + " y un alto de " + alto
                        + " y un color de " + color);
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

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

}
