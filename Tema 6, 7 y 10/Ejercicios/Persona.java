public class Persona {
    private String nombre;
    private int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String toString () {
        return nombre + " tiene " + edad + " años.";
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
    public static void main(String[] args) {
        Persona persona_1 = new Persona("Alucin Rodríguez Manolo", 25);
        Persona persona_2 = new Persona("Manolo Toral López", 16);
        Persona persona_3 = new Persona("Manoli Rodríguez López", 65);

        // System.out.println(persona_1.nombre+"-"+persona_1.edad);
        // System.out.println(persona_2.nombre+"-"+persona_2.edad);
        // System.out.println(persona_3.nombre+"-"+persona_3.edad);

        System.out.println(persona_1); // Esto está mal (Tenemos que declarar primero el String toString).
        System.out.println(persona_2);
        System.out.println(persona_3);
    }
    
}


// Create a new class to store cities.
// Store the name, the country and number of habitants.
// Create a constructor for this class.
// Create 2 cities (objects belonging to this class).
// Print each one of this cities (in a nice way).
