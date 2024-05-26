package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Persona paco = new Persona("Paco", 23);
        Persona manuel = new Persona("Manuel", 12);
        Persona jose = new Persona("Jose", 34);
        Persona juan = new Persona("Juan", 34);

        paco.CompararEdad(manuel);
        jose.CompararEdad(manuel);
        paco.CompararEdad(jose);
        juan.CompararEdad(jose);
    }
}
