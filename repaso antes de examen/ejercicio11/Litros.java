package ejercicio11;

import java.awt.Color;

public class Litros extends Circulos {
    private Color color;
    private double litros;

    public Litros(int radio, Color color, double litros) {
        super(radio);
        this.color = color;
        this.litros = litros;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public static double CalcularLitros() {
        double litrosPorMetro = 1.5;

        return Circulos. * litrosPorMetro;
    }

}
// Cree una clase "tabla circular" heredando de la clase Círculo.
// Esta clase almacenará el color de la mesa, además de las cosas del círculo.
// Cree el constructor apropiado.
// Crea un método para calcular cuánta pintura se necesita para pintar la mesa
// circular.
// Para pintar la mesa necesitamos 1,5 litros de pintura por cada 1 metro
// cuadrado.
// En Circle, cambie el método para calcular el área, de manera que devuelva el
// área calculada.
// En "tabla circular" utilice el método para calcular el área para calcular la
// pintura necesaria.