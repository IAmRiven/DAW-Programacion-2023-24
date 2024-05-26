package UT6;

import java.text.DecimalFormat;

public class CircularTable extends Circle9 {
    private String color;
    
    public String getColor() {
        return color;
    }
    public CircularTable(float radius, String color) {
        super(radius);
        this.color=color;
    }
    public double CalculatePaint(){
        double area=calcularArea();
        return area*1.5;
    }
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("#.##");
        CircularTable mesa=new CircularTable(3, "roja");
        System.out.println("Hacen falta "+formato.format(mesa.CalculatePaint())+ " litros de pintura para pintar la mesa "+mesa.getColor());


    }

    
}
