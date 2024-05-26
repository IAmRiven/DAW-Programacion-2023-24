
//import java.awt.BasicStroke;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

//import java.awt.Graphics;
//import java.awt.Graphics2D;
//Clase para las figuras geométricas
public abstract class GeometricalFigure {
    protected Color color;
    protected static int zoom = 1;
    protected static int grosor = 1;

    public GeometricalFigure(Color color) {
        this.color = color;
    }

    public abstract void print();

}

// Clase para rectángulos
class Rectangle extends GeometricalFigure implements Drawable {
    private int x, y, width, height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void print() {
        System.out.println("I am a RECTANGLE starting in " + x + "," + y + " and a width of " + width
                + " and a height of " + height);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(grosor));
        g2d.setColor(color);
        g2d.drawRect(x, y, width + zoom, height + zoom);
    }

    public void moverDerecha() {
        x = x + 5;
    }

    public void moverIzquierda() {
        x = x - 5;
    }

}

// Clase para líneas
class Line extends GeometricalFigure implements Drawable {
    private int x1, y1, x2, y2;

    public Line(Color color, int x1, int y1, int x2, int y2) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void print() {
        System.out.println("I am a LINE starting in " + x1 + "," + y1 + " and ending in " + x2 + "," + y2);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(grosor));
        g2d.setColor(color);
        g2d.drawLine(x1, y1, x2, y2);
    }

    public void moverDerecha() {
        x1 = x1 + 5;
        x2 = x2 + 5;
    }

    public void moverIzquierda() {
        x1 = x1 - 5;
        x2 = x2 - 5;
    }

}

// Clase para líneas
class Triangle extends GeometricalFigure implements Drawable {
    private int x1, y1, x2, y2, x3, y3;

    public Triangle(Color color, int x1, int y1, int x2, int y2, int x3, int y3) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public void print() {
        System.out.println("HOLA");
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(grosor));
        int[] posX = { x1 - zoom, x2 + zoom, x3 };
        int[] posY = { y1 + zoom, y2 + zoom, y3 };

        g2d.drawPolygon(posX, posY, 3);
        g2d.setColor(color);
    }

    public void moverDerecha() {
        x1 = x1 + 5;
        x2 = x2 + 5;
        x3 = x3 + 5;

    }

    public void moverIzquierda() {
        x1 = x1 - 5;
        x2 = x2 - 5;
        x3 = x3 - 5;

    }

}

// Clase para líneas
class Oval extends GeometricalFigure implements Drawable {
    private int x, y, ancho, alto;

    public Oval(Color color, int x, int y, int ancho, int alto) {
        super(color);
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }

    public void print() {
        System.out.println("");
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(grosor));
        g2d.setColor(color);
        g2d.drawOval(x, y, ancho + zoom, alto + zoom);
    }

    public void moverDerecha() {
        x = x + 5;
    }

    public void moverIzquierda() {
        x = x - 5;
    }

}
