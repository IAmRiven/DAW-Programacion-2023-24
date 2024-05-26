package ejercicio11;

public class Main {
    public static void main(String[] args) {
        Circulos circulo1 = new Circulos(5);
        System.out.println("Necesitamos " + Litros.CalcularLitros(circulo1.CalcularArea()) + " litros de pintura");
    }
}
