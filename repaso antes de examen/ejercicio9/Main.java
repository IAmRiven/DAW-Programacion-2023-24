package ejercicio9;

public class Main {
    public static void main(String[] args) {
        Circulos circulo_1 = new Circulos(3);
        System.out.println("El perimetro de circulo 1 es: " + circulo_1.CalcularPerimetro() + " y área: "
                + circulo_1.CalcularArea());
        System.out.println("Circulo numero: " + Circulos.getContador());

        Circulos circulo_2 = new Circulos(4);
        System.out.println("El perimetro de circulo 2 es: " + circulo_2.CalcularPerimetro() + " y área: "
                + circulo_2.CalcularArea());
        System.out.println("Circulo numero: " + Circulos.getContador());
    }
}
