public abstract class Empleado {
    private String nombre_completo;
    private int edad;
    private String dni;

    public Empleado(String nombre_completo, int edad, String dni) {
        this.nombre_completo = nombre_completo;
        this.edad = edad;
        this.dni = dni;
    }

}