package ejercicio4;
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void CompararEdad(Persona p1) {
        if (this.edad > p1.edad) {
            System.out.println(this.nombre + " es mayor que " + p1.nombre);
        } else if (this.edad == p1.edad) {
            System.out.println(this.nombre + " tiene la misma edad " + p1.nombre);
        } else {
            System.out.println(this.nombre + " es menor que " + p1.nombre);
        }
    }
}
