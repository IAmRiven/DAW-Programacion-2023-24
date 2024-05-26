public class Perros extends Seresvivos {
    private int numeroChip;

    public int getNumeroChip() {
        return numeroChip;
    }

    public void setNumeroChip(int numeroChip) {
        this.numeroChip = numeroChip;
    }

    public Perros(String nombre, int edad, String especie, int numeroChip) {
        super(nombre, edad, especie);
        this.numeroChip = numeroChip;
    }
}
