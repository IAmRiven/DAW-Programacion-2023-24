package Figuras;

import java.awt.Color;
import java.awt.Graphics;
public class rectangulo extends figuras implements Drawable  {
    private double x;
    private double y;
    private double ancho;
    private  double alto;

    public rectangulo(Color color, double x, double y, double ancho, double alto) {
        super(color);
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
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

    public void print() {
        System.out.println("I am a RECTANGLE starting in " + x + "," + y + " and a width of " + ancho + " and a height of " + alto);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawRect(x, y, ancho, alto);
    }

}

// Vamos a crear "figuras geométricas 2D".
// Vamos a empezar a tener "rectángulos" y "líneas".
// Un rectángulo está definido por el punto inicial (coordenadas x e y) para la
// esquina superior izquierda y el ancho y alto.
// Una recta está definida por 2 puntos cada uno con coordenadas xey (digamos
// x1, y1 y x2, y2).
// Todas las "figuras geométricas 2D" tienen un color.
// Agregue un método "imprimir" para decir algo similar a:
// "Soy un RECTÁNGULO que empieza en 10,10 y un ancho de 100 y un alto de 70"
// "Soy una LÍNEA que empieza en 25,13 y termina en 45,76".
// Crea un ArrayList y agrégale diferentes figuras.
// Recorra las figuras en ArrayList y para cada una, llame al método "imprimir".
// b)
// Llame a la clase principal para la figura "Figuras geométricas 2D" usando el
// menú "Refactor > Cambiar nombre...".
// Declare el método print "abstracto" en la clase principal (para figuras
// geométricas 2D). Esto significa que el método no está definido en esta clase
// (está pendiente de definirse en las clases hijas), pero, si quieres heredar
// de esta clase estás obligado a agregar e implementar el método print.
// Intente crear un Objeto de la clase "Figura". ¿Lo que sucede?
// Crea una nueva clase para triángulos. ¿Te obliga a crear el método de
// impresión?