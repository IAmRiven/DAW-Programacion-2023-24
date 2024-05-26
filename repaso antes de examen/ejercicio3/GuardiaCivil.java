package ejercicio3;
public class GuardiaCivil {
    private int altura;
    private String nombre;

    public GuardiaCivil(int altura, String nombre) {
        this.altura = altura;
        this.nombre = nombre;
    }

    public boolean PuedeSer() {
        if (this.altura >= 160) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        if (PuedeSer()) {
            return this.nombre + " puede ser guardia civil";
        } else {

            return this.nombre + " no puede ser guardia civil";
        }
    }
}
