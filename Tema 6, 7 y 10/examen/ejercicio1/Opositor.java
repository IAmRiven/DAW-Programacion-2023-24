public abstract class Opositor implements Comparable<Opositor> {
    private String nombre_completo;
    private int edad;
    private String dni;
    private int experiencia;
    private int oposiciones_aprobadas;
    private double nota_examen;

    public Opositor(String nombre_completo, int edad, String dni, int experiencia, int oposiciones_aprobadas,
            double nota_examen) {
        this.nombre_completo = nombre_completo;
        this.edad = edad;
        this.dni = dni;
        this.experiencia = experiencia;
        this.oposiciones_aprobadas = oposiciones_aprobadas;
        this.nota_examen = nota_examen;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getOposiciones_aprobadas() {
        return oposiciones_aprobadas;
    }

    public double getNota_examen() {
        return nota_examen;
    }

    public void setNota_examen(double nota_examen) {
        this.nota_examen = nota_examen;
    }

    public abstract void print();

    public abstract double CalcularPuntuacion();

    public abstract double ObtenerPuntuacion();

    @Override
    public int compareTo(Opositor o) {
        return Integer.compare(this.getEdad(), o.getEdad());
    }

    public void setOposiciones_aprobadas(int oposiciones_aprobadas) {
        this.oposiciones_aprobadas = oposiciones_aprobadas;
    }
}
