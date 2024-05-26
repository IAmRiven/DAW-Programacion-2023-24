import java.util.ArrayList;

public class ComandoUndo implements Comando {
    ArrayList<Line> lista_lineas_movimientos;
    int movimiento;

    public ComandoUndo(ArrayList<Line> lista_lineas_movimientos, int movimiento) {
        this.lista_lineas_movimientos = lista_lineas_movimientos;
        this.movimiento = movimiento;
    }

    @Override
    public void excute() {
        for (Line linea : lista_lineas_movimientos) {
            linea.mover(movimiento);
        }
    }

    @Override
    public void undo() {
        for (Line linea : lista_lineas_movimientos) {
            linea.mover(-movimiento);
        }
    }

}