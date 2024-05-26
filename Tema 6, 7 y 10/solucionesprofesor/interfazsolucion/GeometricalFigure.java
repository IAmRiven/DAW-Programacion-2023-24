package UT6R;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

//Clase para las figuras geométricas
abstract class GeometricalFigure {
    

    protected Color color;
    public static int thickness=4;
    public static int zoom=0;

    public GeometricalFigure(Color color) {
        this.color = color;
    }

    abstract void print();

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
    public void moverDerecha(){
        x=x+10;
    }
    public void moverIzquierda(){
        x=x-10;
    }


    public void draw (Graphics g){
        Graphics2D g2d = (Graphics2D) g; // Convertimos Graphics a Graphics2D
        g2d.setStroke( new BasicStroke(thickness));
        g.setColor(color);
        g.drawRect(x, y, width+zoom, height+zoom);
    }

    public void print() {
        System.out.println("I am a RECTANGLE starting in " + x + "," + y + " and a width of " + width + " and a height of " + height);
    }
}

// Clase para líneas
class Line extends GeometricalFigure implements Drawable {
    private int x1, y1, x2, y2;

    public Line(Color color, int x1, int y1, int x2, int y2) {
        super(color);
        this.x1 = x1
        ;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public void print() {
        System.out.println("I am a LINE "+this.color.toString()+" starting in " + x1 + "," + y1 + " and ending in " + x2 + "," + y2);
    }

    public void draw (Graphics g){
        Graphics2D g2d = (Graphics2D) g; // Convertimos Graphics a Graphics2D
        g2d.setStroke( new BasicStroke(thickness));
        g.setColor(color);
        if (y1==y2){
            //horizontales
            g.drawLine(x1, y1, x2+zoom, y2);

        }else if(x1==x2)
        {
            //verticales
            g.drawLine(x1, y1, x2, y2+zoom);
        }else{
            g.drawLine(x1, y1, x2+zoom, y2);

        }
        
    }
    public void moverDerecha(){
        this.x1=this.x1+10;
        this.x2=this.x2+10;
    }    
    public void moverIzquierda(){
        this.x1=this.x1-10;
        this.x2=this.x2-10;
    }

}

// Define a class for triangles
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

    @Override
    public void print() {
        System.out.println("I am a TRIANGLE with vertices at (" + x1 + "," + y1 + "), (" + x2 + "," + y2 + "), and (" + x3 + "," + y3 + ") painted in " + color);
    }
    public void draw(Graphics g){
        int[] xPoints = {x1-zoom, x2+zoom, x3};
        int[] yPoints = {y1+zoom, y2+zoom, y3};
        g.setColor(color);
        g.drawPolygon(xPoints, yPoints, 3);
        //g.fillPolygon(xPoints, yPoints, 3);
    }
    @Override
    public void moverIzquierda() {
        x1=x1-10;
        x2=x2-10;
        x3=x3-10;
        
    }
    public void moverDerecha(){
        x1=x1+10;
        x2=x2+10;
        x3=x3+10;
    }


}

// Clase para óvalos
class Oval extends GeometricalFigure implements Drawable {
    private int x, y, width, height;

    public Oval(Color color, int x, int y, int width, int height) {
        super(color);
        this.x = x;
        this.y = y;
        this.width = width+zoom;
        this.height = height+zoom;
    }

    @Override
    public void print() {
        System.out.println("I am an OVAL with center at " + x + "," + y + " and a width of " + width + " and a height of " + height + " painted in " + color);
    }
    public void draw(Graphics g){
        g.setColor(Color.GREEN);
        g.drawOval(x, y, width+zoom, height+zoom);
        //g.fillOval(x,y,width,height);

    }
    public void moverDerecha(){
        this.x=this.x+10;
    }
    public void moverIzquierda(){
        x=x-10;
    }



}

