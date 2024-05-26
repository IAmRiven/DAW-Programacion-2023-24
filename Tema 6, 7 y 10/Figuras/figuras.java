package Figuras;

import java.util.ArrayList;
import java.awt.Graphics; 
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

abstract class figuras {
    Color color;
    static ArrayList<figuras> figuras;
    
    public figuras(Color color) {
        this.color = color;
        figuras = new ArrayList<>();
    }

    abstract void print();

    public static void addFigura(figuras figura) {
        figuras.add(figura);
    }

    public static void recorrer() {
        for (figuras recorrer_figuras : figuras) {
            recorrer_figuras.print();
        }
    }

    public static void main(String[] args) {
        addFigura(new linea(Color.BLACK, 20, 120, 60, 120));
        addFigura(new linea(Color.BLACK, 20, 130, 60, 130));
        addFigura(new rectangulo(Color.BLUE, 20, 50, 100, 30));
        addFigura(new rectangulo(Color.RED, 20, 100, 100, 30));
        recorrer();
    }
}