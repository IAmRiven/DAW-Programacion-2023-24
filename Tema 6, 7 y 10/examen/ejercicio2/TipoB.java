public class TipoB extends Empleado implements CalcularCostes {
    private int horas_trabajadas;

    public TipoB(String nombre_completo, int edad, String dni, int horas_trabajadas) {
        super(nombre_completo, edad, dni);
        this.horas_trabajadas = horas_trabajadas;

    }

    @Override
    public double CalcularImpuestoAnual() {
        return 0;
    }

    @Override
    public double CosteTotalEmpleado() {
        return horas_trabajadas * 15;
    }

}
