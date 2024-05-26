public class TipoC extends Empleado implements CalcularCostes {

    private int salario_base = 45000;
    private int seguro = 2500;
    private int bono = 4000;

    public TipoC(String nombre_completo, int edad, String dni) {
        super(nombre_completo, edad, dni);

    }

    @Override
    public double CosteTotalEmpleado() {
        return salario_base + seguro + bono;

    }

    @Override
    public double CalcularImpuestoAnual() {
        return (salario_base + bono) * 0.1;
    }

}
