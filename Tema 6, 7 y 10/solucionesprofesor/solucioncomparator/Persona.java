public class Persona extends SerVivo {
    String dni;

    public Persona(String nombre, String especie, int edad, String dni) {
        super(nombre, especie, edad);
        this.dni = dni;
    }

    @Override
    public String toString() {

        return super.toString()+"Persona [dni=" + dni + "]";
    }
    
    
    
}
