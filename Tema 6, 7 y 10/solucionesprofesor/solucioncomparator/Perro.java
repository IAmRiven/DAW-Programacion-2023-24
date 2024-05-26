public class Perro extends SerVivo {
    String microchip;

    public Perro(String nombre, String especie, int edad, String microchip) {
        super(nombre, especie, edad);
        this.microchip = microchip;
    }

    @Override
    public String toString() {
        return super.toString()+ "Perro [microchip=" + microchip + "]";
    }

    public int getEdadHumana(){
        return getEdad()*7;
    }
    
    
}
