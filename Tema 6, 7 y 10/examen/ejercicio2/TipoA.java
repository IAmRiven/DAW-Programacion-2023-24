public class TipoA extends Empleado implements CalcularCostes {
    private int salario_base = 40000;
    private int bonificador = 6000;

    public TipoA(String nombre_completo, int edad, String dni) {
        super(nombre_completo, edad, dni);

    }

    @Override
    public double CosteTotalEmpleado() {
        return salario_base + bonificador;
    }

    @Override
    public double CalcularImpuestoAnual() {
        return CosteTotalEmpleado() * 0.2;
    }

}
