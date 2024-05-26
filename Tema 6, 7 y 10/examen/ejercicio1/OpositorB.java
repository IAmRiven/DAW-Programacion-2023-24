public class OpositorB extends Opositor {
    private double puntuacion;

    public OpositorB(String nombre_completo, int edad, String dni, int experiencia, int oposiciones_aprobadas,
            double nota_examen) {
        super(nombre_completo, edad, dni, experiencia, oposiciones_aprobadas, nota_examen);
        puntuacion = this.CalcularPuntuacion();
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public void print() {
        System.out
                .println("Opositor[B]: " + getNombre_completo() + ", Edad: " + getEdad() + ", DNI: " + getDni()
                        + ", Años de experiencia: " + getExperiencia() + ", Oposiciones aprobadas: "
                        + getOposiciones_aprobadas() + ", Nota de examen: " + getNota_examen() + ", Puntuación total: "
                        + puntuacion);
    }

    @Override
    public double CalcularPuntuacion() {
        int opo_aprobadas = this.getOposiciones_aprobadas() * 1;
        int anyo_exp = this.getExperiencia() * 1;
        double nota = this.getNota_examen();
        return ((nota * 0.5 + (anyo_exp * 0.25)) + (opo_aprobadas * 0.25) + 0.5);
    }

    @Override
    public double ObtenerPuntuacion() {
        return puntuacion;
    }

}
