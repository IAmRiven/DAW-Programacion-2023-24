public class Personas extends Seresvivos {
    private String dni;

    public Personas(String nombre, int edad, String especie) {
        super(nombre, edad, especie);
    }

    public String getDni() {
        return dni;
    }
}
