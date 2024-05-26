

import java.util.ArrayList;

public class CuentaBancaria {

  private int saldo=0;
  private ArrayList<Integer> movimientos = new ArrayList<>();

  public int getSaldo() {
      return this.saldo;
  }
  public void ingresar(int importe) {
    saldo = saldo + importe;
    movimientos.add(importe);
  }
  public void retirar(int importe) {
    saldo = saldo - importe;
    movimientos.add(-importe);
  }
  public void print() {
    System.out.println("Saldo actual: "+saldo);
    System.out.println("Movimientos de la cuenta: ");
    for (int transaccion : movimientos) {
      System.out.println(transaccion);
    }
  }
  public static void main(String[] args) {

      CuentaBancaria vipAccount = new CuentaBancaria();
      vipAccount.ingresar(100);
      vipAccount.retirar(80);
      vipAccount.retirar(50);
      vipAccount.print();
    
  
  }
}

