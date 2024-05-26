public class ciudades {
    String ciudad;
    String pais;
    int habitantes;

    public ciudades(String ciudad, String pais, int habitantes) {
        this.ciudad = ciudad;
        this.pais = pais;
        this.habitantes = habitantes;
    }
    
    @Override
    public String toString() {
        return ciudad+", pais "+pais+" con "+habitantes+" habitantes.";
    }

    public static void main(String[] args) {
        ciudades ciudad_1 = new ciudades("Madrid", "España", 47000000);
        System.out.println(ciudad_1);
    }
    
    
}

// Create a new class to store cities.
// Store the name, the country and number of habitants.
// Create a constructor for this class.
// Create 2 cities (objects belonging to this class).
// Print each one of this cities (in a nice way).
