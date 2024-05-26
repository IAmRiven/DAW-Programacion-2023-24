package ejercicio1;

public class Ciudades {
    private String name;
    private String country;
    private int habitants;

    public Ciudades(String name, String country, int habitants) {
        this.name = name;
        this.country = country;
        this.habitants = habitants;
    }

    @Override
    public String toString() {
        return "Ciudad: " + name + " País: " + country + " habitantes: " + habitants;
    }
}
