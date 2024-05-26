package ejercicio9;

public class Circulos {
    private int radio;
    private static int contador; // Contador para ir contabilizando los circulos.

    // private static final double PI = 3.14;

    public Circulos(int radio) {
        this.radio = radio;
        contador++;
    }

    public int getradio() {
        return radio;
    }

    public void setradio(int radio) {
        this.radio = radio;
    }

    public static int getContador() {
        return contador;
    }

    public double CalcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double CalcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

}
