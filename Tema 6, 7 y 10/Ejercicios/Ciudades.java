public class Ciudades {
    String nombre;
    String pais;
    int habitantes;

    public Ciudades(String nombre, String pais, int habitantes) {
        this.nombre = nombre;
        this.pais = pais;
        this.habitantes = habitantes;
    }

    public String toString() { 
        return nombre + " su pais es "+ pais + " y tiene " + habitantes + " habitantes.";
    }
    public static void main(String[] args) {
        Ciudades Ciudades_1 = new Ciudades("Madrid", "España", 10000);
        Ciudades Ciudades_2 = new Ciudades("Quito", "Ecuador", 15000);
        Ciudades Ciudades_3 = new Ciudades("Atenas", "Grecia", 6000);

        System.out.println(Ciudades_1);
        System.out.println(Ciudades_2);
        System.out.println(Ciudades_3);

    }


}
// Create a new class to store cities.
// Store the name, the country and number of habitants.
// Create a constructor for this class.
// Create 2 cities (objects belonging to this class).
// Print each one of this cities (in a nice way).