package UT6R;
//import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//Clase para las figuras geométricas
public abstract class GeometricalFigure {
    protected Color color;

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
        System.out.println("I am a RECTANGLE starting in " + x + "," + y + " and a width of " + width + " and a height of " + height);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawRect(x, y, width, height);
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
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }


}




