public class Seresvivos implements Comparable<Seresvivos> {
    private String nombre;
    private int edad;
    private String especie;

    public Seresvivos(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public int compareTo(Seresvivos o) {
        if (o instanceof Perros) {
            return Integer.compare(this.edad, (o.edad * 7));
        } else {
            return Integer.compare(this.edad, o.edad);
        }
    }

    @Override
    public String toString() {
        if (this instanceof Perros) {
            return "\nNombre: " + nombre + "\nEdad: " + edad * 7 + "\nEspecie=: " + especie + "\n";

        } else {

            return "\nNombre: " + nombre + "\nEdad: " + edad + "\nEspecie=: " + especie + "\n";

        }
    }

}

// 2. Necesitamos tener en una lista objetos de la clase Persona y objetos de la
// clase Perro, además ordenaremos esa lista en función de la edad (edad
// humana equivalente en caso de los perros).
// Los atributos comunes que almacenaremos son:
//  Nombre
//  Raza
//  Edad
// Además, para los humanos almacenaremos su número de DNI y para los
// perros su número de Microchip.