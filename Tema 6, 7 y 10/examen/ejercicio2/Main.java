import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CalcularCostes> lista_empleados = new ArrayList<>();
        lista_empleados.add(new TipoA("Manolo", 23, "23482542C"));
        lista_empleados.add(new TipoA("David", 19, "2342352C"));
        lista_empleados.add(new TipoC("Jose", 15, "234242C"));
        lista_empleados.add(new TipoC("Maria", 25, "DW3234242C"));
        lista_empleados.add(new TipoB("Marisa", 54, "DWCWCC", 150));
        lista_empleados.add(new TipoB("Paco", 23, "DW32342DWCW3", 200));
        double costes = 0;
        double impuestos = 0;
        for (CalcularCostes calcularCostes : lista_empleados) {
            costes = costes + calcularCostes.CosteTotalEmpleado();
            impuestos = impuestos + calcularCostes.CalcularImpuestoAnual();
        }
        System.out.println("****************** RESULTADO *****************");
        System.out.println("Costo total de empleado: " + costes + " euros");
        System.out.println("Total de impuestos a liquidar: " + impuestos + " euros");
        System.out.println("************************************");
    }
}