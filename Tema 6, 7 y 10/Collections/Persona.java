package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;
    private int altura;

    public Persona(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAltura() {
        return altura;
    }

    // Constructor, getters y setters
    @Override
    public int compareTo(Persona otraPersona) {
        return this.edad - otraPersona.getEdad();
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre +
                "\n Edad: " + edad +
                "\n Altura: " + altura;
    }

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Manolo", 40, 120));
        personas.add(new Persona("Paco", 30, 160));
        personas.add(new Persona("Jose", 20, 200));
        personas.add(new Persona("Nieves", 10, 300));
        personas.add(new Persona("Marta", 70, 190));
        personas.add(new Persona("Manoli", 90, 450));

        Collections.sort(personas);

        // Collections.sort(personas, new ComparadorPersonaPorNombre());

        Collections.sort(personas, new ComparadorPersonaPorAltura());
        // Collections.reverse(personas);

        System.out.println(personas);
    }

}
