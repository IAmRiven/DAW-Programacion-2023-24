package ejercicio6;

public class Persona {
    private String nombre;
    private int edad;
    private static Persona presidente;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona getPresidente() {
        return presidente;
    }

    @Override
    public String toString() {

        return nombre + " " + edad + " años.";
    }

    public static void setPresidente(String nombre, int edad) {
        presidente = new Persona(nombre, edad);
    }

    public static void MostrarPresidente() {
        System.out.println("El presidente es: " + presidente.nombre + ".");
    }
}

// Modify the class Person created previously to store who is going to be the
// president of all
// persons (the president is going to be another person).
// Create a method to set the president and another method to print who the
// president is.
