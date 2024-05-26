package Figuras;

import java.awt.Color;
import java.awt.Graphics;

public class linea extends figuras implements Drawable {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public linea(Color color, double x1, double y1, double x2, double y2) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }
    
    public void print() {
        System.out.println("I am a LINE starting in " + x1 + "," + y1 + " and ending in " + x2 + "," + y2);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
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