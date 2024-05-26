package ejercicio6;

public class Main {
    public static void main(String[] args) {
        Persona ana = new Persona("Ana Villa", 23);
        Persona raul = new Persona("Raúl Rodríguez", 43);
        Persona jose = new Persona("Jose López", 45);

        System.out.println(jose);
        System.out.println(raul);
        System.out.println(ana);

        Persona.setPresidente("Rubén", 23);
        Persona.MostrarPresidente();
    }
}
